import java.sql.*;
import java.util.*;
import java.util.Scanner;


/*Inserting a record
	ABC International School wants to computerize students details. 
	The school maintains a database of students in Oracle. 
	The student table contains information related to students and is shown in the following student table structure. 
	Column Name Type  Constraint
	Rollno Number (4) Primary Key
	StudentName Varchar (20)  Not Null
	Standard Varchar (2) Not Null
	Date_Of_Birth Date 
	Fees Number (9,2) 
	           
	 When a new student joins the school, the student record is inserted in the student table.  
	 The valid student details are as follows:
	• Rollno: Valid value is a 4-digit number 
	• StudentName: Valid value can contain maximum 20 letters in uppercase
	• Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X)
	Write a Java program to insert some records to the table*/
	
public class StudentInsert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wipro", "root", "MITHUN10");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = 0;
		do {
			System.out.print("Enter rollno: ");
			String rollstr = sc.nextLine();
			
			try {
				rollno = Integer.parseInt(rollstr);
				if (String.valueOf(rollno).length() != 4) rollno = 0;
			} catch (Exception e) {}
		} while (rollno == 0);
		
		String studentName = "";
		boolean lowercasefound;
		do {
			System.out.print("Enter name: ");
			studentName = sc.nextLine();
			
			lowercasefound = false;
			for (int i = 0; i < studentName.length(); i++) {
				if (Character.isLowerCase(studentName.charAt(i))) {
					lowercasefound = true;
					break;
				}
			}
			
		} while (studentName.length() > 20 || lowercasefound);
		
		String standard = "";
		String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
		List<String> list = new ArrayList<>(Arrays.asList(standards));
		do {
			System.out.print("Enter standard: ");
			standard = sc.nextLine();
		} while (!list.contains(standard));


		System.out.print("Enter D.O.B.: ");
		String dob = sc.nextLine();
		
		Double fees = 0.0;
		do {
			System.out.print("Enter fees: ");
			if (sc.hasNextDouble())
				fees = sc.nextDouble();
		} while (fees == 0.0);
		
		
		// inserting data into db
		String sql = "INSERT INTO stdnt VALUES(?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			pstmt.setString(2, studentName);
			pstmt.setString(3, standard);
			pstmt.setString(4, dob);
			pstmt.setDouble(5, fees);
			pstmt.executeQuery();
			System.out.println("Student added successfully");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error");

		}
		pstmt.close();
		conn.close();
		sc.close();
	}

}
