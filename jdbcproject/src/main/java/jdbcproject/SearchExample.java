package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		//1. Load the driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Establish the connection
		String url = "jdbc:mysql://localhost:3306/ctsdb";
		String uid="root";
		String pwd="root";
		Connection con = DriverManager.getConnection(url,uid,pwd);
		
		//3. create the statment object
		String sql = "select * from notes where pid=?";
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.println("Enter pid ");
		int pid = sc.nextInt();
		
		
		pst.setInt(1, pid);
		
		
		ResultSet rs = pst.executeQuery();
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		
		
		// 6. close the objects
		rs.close();
		pst.close();
		con.close();
	}
}
