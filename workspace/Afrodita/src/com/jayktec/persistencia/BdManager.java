package com.jayktec.persistencia;

import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.logging.*;

import com.jayktec.controlador.Constantes;
import com.jayktec.controller.*;
import com.jayktec.xyzOlympus.models.*;

public class BdManager {
	static Conexion conexion = new Conexion();
	static Connection connection = conexion.getConexion();
	static ArrayList<Catalogo> listaCatalogos;
	static ArrayList<Tabla> listaTablas;

	public static void main(String[] args) throws SQLException {

		System.out.println("prueba bdmanager");
		Sensor sensor = buscarSensor("4028b8816153e69d016153eb61680005");

		ArrayList<Registro> temp = BdManager.consultarRegistro(new Origen("ad87651f614d9b3701614d9d69b50000"), sensor);

	}

	public Object search(Object object) throws SQLException {
		if (object instanceof Registro) {
			return consultarRegistro((Registro) object);
		}
		return null;
	}

	public static ArrayList<Registro> consultarRegistro(String origen, Sensor sensor) throws SQLException {

		return consultarRegistro(new Origen(origen), sensor);

	}

	public static ArrayList<Registro> consultarRegistro(Origen origen, Sensor sensor) throws SQLException {

		String sql = "select * from  " + Constantes.BD + ".fateon_registro where sensor_id='" + sensor.getOid()
				+ "' and origen_id='" + origen.getOid() + "'  order by " + Constantes.CampoRegistro.DATE1.campoBD()
				+ "," + Constantes.CampoRegistro.HORA1.campoBD();
		System.out.println(sql);
		return consultarRegistro(sql, sensor, origen);

	}

	public ArrayList<Registro> consultarRegistro(Registro object) throws SQLException {
		String sql = "select * from  " + Constantes.BD + ".fateon_registro where sensor_id=" + object.getSensor();
		return consultarRegistro(sql);

	}

	public int save(Object object) throws SQLException {
		if (object instanceof Registro) {
			salvarRegistro((Registro) object);
		}
		return -1;
	}

	public int delete(Object object) throws SQLException {
		if (object instanceof Registro) {
			borrarRegistro((Registro) object);
		}

		return -1;
	}

	public static ArrayList<Mapa> consultarMapa(Registro registro) throws SQLException {

		String sql = "select a.* from  " + Constantes.BD + ".fateon_mapa a" + " fateon_sensor b  where  "
				+ "a.mapa_id= b.sensor_mapa and" + "a.mapa_id ='" + registro.getSensor().getMapa().getOid()+"'";
		System.out.println(sql);
		return consultarMapa(sql);
		// TODO Auto-generated method stub

	}

	public static ArrayList<Mapa> consultarMapa(Sensor sensor) throws SQLException {

		String sql = "select a.* from  " + Constantes.BD + ".fateon_mapa a where  " + "a.mapa_tabla =\""
				+ sensor.getMapa().getOid() + "\"";
		System.out.println(sql);
		return consultarMapa(sql);
		// TODO Auto-generated method stub

	}

	public static ArrayList<Mapa> consultarMapa(String sql) throws SQLException {

		PreparedStatement pst = connection.prepareStatement(sql);

		ResultSet rs = consultarSql(pst);

		ArrayList<Mapa> respuesta = new ArrayList<Mapa>();
		while (rs.next()) {
			Mapa temp = new Mapa();
			temp.setOid(rs.getString("mapa_id"));
			temp.setMapabd(buscarEnListaCatalogo(rs.getString("mapa_campo")));
			temp.setMapaTabla(buscarEnListaCatalogo(rs.getString("mapa_tabla")));
			temp.setMapaapp(rs.getString("mapa_nombre_campo"));
			respuesta.add(temp);

		}

		return respuesta;

	}

	/**
	 * @param id
	 * @return
	 */
	private static Catalogo buscarEnListaCatalogo(String id) {
		// TODO Auto-generated method stub
		if (listaCatalogos == null) {
			buscarCatalogos();
		}

		for (Catalogo catalogo : listaCatalogos) {
			if (catalogo.getOid().equals(id))
				return catalogo;

		}
		return null;
	}

