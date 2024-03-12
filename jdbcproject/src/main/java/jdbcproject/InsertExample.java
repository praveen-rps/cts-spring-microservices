package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertExample {

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
		String sql = "insert into notes values (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.println("Enter pid ");
		int pid = sc.nextInt();
		System.out.println("Enter author");
		String author = sc.next();
		System.out.println("Enter title");
		String title = sc.next();
		System.out.println("Enter description");
		String description = sc.next();
		
		pst.setInt(1, pid);
		pst.setString(2, author);
		pst.setString(3, title);
		pst.setString(4, description);
		
		int k = pst.executeUpdate();
		
		System.out.println("Record inserted");
		// 6. close the objects
		
		pst.close();
		con.close();
	}


}
