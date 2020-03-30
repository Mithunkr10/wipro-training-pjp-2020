	/*
	Deleting a Student’s record
	When a student leaves the school, the record related to that student needs 
	to be deleted from the Student table. The student’s roll no, whose record 
	has to be deleted, should be passed as a command line argument.
	Upon deletion, the Student details must be stored in another table named 
	StudentLog which will maintain the details such as Rollno, StudentName, 
	Standard and Leaving_date.
	CREATE TABLE stdnt_log (
		Rollno Number (4) Primary Key,
		StudentName Varchar (20)  Not Null,
		Standard Varchar (2) Not Null,
		Date_Of_Birth Date,
		Fees Number (9,2)
	);
	INSERT INTO wipro.stdnt_log VALUES(1001, 'BOB', 'IV', '1947-08-15', 4500.0);
	 */



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class StudentDelete {

		public static void main(String[] args) throws SQLException {
			Scanner sc = new Scanner(System.in);
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = "";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wipro", "root", "MITHUN10");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			int rollno = Integer.parseInt(args[0]);
			
			try {
				// backup/log student data to stdnt_log table
				sql = "INSERT INTO stdnt_log SELECT * FROM stdnt WHERE rollno = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, rollno);
				int logged = pstmt.executeUpdate();
				
				// delete student data from stdnt table
				sql = "DELETE FROM stdnt WHERE rollno = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, rollno);
				
				if (pstmt.executeUpdate() == 1 && logged == 1)
					System.out.println("Student having rollno = " + rollno + " deleted successfully");
				else
					System.out.println("Error");
				
			} catch (SQLException e) {
				e.printStackTrace();
			}		
			
			conn.close();
			sc.close();
		}

	}