	public static ArrayList<Registro> consultarRegistro(String sql) throws SQLException {

		// PreparedStatement pst = connection.prepareStatement(sql);
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		// ResultSet rs = consultarSql(pst);

		ArrayList<Registro> respuesta = new ArrayList<Registro>();
		while (rs.next()) {

			Registro temp = new Registro();
			temp.setRegistroDate1(rs.getDate(Constantes.CampoRegistro.DATE1.campoBD()));
			temp.setRegistroDate2(rs.getDate(Constantes.CampoRegistro.DATE2.campoBD()));
			temp.setRegistroDate3(rs.getDate(Constantes.CampoRegistro.DATE3.campoBD()));
			temp.setRegistroDate4(rs.getDate(Constantes.CampoRegistro.DATE4.campoBD()));
			temp.setRegistroDate5(rs.getDate(Constantes.CampoRegistro.DATE5.campoBD()));
			temp.setRegistroFloat1(rs.getFloat(Constantes.CampoRegistro.FLOAT1.campoBD()));
			temp.setRegistroFloat2(rs.getFloat(Constantes.CampoRegistro.FLOAT2.campoBD()));
			temp.setRegistroFloat3(rs.getFloat(Constantes.CampoRegistro.FLOAT3.campoBD()));
			temp.setRegistroFloat4(rs.getFloat(Constantes.CampoRegistro.FLOAT4.campoBD()));
			temp.setRegistroFloat5(rs.getFloat(Constantes.CampoRegistro.FLOAT5.campoBD()));
			temp.setRegistroInt1(rs.getInt(Constantes.CampoRegistro.INT1.campoBD()));
			temp.setRegistroInt2(rs.getInt(Constantes.CampoRegistro.INT2.campoBD()));
			temp.setRegistroInt3(rs.getInt(Constantes.CampoRegistro.INT3.campoBD()));
			temp.setRegistroInt4(rs.getInt(Constantes.CampoRegistro.INT4.campoBD()));
			temp.setRegistroInt5(rs.getInt(Constantes.CampoRegistro.INT5.campoBD()));
			temp.setRegistroVarchar1(rs.getString(Constantes.CampoRegistro.VARCHAR1.campoBD()));
			temp.setRegistroVarchar2(rs.getString(Constantes.CampoRegistro.VARCHAR2.campoBD()));
			temp.setRegistroVarchar3(rs.getString(Constantes.CampoRegistro.VARCHAR3.campoBD()));
			temp.setRegistroVarchar4(rs.getString(Constantes.CampoRegistro.VARCHAR4.campoBD()));
			temp.setRegistroVarchar5(rs.getString(Constantes.CampoRegistro.VARCHAR5.campoBD()));
			temp.setRegistrotime1(new Time(rs.getTimestamp(Constantes.CampoRegistro.HORA1.campoBD()).getTime()));
			temp.setRegistrotime2(new Time(rs.getTimestamp(Constantes.CampoRegistro.HORA2.campoBD()).getTime()));
			temp.setRegistrotime3(new Time(rs.getTimestamp(Constantes.CampoRegistro.HORA3.campoBD()).getTime()));
			temp.setRegistrotime4(new Time(rs.getTimestamp(Constantes.CampoRegistro.HORA4.campoBD()).getTime()));
			temp.setRegistrotime5(new Time(rs.getTimestamp(Constantes.CampoRegistro.HORA5.campoBD()).getTime()));
			temp.setSensor(new Sensor(rs.getString(Constantes.CampoRegistro.SENSOR.campoBD())));
			temp.setOrigen(new Origen(rs.getString(Constantes.CampoRegistro.ORIGEN.campoBD())));
			temp.setOid(rs.getString(Constantes.CampoRegistro.ID_.campoBD()));
			temp.setRegistroFecha(rs.getString(Constantes.CampoRegistro.FECHA_REGISTRO.campoBD()));
			respuesta.add(temp);

		}

		return respuesta;

	}

	public static ArrayList<Umbral> consultarUmbral( Sensor sensor, Origen origen) throws SQLException {
		return consultarUmbral(sensor, origen, consultarMapa(sensor));
	}

