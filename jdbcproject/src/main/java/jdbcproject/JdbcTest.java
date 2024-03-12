package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	
	
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st;
		ResultSet rs;

		// TODO Auto-generated method stub
		try {
			
			// 1. Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Establish the connection
			String url = "jdbc:mysql://localhost:3306/ctsdb";
			String uid = "root";
			String pwd = "root";
			con = DriverManager.getConnection(url, uid, pwd);
			con.setAutoCommit(false);

			// 3. create the statment object
			st = con.createStatement();

			// 4. write the query and excute it
			String sql = "select * from notes";
			// String sql = "update notes set title='spring data jpa' where pid=9013";

			rs = st.executeQuery(sql);
			// int k = st.executeUpdate(sql);
			// 5. processs the data
			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
				;
			}

			// System.out.println(k+" Records updated...");
			// 6. close the objects
			con.commit();
			rs.close();
			st.close();
			con.close();
			
		}catch (SQLException e) {
				con.rollback();
		}  
		catch (Exception e) {

		}
		
	}

}
