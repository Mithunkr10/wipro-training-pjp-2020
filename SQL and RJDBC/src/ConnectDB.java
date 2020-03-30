import java.sql.*;
import java.util.Properties;

/* Write a java program that establishes a connection to oracle database successfully. 
 * If the connection is successful, it should display a message “Connection Established successfully”. 
 * In case, it is not able to do so due to any exception, it should display the message 
 * “Connection could  not be established “. If there is an exception, 
 * it should also display the description of the exception.
 * 
 * 	*/

public class ConnectDB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection dbConnection = null; 
		try { 
			String url = "jdbc:mysql://127.0.0.1:3306/wipro"; 
			Properties info = new Properties(); 
			info.put("user", "root"); 
			info.put("password", "MITHUN10"); 
			Class.forName("com.mysql.jdbc.Driver");
			dbConnection = DriverManager.getConnection(url, info); 
			if (dbConnection != null) 
			{ 
				System.out.println("Connection Established successfully"); 
				} 
		
			
			
		} catch (Exception ex) 
			{ 
				System.out.println("Connection could  not be established"); 
				ex.printStackTrace(); 
			}
		dbConnection.close();
	}

}
