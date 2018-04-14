/**
 * 
 */
package test.com.jayktec.controller;

import java.sql.*;
import java.util.logging.*;

import test.com.jayktec.controlador.Constantes;

/**
 * @author arte
 *
 */
public class Conexion {

	// private String url = "jdbc:mysql://localhost:3306/"+Constantes.BD;
	private String url = "jdbc:mysql://45.7.229.159:3306/" + test.com.jayktec.controlador.Constantes.BD;
	private String username = "mysql";
	private String password = "afrodita";

	/**
	 * 
	 */

	public Conexion() {
		System.out.println("url:" + url);

		System.out.println("username:" + username);

		System.out.println("password:" + password);

	}

	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		try {

			System.out.println("Database connected!");

			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			Logger.getLogger(this.getClass().getName()).log(Level.SEVERE,
					"Cannot connect the database!" + e.getMessage());
			return null;
		}
	}
}