	public static ArrayList<Umbral> consultarUmbral( Sensor sensor, Origen origen,ArrayList<Mapa> mapas) throws SQLException {

		 
		
		// PreparedStatement pst = connection.prepareStatement(sql);
		Statement stmt = connection.createStatement();
		String sql="select * from " + Constantes.BD + ".fateon_umbral where sensor_id='" + sensor.getOid() + "' and origen_id ='"+ origen.getOid()+"'";
		ResultSet rs = stmt.executeQuery(sql);
		
		// ResultSet rs = consultarSql(pst);

		ArrayList<Umbral> respuesta = new ArrayList<Umbral>();
		while (rs.next()) {

			Umbral temp = new Umbral();
			temp.setMapa(buscarMapaLista(rs.getString("mapa_id"),mapas));
			temp.setOid(rs.getString("umbral_id"));
			temp.setOrigen(origen);
			temp.setUmbralValor(rs.getFloat("umbral"));
			
			respuesta.add(temp);

		}

		return respuesta;

	}

	
	/**
	 * @param idMapa
	 * @param mapas 
	 * @return
	 */
	private static Mapa buscarMapaLista(String idMapa, ArrayList<Mapa> mapas) {
		// TODO Auto-generated method stub
		for (Mapa mapa : mapas) {
			if (mapa.getOid().equals(idMapa))
				return mapa;
		}
		return null;
	}

	public static ArrayList<Registro> consultarRegistro(String sql, Sensor sensor, Origen origen) throws SQLException {

		// PreparedStatement pst = connection.prepareStatement(sql);
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		// ResultSet rs = consultarSql(pst);

		ArrayList<Registro> respuesta = new ArrayList<Registro>();
		while (rs.next()) {

			Registro temp = new Registro();
			temp.setRegistroDate1(rs.getDate(Constantes.CampoRegistro.DATE1.campoBD()));
			temp.setRegistroDate2(rs.getDate(Constantes.CampoRegistro.DATE2.campoBD()));
			temp.setRegistroDate3(rs.getDate(Constantes.CampoRegistro.DATE3.campoBD()));
			temp.setRegistroDate4(rs.getDate(Constantes.CampoRegistro.DATE4.campoBD()));
			temp.setRegistroDate5(rs.getDate(Constantes.CampoRegistro.DATE5.campoBD()));
			temp.setRegistroFloat1(rs.getFloat(Constantes.CampoRegistro.FLOAT1.campoBD()));
			temp.setRegistroFloat2(rs.getFloat(Constantes.CampoRegistro.FLOAT2.campoBD()));
			temp.setRegistroFloat3(rs.getFloat(Constantes.CampoRegistro.FLOAT3.campoBD()));
			temp.setRegistroFloat4(rs.getFloat(Constantes.CampoRegistro.FLOAT4.campoBD()));
			temp.setRegistroFloat5(rs.getFloat(Constantes.CampoRegistro.FLOAT5.campoBD()));
			temp.setRegistroInt1(rs.getInt(Constantes.CampoRegistro.INT1.campoBD()));
			temp.setRegistroInt2(rs.getInt(Constantes.CampoRegistro.INT2.campoBD()));
			temp.setRegistroInt3(rs.getInt(Constantes.CampoRegistro.INT3.campoBD()));
			temp.setRegistroInt4(rs.getInt(Constantes.CampoRegistro.INT4.campoBD()));
			temp.setRegistroInt5(rs.getInt(Constantes.CampoRegistro.INT5.campoBD()));
			temp.setRegistroVarchar1(rs.getString(Constantes.CampoRegistro.VARCHAR1.campoBD()));
			temp.setRegistroVarchar2(rs.getString(Constantes.CampoRegistro.VARCHAR2.campoBD()));
			temp.setRegistroVarchar3(rs.getString(Constantes.CampoRegistro.VARCHAR3.campoBD()));
			temp.setRegistroVarchar4(rs.getString(Constantes.CampoRegistro.VARCHAR4.campoBD()));
			temp.setRegistroVarchar5(rs.getString(Constantes.CampoRegistro.VARCHAR5.campoBD()));
			try {
				temp.setRegistrotime1(new Time(rs.getTimestamp(Constantes.CampoRegistro.HORA1.campoBD()).getTime()));
			} catch (Exception e) {
			}
			try {
				temp.setRegistrotime2(new Time(rs.getTimestamp(Constantes.CampoRegistro.HORA2.campoBD()).getTime()));
			} catch (Exception e) {
			}
			try {
				temp.setRegistrotime3(new Time(rs.getTimestamp(Constantes.CampoRegistro.HORA3.campoBD()).getTime()));
			} catch (Exception e) {
			}
			try {
				temp.setRegistrotime4(new Time(rs.getTimestamp(Constantes.CampoRegistro.HORA4.campoBD()).getTime()));
			} catch (Exception e) {
			}
			try {
				temp.setRegistrotime5(new Time(rs.getTimestamp(Constantes.CampoRegistro.HORA5.campoBD()).getTime()));
			} catch (Exception e) {
			}
			temp.setSensor(new Sensor(rs.getString(Constantes.CampoRegistro.SENSOR.campoBD())));
			temp.setOrigen(new Origen(rs.getString(Constantes.CampoRegistro.ORIGEN.campoBD())));
			temp.setOid(rs.getString(Constantes.CampoRegistro.ID_.campoBD()));
			temp.setRegistroFecha(rs.getString(Constantes.CampoRegistro.FECHA_REGISTRO.campoBD()));
			respuesta.add(temp);

		}

		return respuesta;

	}

