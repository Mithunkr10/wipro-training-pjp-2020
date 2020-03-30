import java.sql.*;

/*Create a stored procedure that calculates net salary of all the employees whose records are stored in table "emp".
The criteria for calculating net salary is as follows :
Gross salary = sal + comm.
Net Salary = gross salary - IT
If the employee's commission is null then IT is calculated as
IT =  10% of gross salary
else if the employees commission is less than 500, then IT is calculated as
IT =  15% of gross salary
else
IT = 20% of gross salary.
Develop a jdbc program that invokes this stored procedure by passing the empno. 
and in return gets the net salary of each employee. Display on screen the empno., 
ename and net salary of all the employees.*/


public class StoredProcedure {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		CallableStatement cstmt = null;		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wipro", "root", "MITHUN10");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// querying through emp table
		String sql = "SELECT * FROM emp";
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				double netSalary = 0;
				
				// querying to call calculate_salary()
				String sql2 = "{ call calculate_salary(?, ?) }";

				cstmt = conn.prepareCall(sql2);
				cstmt.setInt(1, empno);
				cstmt.registerOutParameter(2, Types.DOUBLE);
				cstmt.executeQuery();
				
				netSalary = cstmt.getDouble(2);
				
				System.out.println("empno: " + empno + ", ename: " + ename + ", net salary: " + netSalary);	
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error");

		}
		stmt.close();
		cstmt.close();
		conn.close();
	}
}
