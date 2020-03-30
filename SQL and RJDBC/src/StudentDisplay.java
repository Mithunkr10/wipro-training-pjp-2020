

	/*
	Display Student details
	Write the code to display details of all the students, if no roll no. is 
	passed, while executing the main program.
	If while executing the main program, the roll no. is passed, then it should 
	display the record of that particular student.
	 */



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class StudentDisplay {
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
			
			int rollno = 0;
			try {
				rollno = Integer.parseInt(args[0]);
			} catch (Exception e) {}
			
			
			try {			
				// select student data from stdnt table
				if (rollno != 0)
					sql = "SELECT * FROM stdnt WHERE rollno = ?";
				else 
					sql = "SELECT * FROM stdnt";
				
				pstmt = conn.prepareStatement(sql);
				if (rollno != 0) pstmt.setInt(1, rollno);
				ResultSet rs = pstmt.executeQuery();
				
				while (rs.next()) {
					int ROLLNO = rs.getInt("ROLLNO");
					String STUDENTNAME = rs.getString("STUDENTNAME");
					String STANDARD = rs.getString("STANDARD");
					String DATE_OF_BIRTH = rs.getString("DATE_OF_BIRTH");
					double FEES = rs.getDouble("FEES");
					
					System.out.println(ROLLNO + " " + STUDENTNAME + " " + STANDARD + 
							" " + DATE_OF_BIRTH + " " + FEES);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}		
			conn.close();
			sc.close();
		}

	}
