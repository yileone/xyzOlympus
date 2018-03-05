/**
 * 
 */
package com.jayktec.traductor;

import java.awt.*;
import java.sql.*;
import java.util.*;

import com.jayktec.controlador.*;
import com.jayktec.xyzOlympus.models.*;

/**
 * @author {Yisheng León Espinoza} 27 feb. 2018 www.jayktec.com.ve
 */
public class ToJsonMultiAxis extends ToJson {

	

//	public String armarJson() {
//		// TODO Auto-generated method stub
//		
//			String temp = encabezado;
//
//			for (Registro registro : listaRegistro) {
//				temp = temp + "{";
//				for (Mapa mapaItem : mapa) {
//					String campo = mapaItem.getMapabd().getNombre();
//					String valor = "";
//					String nombreCampo = mapaItem.getMapaapp();
//					if (campo.equals(Constantes.CampoRegistro.DATE1.campoBD())) {
//						valor = registro.getRegistroDate1().toString();
//					}
//					if (campo.equals(Constantes.CampoRegistro.DATE2.campoBD())) {
//						valor = registro.getRegistroDate2().toString();
//					}
//					if (campo.equals(Constantes.CampoRegistro.DATE3.campoBD())) {
//						valor = registro.getRegistroDate3().toString();
//					}
//					if (campo.equals(Constantes.CampoRegistro.DATE4.campoBD())) {
//						valor = registro.getRegistroDate4().toString();
//					}
//					if (campo.equals(Constantes.CampoRegistro.DATE5.campoBD())) {
//						valor = registro.getRegistroDate5().toString();
//					}
//
//					if (campo.equals(Constantes.CampoRegistro.INT1.campoBD())) {
//						valor = String.valueOf(registro.getRegistroInt1());
//					}
//					if (campo.equals(Constantes.CampoRegistro.INT2.campoBD())) {
//						valor = String.valueOf(registro.getRegistroInt2());
//					}
//					if (campo.equals(Constantes.CampoRegistro.INT3.campoBD())) {
//						valor = String.valueOf(registro.getRegistroInt3());
//					}
//					if (campo.equals(Constantes.CampoRegistro.INT4.campoBD())) {
//						valor = String.valueOf(registro.getRegistroInt4());
//					}
//					if (campo.equals(Constantes.CampoRegistro.INT5.campoBD())) {
//						valor = String.valueOf(registro.getRegistroInt5());
//					}
//					if (campo.equals(Constantes.CampoRegistro.FLOAT1.campoBD())) {
//						valor = String.valueOf(registro.getRegistroFloat1());
//					}
//					if (campo.equals(Constantes.CampoRegistro.FLOAT2.campoBD())) {
//						valor = String.valueOf(registro.getRegistroFloat2());
//					}
//					if (campo.equals(Constantes.CampoRegistro.FLOAT3.campoBD())) {
//						valor = String.valueOf(registro.getRegistroFloat3());
//					}
//					if (campo.equals(Constantes.CampoRegistro.FLOAT4.campoBD())) {
//						valor = String.valueOf(registro.getRegistroFloat4());
//					}
//					if (campo.equals(Constantes.CampoRegistro.FLOAT5.campoBD())) {
//						valor = String.valueOf(registro.getRegistroFloat5());
//					}
//
//					if (campo.equals(Constantes.CampoRegistro.VARCHAR1.campoBD())) {
//						valor = registro.getRegistroVarchar1();
//					}
//					if (campo.equals(Constantes.CampoRegistro.VARCHAR2.campoBD())) {
//						valor = registro.getRegistroVarchar2();
//					}
//					if (campo.equals(Constantes.CampoRegistro.VARCHAR3.campoBD())) {
//						valor = registro.getRegistroVarchar3();
//					}
//					if (campo.equals(Constantes.CampoRegistro.VARCHAR4.campoBD())) {
//						valor = registro.getRegistroVarchar4();
//					}
//					if (campo.equals(Constantes.CampoRegistro.VARCHAR5.campoBD())) {
//						valor = registro.getRegistroVarchar5();
//					}
//
//					if (campo.equals(Constantes.CampoRegistro.HORA1.campoBD())) {
//						valor = String.valueOf(registro.getRegistrotime1());
//					}
//					if (campo.equals(Constantes.CampoRegistro.HORA2.campoBD())) {
//						valor = String.valueOf(registro.getRegistrotime2());
//					}
//					if (campo.equals(Constantes.CampoRegistro.HORA3.campoBD())) {
//						valor = String.valueOf(registro.getRegistrotime3());
//					}
//					if (campo.equals(Constantes.CampoRegistro.HORA4.campoBD())) {
//						valor = String.valueOf(registro.getRegistrotime4());
//					}
//					if (campo.equals(Constantes.CampoRegistro.HORA5.campoBD())) {
//						valor = String.valueOf(registro.getRegistrotime5());
//					}
//
//					temp = temp + '\n' + '\"' + nombreCampo + '\"' + ":" + '\"' + valor + '\"';
//
//				}
//
//				temp = temp + "}" + '\n';
//
//			}
//			temp = temp + "}" + '\n';
//			return temp;
//
//	}
//	
//	

	public ToJsonMultiAxis(ArrayList<Registro> registros, String origen, Sensor sensor) throws SQLException {
		super(registros, origen, sensor);
		// TODO Auto-generated constructor stub
	}

	public ToJsonMultiAxis(String origen, Sensor sensor) throws SQLException {
		super(origen, sensor);
		// TODO Auto-generated constructor stub
	}



	public ToJsonMultiAxis(String origen, String sensor) throws SQLException {
		super(origen, sensor);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