	public int borrarRegistro(Registro object) throws SQLException {
		// TODO Auto-generated method stub
		String sql = null;
		PreparedStatement pst = connection.prepareStatement(sql);
		return ejecutarSql(pst);
	}

	public int salvarRegistro(Registro object) throws SQLException {
		// TODO Auto-generated method stub
		String sql = null;
		PreparedStatement pst = connection.prepareStatement(sql);
		return ejecutarSql(pst);

	}

	public static ResultSet consultarSql(PreparedStatement pst) {
		try {
			ResultSet rs = null;

			// int registros = 0;
			rs = pst.executeQuery();
			return rs;

		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger("BdManager").log(Level.SEVERE, "Error in insert in the bd:" + e.getMessage());

			return null;

		}

	}

	public int ejecutarSql(PreparedStatement pst) {
		try {
			ResultSet rs = null;

			// int registros = 0;
			rs = pst.executeQuery();
			ResultSetMetaData rsm = rs.getMetaData();

			while (rs.next()) {
				for (int i = 1; i <= rsm.getColumnCount(); i++) {

				}
				// registros++;
			}

			rs.close();
			pst.close();

		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger(this.getClass().getName()).log(Level.SEVERE,
					"Error in insert in the bd:" + e.getMessage());

			return -1;

		}
		return 0;

	}

	/**
	 * guarda un json y devuelve el numero del id guardado en la bd
	 * 
	 * @param jSon
	 * @return
	 */
	public static int saveJson(String jSon) {
		int autoGeneratedID = 0;
		try {
			String sql = "insert into " + Constantes.BD + ".fateon_Json (json) values (?)";
			PreparedStatement pst = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			pst.setString(1, jSon);
			pst.executeUpdate();

			ResultSet tableKeys = pst.getGeneratedKeys();
			tableKeys.next();
			autoGeneratedID = tableKeys.getInt(1);

		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger("BdManager").log(Level.SEVERE, "Error insert Json in the BD:" + e.getMessage());

		}

		return autoGeneratedID;

	}

	/**
	 * busqueda de Sensor a traves de un id
	 * 
	 * @param id
	 */
	public static String buscarJson(int id) {
		String respuesta = "";
		try {
			String sql = "select * from " + Constantes.BD + ".fateon_Json where idfateon_Json='" + id + "'";
			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);
			System.out.println(sql);

			while (rs.next()) {
				respuesta = (rs.getString("json"));

			}
		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger("BdManager").log(Level.SEVERE, "Error in search of Sensor in the bd:" + e.getMessage());

		}

