package com.jayktec.traductor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import com.google.gson.JsonIOException;
import com.jayktec.controlador.Constantes;
import com.jayktec.controlador.Constantes.*;
import com.jayktec.persistencia.*;
import com.jayktec.xyzOlympus.models.*;

public class ToJson {

	Sensor sensor;
	Registro registro;
	static ArrayList<Registro> listaRegistro;
	static ArrayList<Mapa> mapa;
	Origen origen;
	private String xName;
	private String yName;
	private int showValues = 0;
	private int legendborderalpha = 50;
	private int showborder = 0;
	private String numberPrefix = "S";
	private String bgColor = "FFFFFF,FFFFFF";
	protected String encabezado = "";
	private boolean refrescar;
	private String plotgradientcolor = " ";
	private String showalternatehgridcolor = "\"0\"";
	private String showplotborder = "0";
	private String labeldisplay = "\"WRAP\"";
	private String divlinecolor = "\"CCCCCC\"";
	private String showcanvasborder = "0";
	private String canvasborderalpha = "0";
	private String legendshadow = "0";
	private String linethickness = "3";
	private static String dataset;
	private static String categorias;
	private static Tiempo periodo;
	private static Date fechaFinal = Calendar.getInstance().getTime();
	private static CampoRegistro campoCategoriaFecha = Constantes.CampoRegistro.DATE1;
	private static CampoRegistro campoCategoriaHora = Constantes.CampoRegistro.HORA1;

	public static void main(String[] args) throws SQLException, JsonIOException, IOException {
		System.out.println("empezando json");

		ToJson temp = new ToJson("ad87651f614d9b3701614d9d69b50000", new Sensor("ad87651f619cd4430161dd9ec4590029"));

		System.out.println("finalizando json " + temp.crearJson());

	}

	public ToJson(ArrayList<Registro> registros, String origen, Sensor sensor) throws SQLException {
		this(origen, sensor);
		listaRegistro = registros;

	}

	public ToJson(String origen, String sensor) throws SQLException {
		this.origen = new Origen(origen);
		this.sensor = new Sensor(sensor);
		mapaParaSensor();
		refrescar = true;
	}

	public ToJson(String origen, Sensor sensor) throws SQLException {
		this.origen = new Origen(origen);
		this.sensor = sensor;
		mapaParaSensor();
		refrescar = true;
	}

	public void crearEncabezado() {
		iniciarXaxisName();
		iniciarYaxisName();
		crearEncabezado(getxName(),getyName());
		System.out.println(encabezado);
	}

	/**
	 * @return
	 */
	private void iniciarXaxisName() {
		// TODO Auto-generated method stub
		
	}

	public void iniciarYaxisName() {
		for (Mapa temp : mapa) {
		//temp.getMapabd().getNombre().equals(arg0)	
		}
	}
	public void crearEncabezado(String yAxisName, String xAxisName) {

		this.encabezado = " { \"chart\": \"{" + " \"caption\": " + " \"" + origen.getNombre() + "-" + sensor.getNombre() + ","
				+ "\"xaxisname\":" + " \"" + xName + "\"" + "," + "\"yaxisname\":" + " \"" + yName + "\"" + ","
				+ "\"showvalues\":" + " \"" + showValues + "\"" + "," + "\"numberprefix\":" + " \"" + numberPrefix
				+ "\"" + "," + "\"legendborderalpha\":" + " \"" + legendborderalpha + "\"" + "," + "\"showborder\":"
				+ " \"" + showborder + "\"" + "," + "\"bgcolor\":" + " \"" + bgColor + "\"" + "," + "\"showborder\":"
				+ " \"" + showborder + "\"" + "," + "\"plotgradientcolor\":" + " \"" + plotgradientcolor + "\"" + ","
				+ "\"showalternatehgridcolor\":" + " \"" + showalternatehgridcolor + " \"" + "," + "\"showplotborder\":"
				+ " \"" + showplotborder + " \"" + "," + "\"labeldisplay\":" + " \"" + labeldisplay + "\"" + ","
				+ "\"divlinecolor\":" + " \"" + divlinecolor + "\"" + "," + "\"showcanvasborder\":" + " \""
				+ showcanvasborder + "\"" + "," + "\"canvasborderalpha\":" + " \"" + canvasborderalpha + "\"" + ","
				+ "\"legendshadow\":" + " \"" + legendshadow + " \"" + "," + "\"linethickness\":" + " \""
				+ linethickness + "\"" + "," + "},";

		System.out.println(encabezado);
	}



