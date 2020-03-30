package com.wipro.sales.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection conn = null;
	
	/**
	 * Establish a connection to the database and return the java.sql.Connection reference
	 * @throws ClassNotFoundException 
	 * */
	public static Connection getDBConnection() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wipro", "root", "MITHUN10");
			return conn;
		} catch (SQLException e) {
			System.out.println("Connection could not be estanlished");
			e.printStackTrace();
			return null;
		}
	}
}
