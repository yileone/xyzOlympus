/**
 * 
 */
package com.jayktec.batch;

import java.io.*;
import java.sql.*;
import java.util.*;

import com.jayktec.controlador.*;
import com.jayktec.persistencia.*;

/**
 * @author {Yisheng León Espinoza} 19 mar. 2018 www.jayktec.com.ve
 */
public class MediaMovilBatch extends Ejecucion {

	/**
	 * 
	 */

	public static void main(String[] args) throws SQLException, IOException {
		System.out.println("empezando Ejecucion");
		MediaMovilBatch temp = new MediaMovilBatch();
		temp.run();
		System.out.println("finalizando Ejecucion ");

	}

	public MediaMovilBatch() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public String[] getArgumentos() {
		// TODO Auto-generated method stub
		return super.getArgumentos();
	}

	@Override
	public void setArgumentos(String[] argumentos) {
		// TODO Auto-generated method stub
		super.setArgumentos(argumentos);
	}

	@Override
	public ArrayList<Parametro> getParametros() {
		// TODO Auto-generated method stub
		return super.getParametros();
	}

	@Override
	public void setParametros(ArrayList<Parametro> parametros) {
		// TODO Auto-generated method stub
		super.setParametros(parametros);
	}

	@Override
	public String valorParametro(String nombreUnidad) {
		// TODO Auto-generated method stub
		return super.valorParametro(nombreUnidad);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}

	@Override
	public void run() {
		try {
			BdManager.crearMediaMovil();
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		super.run();
	}
}