	public static void crearCategorias()

	{
		setCategorias("");
		periodo = Constantes.Tiempo.SEMANAL;
		setFechaFinal(Calendar.getInstance().getTime());

		crearCategorias(periodo, getFechaFinal());

	}

	/**
	 * @param periodo
	 * @param fechaFinal
	 */
	private static void crearCategorias(Tiempo periodo, Date fechaFinal) {
		// TODO Auto-generated method stub
		Date fechaInicio = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fechaFinal); // Configuramos la fecha que se recibe

		if (periodo.equals(Constantes.Tiempo.DIA)) {
			calendar.add(Calendar.DAY_OF_YEAR, -1);
			fechaInicio = calendar.getTime();
		} else if (periodo.equals(Constantes.Tiempo.SEMANAL)) {
			calendar.add(Calendar.DAY_OF_YEAR, -7);
			fechaInicio = calendar.getTime();
		} else if (periodo.equals(Constantes.Tiempo.MES)) {
			calendar.add(Calendar.MONTH, -1);
			fechaInicio = calendar.getTime();
		} else if (periodo.equals(Constantes.Tiempo.ANUAL)) {
			calendar.add(Calendar.YEAR, -1);
			fechaInicio = calendar.getTime();
		}

		crearCategorias(fechaFinal, fechaInicio);
	}

	/**
	 * @param periodo2
	 * @param fechaFinal2
	 * @param fechaInicio
	 */
	private static void crearCategorias(Date fechaFinal2, Date fechaInicio) {
		// TODO Auto-generated method stub
		categorias = "\"categories\": [ {   \"category\": \"";
		boolean primeraVez = true;
		for (Registro registro : listaRegistro) {

			if (!primeraVez) {
				categorias = categorias + "|";
			}
			if (campoCategoriaFecha.equals(Constantes.CampoRegistro.DATE1)) {
				categorias = categorias + registro.getRegistroDate1();
			} else if (campoCategoriaFecha.equals(Constantes.CampoRegistro.DATE2)) {
				categorias = categorias + registro.getRegistroDate2();
			} else if (campoCategoriaFecha.equals(Constantes.CampoRegistro.DATE3)) {
				categorias = categorias + registro.getRegistroDate3();
			} else if (campoCategoriaFecha.equals(Constantes.CampoRegistro.DATE4)) {
				categorias = categorias + registro.getRegistroDate4();
			} else if (campoCategoriaFecha.equals(Constantes.CampoRegistro.DATE5)) {
				categorias = categorias + registro.getRegistroDate5();
			}

			categorias = categorias + " ";

			if (campoCategoriaHora.equals(Constantes.CampoRegistro.HORA1)) {
				categorias = categorias + registro.getRegistrotime1();
			} else if (campoCategoriaHora.equals(Constantes.CampoRegistro.HORA2)) {
				categorias = categorias + registro.getRegistrotime2();
			} else if (campoCategoriaHora.equals(Constantes.CampoRegistro.HORA3)) {
				categorias = categorias + registro.getRegistrotime3();
			} else if (campoCategoriaHora.equals(Constantes.CampoRegistro.HORA4)) {
				categorias = categorias + registro.getRegistrotime4();
			} else if (campoCategoriaHora.equals(Constantes.CampoRegistro.HORA5)) {
				categorias = categorias + registro.getRegistrotime5();
			}

			primeraVez = false;

		}
		categorias = categorias + "\" } ],";
		System.out.println(categorias);
	}

	public static void creaDataset()

	{
		setDataset("\"dataset\": [ ");

		for (Mapa mapaItem : mapa) {
			String serie = "";
			String bd = mapaItem.getMapabd().getNombre();
			if (!(bd.equals(campoCategoriaFecha.campoBD()) || bd.equals(campoCategoriaHora.campoBD()))) {
				boolean primeraVez = true;
				serie = "{\"seriesname\":  \"" + mapaItem.getMapaapp() + "\", \"data\":\"";
				for (Registro registro : listaRegistro) {
					if (!primeraVez)
						serie = serie + "|";
					if (bd.equals(Constantes.CampoRegistro.FLOAT1.campoBD())) {
						serie = serie + registro.getRegistroFloat1();
					} else if (bd.equals(Constantes.CampoRegistro.FLOAT2.campoBD())) {
						serie = serie + registro.getRegistroFloat2();
					} else if (bd.equals(Constantes.CampoRegistro.FLOAT3.campoBD())) {
						serie = serie + registro.getRegistroFloat3();
					} else if (bd.equals(Constantes.CampoRegistro.FLOAT4.campoBD())) {
						serie = serie + registro.getRegistroFloat4();
					} else if (bd.equals(Constantes.CampoRegistro.FLOAT5.campoBD())) {
						serie = serie + registro.getRegistroFloat5();
					} else if (bd.equals(Constantes.CampoRegistro.INT1.campoBD())) {
						serie = serie + registro.getRegistroInt1();
					} else if (bd.equals(Constantes.CampoRegistro.INT2.campoBD())) {
						serie = serie + registro.getRegistroInt2();
					} else if (bd.equals(Constantes.CampoRegistro.INT3.campoBD())) {
						serie = serie + registro.getRegistroInt3();
					} else if (bd.equals(Constantes.CampoRegistro.INT4.campoBD())) {
						serie = serie + registro.getRegistroInt4();
					} else if (bd.equals(Constantes.CampoRegistro.INT5.campoBD())) {
						serie = serie + registro.getRegistroInt5();
					}
					primeraVez = false;
				}

				dataset = dataset + serie + "\"}";
			}
		}
		dataset = dataset + "]}";
		System.out.println(dataset);
	}

	public void refrescarJson(Object object) throws SQLException, JsonIOException, IOException {

		if (origen != null) {
			refrescar = true;

			if (object instanceof Sensor) {
				Sensor sensor = (Sensor) object;
				mapaParaSensor(sensor);
				crearJson();

			}
			if (object instanceof Registro) {
				Registro registro = (Registro) object;
				mapaParaSensor(registro);
				crearJson();

			}
		}
	}

	/**
	 * crea Json
	 * 
	 * @return el id guardado en la base de datos en la tabla fateon_Json
	 * @throws SQLException
	 * @throws JsonIOException
	 * @throws IOException
	 */
	public int crearJson() throws SQLException, JsonIOException, IOException {
		// TODO Auto-generated method stub
		if (refrescar) {
			mapaParaSensor();
			buscarRegistros();
		}

		;
		return BdManager.saveJson(armarJson());

	}

	/**
	 * @return
	 */
	public String armarJson() {
		crearEncabezado();
		crearCategorias();
		creaDataset();
		return encabezado + categorias + dataset;
		// String temp = "{";
		//
		// for (Registro registro : listaRegistro) {
		// temp = temp + "{";
		// for (Mapa mapaItem : mapa) {
		// String campo = mapaItem.getMapabdToString();
		// String valor = "";
		// String nombreCampo = mapaItem.getMapaapp();
		// if (campo.equals(Constantes.CampoRegistro.DATE1.campoBD())) {
		// valor = registro.getRegistroDate1().toString();
		// }
		// if (campo.equals(Constantes.CampoRegistro.DATE2.campoBD())) {
		// valor = registro.getRegistroDate2().toString();
		// }
		// if (campo.equals(Constantes.CampoRegistro.DATE3.campoBD())) {
		// valor = registro.getRegistroDate3().toString();
		// }
		// if (campo.equals(Constantes.CampoRegistro.DATE4.campoBD())) {
		// valor = registro.getRegistroDate4().toString();
		// }
		// if (campo.equals(Constantes.CampoRegistro.DATE5.campoBD())) {
		// valor = registro.getRegistroDate5().toString();
		// }
		//
		// if (campo.equals(Constantes.CampoRegistro.INT1.campoBD())) {
		// valor = String.valueOf(registro.getRegistroInt1());
		// }
		// if (campo.equals(Constantes.CampoRegistro.INT2.campoBD())) {
		// valor = String.valueOf(registro.getRegistroInt2());
		// }
		// if (campo.equals(Constantes.CampoRegistro.INT3.campoBD())) {
		// valor = String.valueOf(registro.getRegistroInt3());
		// }
		// if (campo.equals(Constantes.CampoRegistro.INT4.campoBD())) {
		// valor = String.valueOf(registro.getRegistroInt4());
		// }
		// if (campo.equals(Constantes.CampoRegistro.INT5.campoBD())) {
		// valor = String.valueOf(registro.getRegistroInt5());
		// }
		// if (campo.equals(Constantes.CampoRegistro.FLOAT1.campoBD())) {
		// valor = String.valueOf(registro.getRegistroFloat1());
		// }
		// if (campo.equals(Constantes.CampoRegistro.FLOAT2.campoBD())) {
		// valor = String.valueOf(registro.getRegistroFloat2());
		// }
		// if (campo.equals(Constantes.CampoRegistro.FLOAT3.campoBD())) {
		// valor = String.valueOf(registro.getRegistroFloat3());
		// }
		// if (campo.equals(Constantes.CampoRegistro.FLOAT4.campoBD())) {
		// valor = String.valueOf(registro.getRegistroFloat4());
		// }
		// if (campo.equals(Constantes.CampoRegistro.FLOAT5.campoBD())) {
		// valor = String.valueOf(registro.getRegistroFloat5());
		// }
		//
		// if (campo.equals(Constantes.CampoRegistro.VARCHAR1.campoBD())) {
		// valor = registro.getRegistroVarchar1();
		// }
		// if (campo.equals(Constantes.CampoRegistro.VARCHAR2.campoBD())) {
		// valor = registro.getRegistroVarchar2();
		// }
		// if (campo.equals(Constantes.CampoRegistro.VARCHAR3.campoBD())) {
		// valor = registro.getRegistroVarchar3();
		// }
		// if (campo.equals(Constantes.CampoRegistro.VARCHAR4.campoBD())) {
		// valor = registro.getRegistroVarchar4();
		// }
		// if (campo.equals(Constantes.CampoRegistro.VARCHAR5.campoBD())) {
		// valor = registro.getRegistroVarchar5();
		// }
		//
		// if (campo.equals(Constantes.CampoRegistro.HORA1.campoBD())) {
		// valor = String.valueOf(registro.getRegistrotime1());
		// }
		// if (campo.equals(Constantes.CampoRegistro.HORA2.campoBD())) {
		// valor = String.valueOf(registro.getRegistrotime2());
		// }
		// if (campo.equals(Constantes.CampoRegistro.HORA3.campoBD())) {
		// valor = String.valueOf(registro.getRegistrotime3());
		// }
		// if (campo.equals(Constantes.CampoRegistro.HORA4.campoBD())) {
		// valor = String.valueOf(registro.getRegistrotime4());
		// }
		// if (campo.equals(Constantes.CampoRegistro.HORA5.campoBD())) {
		// valor = String.valueOf(registro.getRegistrotime5());
		// }
		//
		// temp = temp + '\n' + '\"' + nombreCampo + '\"' + ":" + '\"' + valor +
		// '\"';
		//
		// }
		//
		// temp = temp + "}" + '\n';
		//
		// }
		// temp = temp + "}" + '\n';
		// return temp;
	}

	private void buscarRegistros() throws SQLException {
		// TODO Auto-generated method stub
		ToJson.listaRegistro = null;
		ToJson.listaRegistro = BdManager.consultarRegistro(origen, sensor);

	}

	public void mapaParaSensor() throws SQLException {
		mapa = BdManager.consultarMapa(sensor);

	}

	public void mapaParaSensor(Sensor sensor) throws SQLException {
		mapa = BdManager.consultarMapa(sensor);

	}

	public void mapaParaSensor(Registro registro) throws SQLException {
		mapa = BdManager.consultarMapa(registro);

	}

	/**
	 * @return the sensor
	 */
	public Sensor getSensor() {
		return sensor;
	}

	/**
	 * @param sensor
	 *            the sensor to set
	 */
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	/**
	 * @return the registro
	 */
	public Registro getRegistro() {
		return registro;
	}

	/**
	 * @param registro
	 *            the registro to set
	 */
	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	/**
	 * @return the listaRegistro
	 */
	public ArrayList<Registro> getListaRegistro() {
		return listaRegistro;
	}

	/**
	 * @param listaRegistro
	 *            the listaRegistro to set
	 */
	public void setListaRegistro(ArrayList<Registro> listaRegistro) {
		ToJson.listaRegistro = listaRegistro;
	}

	/**
	 * @return the mapa
	 */
	public ArrayList<Mapa> getMapa() {
		return mapa;
	}

	/**
	 * @param mapa
	 *            the mapa to set
	 */
	public void setMapa(ArrayList<Mapa> mapas) {
		mapa = mapas;
	}

	/**
	 * @return the origen
	 */
	public Origen getOrigen() {
		return origen;
	}

	/**
	 * @param origen
	 *            the origen to set
	 */
	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	/**
	 * @return the xName
	 */
	public String getxName() {
		return xName;
	}

	/**
	 * @param xName
	 *            the xName to set
	 */
	public void setxName(String xName) {
		this.xName = xName;
	}

	/**
	 * @return the yName
	 */
	public String getyName() {
		return yName;
	}

	/**
	 * @param yName
	 *            the yName to set
	 */
	public void setyName(String yName) {
		this.yName = yName;
	}

	/**
	 * @return the showValues
	 */
	public int getShowValues() {
		return showValues;
	}

	/**
	 * @param showValues
	 *            the showValues to set
	 */
	public void setShowValues(int showValues) {
		this.showValues = showValues;
	}

	/**
	 * @return the legendborderalpha
	 */
	public int getLegendborderalpha() {
		return legendborderalpha;
	}

	/**
	 * @param legendborderalpha
	 *            the legendborderalpha to set
	 */
	public void setLegendborderalpha(int legendborderalpha) {
		this.legendborderalpha = legendborderalpha;
	}

	/**
	 * @return the showborder
	 */
	public int getShowborder() {
		return showborder;
	}

	/**
	 * @param showborder
	 *            the showborder to set
	 */
	public void setShowborder(int showborder) {
		this.showborder = showborder;
	}

	/**
	 * @return the numberPrefix
	 */
	public String getNumberPrefix() {
		return numberPrefix;
	}

	/**
	 * @param numberPrefix
	 *            the numberPrefix to set
	 */
	public void setNumberPrefix(String numberPrefix) {
		this.numberPrefix = numberPrefix;
	}

	/**
	 * @return the bgColor
	 */
	public String getBgColor() {
		return bgColor;
	}

	/**
	 * @param bgColor
	 *            the bgColor to set
	 */
	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	/**
	 * @return the encabezado
	 */
	public String getEncabezado() {
		return encabezado;
	}

	/**
	 * @param encabezado
	 *            the encabezado to set
	 */
	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}

	/**
	 * @return the refrescar
	 */
	public boolean isRefrescar() {
		return refrescar;
	}

	/**
	 * @param refrescar
	 *            the refrescar to set
	 */
	public void setRefrescar(boolean refrescar) {
		this.refrescar = refrescar;
	}

	/**
	 * @return the plotgradientcolor
	 */
	public String getPlotgradientcolor() {
		return plotgradientcolor;
	}

	/**
	 * @param plotgradientcolor
	 *            the plotgradientcolor to set
	 */
	public void setPlotgradientcolor(String plotgradientcolor) {
		this.plotgradientcolor = plotgradientcolor;
	}

	/**
	 * @return the showalternatehgridcolor
	 */
	public String getShowalternatehgridcolor() {
		return showalternatehgridcolor;
	}

	/**
	 * @param showalternatehgridcolor
	 *            the showalternatehgridcolor to set
	 */
	public void setShowalternatehgridcolor(String showalternatehgridcolor) {
		this.showalternatehgridcolor = showalternatehgridcolor;
	}

	/**
	 * @return the showplotborder
	 */
	public String getShowplotborder() {
		return showplotborder;
	}

	/**
	 * @param showplotborder
	 *            the showplotborder to set
	 */
	public void setShowplotborder(String showplotborder) {
		this.showplotborder = showplotborder;
	}

	/**
	 * @return the labeldisplay
	 */
	public String getLabeldisplay() {
		return labeldisplay;
	}

	/**
	 * @param labeldisplay
	 *            the labeldisplay to set
	 */
	public void setLabeldisplay(String labeldisplay) {
		this.labeldisplay = labeldisplay;
	}

	/**
	 * @return the divlinecolor
	 */
	public String getDivlinecolor() {
		return divlinecolor;
	}

	/**
	 * @param divlinecolor
	 *            the divlinecolor to set
	 */
	public void setDivlinecolor(String divlinecolor) {
		this.divlinecolor = divlinecolor;
	}

	/**
	 * @return the showcanvasborder
	 */
	public String getShowcanvasborder() {
		return showcanvasborder;
	}

	/**
	 * @param showcanvasborder
	 *            the showcanvasborder to set
	 */
	public void setShowcanvasborder(String showcanvasborder) {
		this.showcanvasborder = showcanvasborder;
	}

	/**
	 * @return the canvasborderalpha
	 */
	public String getCanvasborderalpha() {
		return canvasborderalpha;
	}

	/**
	 * @param canvasborderalpha
	 *            the canvasborderalpha to set
	 */
	public void setCanvasborderalpha(String canvasborderalpha) {
		this.canvasborderalpha = canvasborderalpha;
	}

	/**
	 * @return the legendshadow
	 */
	public String getLegendshadow() {
		return legendshadow;
	}

	/**
	 * @param legendshadow
	 *            the legendshadow to set
	 */
	public void setLegendshadow(String legendshadow) {
		this.legendshadow = legendshadow;
	}

	/**
	 * @return the linethickness
	 */
	public String getLinethickness() {
		return linethickness;
	}

	/**
	 * @param linethickness
	 *            the linethickness to set
	 */
	public void setLinethickness(String linethickness) {
		this.linethickness = linethickness;
	}

	/**
	 * @return the categorias
	 */
	public String getCategorias() {
		return categorias;
	}

	/**
	 * @param categorias
	 *            the categorias to set
	 */
	public static void setCategorias(String categoria) {
		categorias = categoria;
	}

	/**
	 * @return the periodo
	 */
	public Tiempo getPeriodo() {
		return periodo;
	}

	/**
	 * @param periodo
	 *            the periodo to set
	 */
	public void setPeriodo(Tiempo periodos) {
		periodo = periodos;
	}

	/**
	 * @return the fechaFinal
	 */
	public static Date getFechaFinal() {
		return fechaFinal;
	}

	/**
	 * @param fechaFinal
	 *            the fechaFinal to set
	 */
	public static void setFechaFinal(Date fechaFina) {
		fechaFinal = fechaFina;
	}

	/**
	 * @return the campoCategoriaFecha
	 */
	public CampoRegistro getCampoCategoria() {
		return campoCategoriaFecha;
	}

	/**
	 * @param campoCategoriaFecha
	 *            the campoCategoriaFecha to set
	 */
	public void setCampoCategoria(CampoRegistro campoCategoria) {
		ToJson.campoCategoriaFecha = campoCategoria;
	}

	/**
	 * @return the dataset
	 */
	public String getDataset() {
		return dataset;
	}

	/**
	 * @param dataset
	 *            the dataset to set
	 */
	public static void setDataset(String dataSet) {
		dataset = dataSet;
	}

}
