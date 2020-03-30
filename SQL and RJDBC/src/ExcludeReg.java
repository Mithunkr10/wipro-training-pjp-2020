import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/* In the just concluded exercise, where you have established the connection successfully, 
 * exclude the registration process(by commenting the line containing the code Class.forName(“..”)). 
 * Observe the result.*/


public class ExcludeReg {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection dbConnection = null; 
		try { 
			String url = "jdbc:mysql://127.0.0.1:3306/wipro"; 
			Properties info = new Properties(); 
			info.put("user", "root"); 
			info.put("password", "MITHUN10"); 
		//	Class.forName("com.mysql.jdbc.Driver");
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
