import java.sql.*;

import com.mysql.jdbc.Connection;

/*	
 Modify the above program to display all the rows where sal is greater than 1000 and less than 2000. 
 Display the columns ename, job, sal and comm.*/
public class WhereQuery {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
Connection con=null;
try {
	String url="jdbc:mysql://127.0.0.1:3306/wipro";
	String name="root";
	String pswd="MITHUN10";
	Class.forName("com.mysql.jdbc.Driver");
	con=(Connection) DriverManager.getConnection(url,name,pswd);
	
	if(con!=null)
	{
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from emp where sal>1000 and sal<2000;");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString(2)+" "+rs.getInt(4)+" "+rs.getInt(5));
		}
		rs.close();
		s.close();
	}
}
catch(Exception e) {
	e.printStackTrace();
}
con.close();
	}

}
