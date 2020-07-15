package com.login.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	public static boolean validate(String name,String pass) {
		Connection conn = null;
		boolean st=false;
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/wipro"; 
			Properties info = new Properties(); 
			info.put("user", "root"); 
			info.put("password", "MITHUN10"); 
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, info);
			
			PreparedStatement ps=conn.prepareStatement("select * from userlogin where name=? and password=?");
			ps.setString(1, name);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			st=rs.next();
			
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		}
		
		return st;
	}
	public static boolean newuser(String name,String pass) {
		Connection conn = null;
		boolean st=false;
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/wipro"; 
			Properties info = new Properties(); 
			info.put("user", "root"); 
			info.put("password", "MITHUN10"); 
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, info);
			
			PreparedStatement ps=conn.prepareStatement("insert into 'wipro'.'userlogin'(name,password) values(?,?)");
			ps.setString(1, name);
			ps.setString(2, pass);
			int i=ps.executeUpdate();
			conn.commit();
			if(i!=0)
			{
				st=true;
			}

			ps.close();	
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		}
		return st;
	}
	public static boolean changepswd(String name,String pass,String npswd) {
		Connection conn = null;
		boolean st=false;
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/wipro"; 
			Properties info = new Properties(); 
			info.put("user", "root"); 
			info.put("password", "MITHUN10"); 
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, info);
			PreparedStatement ps1=conn.prepareStatement("select * from userlogin where name=? and password=?");
			ps1.setString(1, name);
			ps1.setString(2, pass);
			ResultSet rs=ps1.executeQuery();
			st=rs.next();
				if(st) {
			PreparedStatement ps=conn.prepareStatement("update 'wipro'.'userlogin' set password=? where name=?");
			ps.setString(2, name);
			ps.setString(1, npswd);
			ps.executeUpdate();
			conn.commit();	
			ps.close();
				}
			ps1.close();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		}
		return st;
	}
}