		return respuesta;
		// TODO Auto-generated method stub

	}

	/**
	 * busqueda de Sensor a traves de un id
	 * 
	 * @param id
	 */
	public static Sensor buscarSensor(String id) {
		Sensor respuesta = null;
		try {
			String sql = "select * from " + Constantes.BD + ".fateon_sensor where sensor_id='" + id + "'";
			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);
			System.out.println(sql);

			while (rs.next()) {
				respuesta = new Sensor();
				respuesta.setOid(rs.getString("sensor_id"));
				respuesta.setNombre(rs.getString("sensor_nombre"));
				respuesta.setMapa(buscarEnListaCatalogo(rs.getString("sensor_tabla")));
				respuesta.setPrograma(new Programa(rs.getString("sensor_programa")));
			}
		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger("BdManager").log(Level.SEVERE, "Error in search of Sensor in the bd:" + e.getMessage());

		}

		return respuesta;
		// TODO Auto-generated method stub

	}

	/**
	 * buscar un Origen a partir de un mapa
	 * 
	 * @param id
	 * @return
	 */

	public static Origen BuscarOrigen(String id) {
		Origen respuesta = null;
		try {
			String sql = "select * from  " + Constantes.BD + ".fateon_origen where origen_id='" + id + "'";
			// System.out.println(sql);

			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);

			while (rs.next()) {
				respuesta = new Origen();
				respuesta.setOid(rs.getString("origen_id"));
				respuesta.setNombre(rs.getString("origen_nombre"));
				respuesta.setModelo(rs.getString("origen_modelo"));
				respuesta.setMac(rs.getString("origen_mac"));
				respuesta.setTipo(buscarEnListaCatalogo(rs.getString("origen_id_tipo")));
				respuesta.setSistema(buscarEnListaCatalogo(rs.getString("origen_id_sistema")));
				respuesta.setSucursal(buscarEnListaCatalogo(rs.getString("origen_id_sucursal")));
				respuesta.setOficina(buscarEnListaCatalogo(rs.getString("origen_id_oficina")));
				respuesta.setMunicipio(buscarEnListaCatalogo(rs.getString("origen_id_municipio")));
				respuesta.setCiudad(buscarEnListaCatalogo(rs.getString("origen_id_ciudad")));
				respuesta.setPais(buscarEnListaCatalogo(rs.getString("origen_id_pais")));
				respuesta.setIp(rs.getString("origen_ip"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger("BdManager").log(Level.SEVERE,
					"Error in search of BuscarOrigen in the bd:" + e.getMessage());

		}

		return respuesta;
	}

	/**
	 * buscar una tabla a partir de un mapa
	 * 
	 * @param id
	 * @return //
	 */
	// public static Tabla_Mapa buscarTablaMapa(String id) {
	// Tabla_Mapa respuesta = null;
	// try {
	// String sql = "select * from fateon.fateon_tabla_mapa where
	// tabla_mapa_id='" + id + "'";
	// PreparedStatement pst = connection.prepareStatement(sql);
	//
	// ResultSet rs = consultarSql(pst);
	//
	// while (rs.next()) {
	// respuesta = new Tabla_Mapa();
	// respuesta.setId(rs.getString("tabla_mapa_id"));
	// respuesta.setNombre(rs.getString("tabla_mapa_nombre"));
	// respuesta.setMapas(buscarMapas(respuesta.getId()));
	// }
	// } catch (Exception e) {
	// // TODO: handle exception
	// Logger.getLogger("BdManager").log(Level.SEVERE,
	// "Error in search of Tabla_mapa in the bd:" + e.getMessage());
	//
	// }
	//
	// return respuesta;
	// }

	/**
	 * buscar una tabla a partir de un mapa
	 * 
	 * @param id
	 * @return
	 */
	public static Tabla buscarTabla(String id) {

		Tabla respuesta = null;

		if (listaTablas == null)
			try {
				listaTablas = new ArrayList<Tabla>();
				String sql = "select * from  " + Constantes.BD + ".fateon_tabla";
				System.out.println(sql);
				PreparedStatement pst = connection.prepareStatement(sql);

				ResultSet rs = consultarSql(pst);

				while (rs.next()) {
					respuesta = new Tabla();
					respuesta.setOid(rs.getString("tabla_id"));
					respuesta.setNombre(rs.getString("tabla_nombre"));
					respuesta.setCatalogos(buscarCatalogos(respuesta.getOid(), null));
					respuesta.setTablaNemonico(rs.getString("tabla_nemonico"));
					respuesta.setPrograma(rs.getString("tabla_programa"));
					respuesta.setUbicacion(rs.getString("tabla_ubicacion_programa"));
					listaTablas.add(respuesta);
				}
			} catch (Exception e) {
				// TODO: handle exception
				Logger.getLogger("BdManager").log(Level.SEVERE,
						"Error in search of Tabla_mapa in the bd:" + e.getMessage());

			}

		for (Tabla tabla : listaTablas) {

			if (tabla.getOid().equals(id))
				return tabla;
		}

		return null;
	}

	private static void buscarCatalogos() {
		listaCatalogos = null;
		try {
			String sql = "SELECT * FROM  " + Constantes.BD + ".fateon_catalogo";
			System.out.println(sql);
			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);
			listaCatalogos = new ArrayList<Catalogo>();
			while (rs.next()) {
				Catalogo temp = new Catalogo();
				temp = new Catalogo();
				temp.setOid(rs.getString("catalogo_id"));
				temp.setNombre(rs.getString("catalogo_nombre"));
				temp.setTabla(buscarTabla(rs.getString("catalogo_id_tabla")));
				temp.setValorFecha(rs.getDate("catalogo_valor_time"));
				temp.setValorDecimal(rs.getFloat("catalogo_valor_float"));
				temp.setValorHora(rs.getTime("catalogo_valor_time"));
				temp.setValorEntero(rs.getInt("catalogo_valor_int"));
				temp.setValorCadena(rs.getString("catalogo_descripcion_varchar"));
				listaCatalogos.add(temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger("BdManager").log(Level.SEVERE,
					"Error in search of lista de Catalogos in the bd:" + e.getMessage());

		}

	}

	private static ArrayList<Catalogo> buscarCatalogos(String tabla, ArrayList<Catalogo> listaDeCatalogos) {

		if (listaDeCatalogos == null) {
			if (listaCatalogos == null)
				buscarCatalogos();
			listaDeCatalogos = listaCatalogos;
		}

		ArrayList<Catalogo> respuesta = new ArrayList<Catalogo>();
		for (Catalogo catalogo : listaDeCatalogos) {

			if (catalogo.getTabla().getOid().equals(tabla)) {
				respuesta.add(catalogo);
			}
		}

		return respuesta;
	}

	private static ArrayList<Catalogo> buscarCatalogos(String tabla) {
		ArrayList<Catalogo> respuesta = null;
		try {
			String sql = "SELECT * FROM  " + Constantes.BD + ".fateon_catalogo where catalogo_id_tabla='" + tabla + "'";
			System.out.println(sql);
			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);
			respuesta = new ArrayList<Catalogo>();
			while (rs.next()) {
				Catalogo temp = new Catalogo();
				temp = new Catalogo();
				temp.setOid(rs.getString("catalogo_id"));
				temp.setNombre(rs.getString("catalogo_nombre"));
				temp.setTabla(buscarTabla(rs.getString("catalogo_id_tabla")));
				temp.setValorFecha(rs.getDate("catalogo_valor_time"));
				temp.setValorDecimal(rs.getFloat("catalogo_valor_float"));
				temp.setValorHora(rs.getTime("catlogo_valor_time"));
				temp.setValorEntero(rs.getInt("catalogo_valor_int"));
				temp.setValorCadena(rs.getString("catalogo_descripcion_varchar"));
				respuesta.add(temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger("BdManager").log(Level.SEVERE, "Error in search of mapa in the bd:" + e.getMessage());

		}

		return respuesta;
	}

	/**
	 * buscar un mapa a partir del id de la tabla
	 * 
	 * @param tabla
	 * @return
	 */
	@SuppressWarnings("unused")
	private static ArrayList<Mapa> buscarMapas(String tabla) {
		ArrayList<Mapa> respuesta = null;
		try {
			String sql = "SELECT * FROM  " + Constantes.BD + ".fateon_mapa where mapa_tabla='" + tabla + "'";
			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);
			respuesta = new ArrayList<Mapa>();
			while (rs.next()) {
				Mapa temp = new Mapa();
				temp.setOid(rs.getString("mapa_id"));
				temp.setMapabd(new Catalogo(rs.getString("mapa_campo")));
				temp.setMapaTabla(new Catalogo(rs.getString("mapa_tabla")));
				temp.setMapaapp(rs.getString("mapa_nombre_campo"));
				respuesta.add(temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger("BdManager").log(Level.SEVERE, "Error in search of mapa in the bd:" + e.getMessage());

		}

		return respuesta;
	}

	public static Catalogo buscarCatalogo(String id) {
		Catalogo respuesta = null;
		try {
			String sql = "select * from  " + Constantes.BD + ".fateon_catalogo where catalogo_id='" + id + "'";
			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);

			while (rs.next()) {
				respuesta = new Catalogo();
				respuesta.setOid(rs.getString("catalogo_id"));
				respuesta.setNombre(rs.getString("catalogo_nombre"));
				respuesta.setTabla(buscarTabla(rs.getString("catalogo_id_tabla")));

				respuesta.setValorFecha(rs.getDate("catalogo_valor_time"));
				respuesta.setValorDecimal(rs.getFloat("catalogo_valor_float"));
				respuesta.setValorEntero(rs.getInt("catalogo_valor_int"));
				respuesta.setValorCadena(rs.getString("catalogo_descripcion_varchar"));
				respuesta.setValorHora(rs.getTime("catalogo_valor_time"));

			}
		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger("BdManager").log(Level.SEVERE,
					"Error in search of Tabla_mapa in the bd:" + e.getMessage());

		}

		return respuesta;
	}

}
