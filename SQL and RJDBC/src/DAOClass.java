import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;

public class DAOClass {
	static Connection conn = null;

		PreparedStatement pstmt = null;
		
		public DAOClass() {}
		
		
		
		public boolean insert(int rollno, String name, String grade, String dob, int fee) {		
			String sql = "INSERT INTO stdnt VALUES(?, ?, ?, ?, ?)";
			
			try {
				pstmt = (PreparedStatement) conn.prepareStatement(sql);
				pstmt.setInt(1, rollno);
				pstmt.setString(2, name);
				pstmt.setString(3, grade);
				pstmt.setString(4, dob);
				pstmt.setInt(5, fee);
				pstmt.executeUpdate();
				
				return true;
			} catch (SQLException e) {
				return false;
			}
		}

		public boolean delete(int rollno) {
			String sql = "DELETE stdnt WHERE rollno = ?";
			
			try {
				pstmt = (PreparedStatement) conn.prepareStatement(sql);
				pstmt.setInt(1, rollno);
				pstmt.executeUpdate();
				
				return true;
			} catch (SQLException e) {
				return false;
			}
		}

		public boolean modify(int rollno, int fee) {
			String sql = "UPDATE stdnt SET fee = ? WHERE rollno = ?";
			
			try {
				pstmt = (PreparedStatement) conn.prepareStatement(sql);
				pstmt.setInt(1, fee);
				pstmt.setInt(2, rollno);
				pstmt.executeUpdate();
				
				return true;
			} catch (SQLException e) {
				return false;
			}
		}
		
		public boolean display(int rollno) {
			String sql = "SELECT * FROM stdnt WHERE rollno = ?";
			
			try {
				pstmt = (PreparedStatement) conn.prepareStatement(sql);
				pstmt.setInt(1, rollno);
				ResultSet rs = (ResultSet) pstmt.executeQuery();
				ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
				
				while (rs.next()) {
					StringBuilder sb = new StringBuilder();
					
					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						String colName = rsmd.getColumnName(i);
						
						sb.append(rs.getObject(colName));
						if (i != rsmd.getColumnCount()) sb.append(", ");
					}
					System.out.println(sb);
				}
				rs.close();
				return true;
			} catch (SQLException e) {
				return false;
			}
		}

		public boolean display() {
			String sql = "SELECT * FROM stdnt";
			
			try {
				pstmt = (PreparedStatement) conn.prepareStatement(sql);
				ResultSet rs = (ResultSet) pstmt.executeQuery();
				ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
				
				while (rs.next()) {
					StringBuilder sb = new StringBuilder();
					
					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						String colName = rsmd.getColumnName(i);
						
						sb.append(rs.getObject(colName));
						if (i != rsmd.getColumnCount()) sb.append(", ");
					}
					
					System.out.println(sb);
				}
				rs.close();
				return true;
			} catch (SQLException e) {
				return false;
			}
		}
		public static void main(String args[]) throws SQLException {
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306:wipro", "root", "MITHUN10");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		conn.close();
		}
	}
