package com.jayktec.persistencia;

import java.sql.*;
import java.util.*;
import java.util.logging.*;

import com.jayktec.controlador.Constantes;
import com.jayktec.controller.*;
import com.jayktec.xyzOlympus.models.*;

public class BdManager {
    static	Conexion conexion = new Conexion();
	static Connection connection= conexion.getConexion();


	public static void main(String[] args) throws SQLException {

		System.out.println("prueba bdmanager");
		Sensor sensor = buscarSensor("4028b8816153e69d016153eb61680005");

	 ArrayList<Registro> temp = BdManager.consultarRegistro(new Origen("ad87651f614d9b3701614d9d69b50000"), sensor);
		 for (Registro registro : temp) {
		 }
	}

	public Object search(Object object) throws SQLException {
		if (object instanceof Registro) {
			return consultarRegistro((Registro) object);
		}
		return null;
	}

	public static ArrayList<Registro> consultarRegistro(Origen origen, Sensor sensor) throws SQLException {

		String sql = "select * from fateon_registro where sensor_id='" + sensor.getOid() + "' and origen_id='" + origen.getOid()+"'";
		System.out.println(sql);
		return consultarRegistro(sql);

	}

	public ArrayList<Registro> consultarRegistro(Registro object) throws SQLException {
		String sql = "select * from fateon_registro where sensor_id=" + object.getSensor();
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

	public ArrayList<Mapa> consultarMapa(Registro registro) throws SQLException {

		String sql = "select a.* from fateon_mapa a" + " fateon_sensor b  where  " + "a.mapa_id= b.sensor_mapa and"
				+ "a.mapa_id =" + registro.getSensor();
		return consultarMapa(sql);
		// TODO Auto-generated method stub

	}

	public static ArrayList<Mapa> consultarMapa(Sensor sensor) throws SQLException {

		String sql = "select a.* from fateon_mapa a where  " + "a.mapa_id =" + sensor.getTabla().getId();
		return consultarMapa(sql);
		// TODO Auto-generated method stub

	}

	public static ArrayList<Mapa> consultarMapa(String sql) throws SQLException {

		PreparedStatement pst = connection.prepareStatement(sql);

		ResultSet rs = consultarSql(pst);

		ArrayList<Mapa> respuesta = new ArrayList<Mapa>();
		while (rs.next()) {

			Mapa temp = new Mapa();
			temp.setCampo(rs.getString(("mapa_campo")));
			temp.setFecha(rs.getDate(("mapa_fecha")));
			temp.setOid(rs.getString(("mapa_id")));
			temp.setTablaMapa(rs.getString(("mapa_tabla")));
			temp.setNombreCampo(rs.getString("mapa_nombre_campo"));
			respuesta.add(temp);

		}

		return respuesta;
		// TODO Auto-generated method stub

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
			temp.setRegistroDate2(rs.getDate("registro_date_2"));
			temp.setRegistroDate3(rs.getDate("registro_date_3"));
			temp.setRegistroDate4(rs.getDate("registro_date_4"));
			temp.setRegistroDate5(rs.getDate("registro_date_5"));
			temp.setRegistroFloat1(rs.getFloat("registro_float_1"));
			temp.setRegistroFloat2(rs.getFloat("registro_float_2"));
			temp.setRegistroFloat3(rs.getFloat("registro_float_3"));
			temp.setRegistroFloat4(rs.getFloat("registro_float_4"));
			temp.setRegistroFloat5(rs.getFloat("registro_float_5"));
			temp.setRegistroInt1(rs.getInt("registro_int_1"));
			temp.setRegistroInt2(rs.getInt("registro_int_2"));
			temp.setRegistroInt3(rs.getInt("registro_int_3"));
			temp.setRegistroInt4(rs.getInt("registro_int_4"));
			temp.setRegistroInt5(rs.getInt("registro_int_5"));
			temp.setRegistroVarchar1(rs.getString("registro_varchar_1"));
			temp.setRegistroVarchar2(rs.getString("registro_varchar_2"));
			temp.setRegistroVarchar3(rs.getString("registro_varchar_3"));
			temp.setRegistroVarchar4(rs.getString("registro_varchar_4"));
			temp.setRegistroVarchar5(rs.getString("registro_varchar_5"));
			temp.setRegistrotime1(rs.getTime("registro_datetime_1"));
			temp.setRegistrotime2(rs.getTime("registro_datetime_2"));
			temp.setRegistrotime3(rs.getTime("registro_datetime_3"));
			temp.setRegistrotime4(rs.getTime("registro_datetime_4"));
			temp.setRegistrotime5(rs.getTime("registro_datetime_5"));
			temp.setSensor(new Sensor(rs.getString("sensor_id")));
			temp.setOrigen(new Origen(rs.getString("origen_id")));
			temp.setOid(rs.getString("registro_id"));
			temp.setRegistroFecha(rs.getString("registro_fecha"));
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
	 * busqueda de Sensor a traves de un id
	 * 
	 * @param id
	 */
	public static Sensor buscarSensor(String id) {
		Sensor respuesta = null;
		try {
			String sql = "select * from fateon.fateon_sensor where sensor_id='" + id + "'";
			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);
			//System.out.println(sql);

			while (rs.next()) {
				respuesta = new Sensor();
				respuesta.setOid(rs.getString("sensor_id"));
				respuesta.setNombre(rs.getString("sensor_nombre"));
				respuesta.setMapa(new Catalogo(rs.getString("sensor_tabla")));
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
	 * @param id
	 * @return
	 */
	
	public static Origen BuscarOrigen(String id) {
		Origen respuesta = null;
		try {
			String sql = "select * from fateon.fateon_origen where origen_id='" + id + "'";
			//System.out.println(sql);

			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);
			
			while (rs.next()) {
				respuesta = new Origen();
				respuesta.setOid(rs.getString("origen_id"));
				respuesta.setNombre(rs.getString("origen_nombre"));
				respuesta.setModelo(rs.getString("origen_modelo"));
				respuesta.setMac(rs.getString("origen_mac"));
				respuesta.setTipo(new Catalogo(rs.getString("origen_id_tipo")));
				respuesta.setSistema(new Catalogo(rs.getString("origen_id_sistema")));
				respuesta.setSucursal(new Catalogo(rs.getString("origen_id_sucursal")));
				respuesta.setOficina(new Catalogo(rs.getString("origen_id_oficina")));
				respuesta.setMunicipio(new Catalogo(rs.getString("origen_id_municipio")));
				respuesta.setCiudad(new Catalogo(rs.getString("origen_id_ciudad")));
				respuesta.setPais(new Catalogo(rs.getString("origen_id_pais")));
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
	 * @param id
	 * @return
//	 */
//	public static Tabla_Mapa buscarTablaMapa(String id) {
//		Tabla_Mapa respuesta = null;
//		try {
//			String sql = "select * from fateon.fateon_tabla_mapa where tabla_mapa_id='" + id + "'";
//			PreparedStatement pst = connection.prepareStatement(sql);
//
//			ResultSet rs = consultarSql(pst);
//
//			while (rs.next()) {
//				respuesta = new Tabla_Mapa();
//				respuesta.setId(rs.getString("tabla_mapa_id"));
//				respuesta.setNombre(rs.getString("tabla_mapa_nombre"));
//				respuesta.setMapas(buscarMapas(respuesta.getId()));
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			Logger.getLogger("BdManager").log(Level.SEVERE,
//					"Error in search of Tabla_mapa in the bd:" + e.getMessage());
//
//		}
//
//		return respuesta;
//	}

	/**
	 * buscar una tabla a partir de un mapa
	 * @param id
	 * @return
	 */
	public static Tabla buscarTabla(String id) {
		Tabla respuesta = null;
		try {
			String sql = "select * from fateon.fateon_tabla where tabla_id='" + id + "'";
			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);

			while (rs.next()) {
				respuesta = new Tabla();
				respuesta.setOid(rs.getString("tabla_mapa_id"));
				respuesta.setNombre(rs.getString("tabla_mapa_nombre"));
				respuesta.setCatalogos(buscarCatalogos(respuesta.getOid()));
				respuesta.setTablaNemonico(rs.getString("tabla_nemonico"));
				respuesta.setPrograma(rs.getString("tabla_programa"));
				respuesta.setUbicacion(rs.getString("tabla_ubicacion_programa"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			Logger.getLogger("BdManager").log(Level.SEVERE,
					"Error in search of Tabla_mapa in the bd:" + e.getMessage());

		}

		return respuesta;
	}


	private static ArrayList<Catalogo> buscarCatalogos(String tabla) {
		ArrayList<Catalogo> respuesta = null;
		try {
			String sql = "SELECT * FROM fateon.fateon_catalogo where catalogo_id_tabla='" + tabla + "'";
			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);
			respuesta = new ArrayList<Catalogo>();
			while (rs.next()) {
				Catalogo temp = new Catalogo();
				temp = new Catalogo();
				temp.setOid(rs.getString("catalogo_id"));
				temp.setNombre(rs.getString("catalogo_nombre"));
				temp.setTabla(new Tabla (rs.getString("catalogo_tabla")));
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
	private static ArrayList<Mapa> buscarMapas(String tabla) {
		ArrayList<Mapa> respuesta = null;
		try {
			String sql = "SELECT * FROM fateon.fateon_mapa where mapa_tabla='" + tabla + "'";
			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);
			respuesta = new ArrayList<Mapa>();
			while (rs.next()) {
				Mapa temp = new Mapa();
				temp.setOid(rs.getString("mapa_id"));
				temp.set(rs.getDate("mapa_fecha"));
				temp.setTablaMapa(rs.getString("mapa_tabla"));
				temp.setCampo(rs.getString("mapa_campo"));
				temp.setNombreCampo(rs.getString("mapa_nombre_campo"));
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
			String sql = "select * from fateon.fateon_catalogo where catalogo_id='" + id + "'";
			PreparedStatement pst = connection.prepareStatement(sql);

			ResultSet rs = consultarSql(pst);

			while (rs.next()) {
				respuesta = new Catalogo();
				respuesta.setOid(rs.getString("catalogo_id"));
				respuesta.setNombre(rs.getString("catalogo_nombre"));
				respuesta.setTabla(new Tabla(rs.getString("catalogo_tabla")));
				
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



