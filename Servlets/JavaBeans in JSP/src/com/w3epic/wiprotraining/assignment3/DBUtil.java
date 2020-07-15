package com.w3epic.wiprotraining.assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/wipro"; 
			Properties info = new Properties(); 
			info.put("user", "root"); 
			info.put("password", "MITHUN10"); 
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, info);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		}
		
		return conn;
	}
}
