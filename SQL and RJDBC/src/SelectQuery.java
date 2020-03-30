import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Statement;

/*Write a java program that connects to oracle database, queries the inbuilt table “emp”
 *  and displays the first two columns (empno using column index and ename using column name ) of all the rows.*/


public class SelectQuery {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null; 
		
		
		try { 
			String url = "jdbc:mysql://127.0.0.1:3306/wipro"; 
			Properties info = new Properties(); 
			info.put("user", "root"); 
			info.put("password", "MITHUN10"); 
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, info); 
			if (con != null) 
			{ 
				System.out.println("Connection Established successfully"); 
				Statement s=(Statement) con.createStatement();
				ResultSet rs=s.executeQuery("SELECT ID,FIRST_NAME FROM emp;");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
				rs.close();
				s.close();
			} 
		
			
			
		} catch (Exception ex) 
			{ 
				System.out.println("Connection could  not be established"); 
				ex.printStackTrace(); 
			}
		con.close();
	}

}
