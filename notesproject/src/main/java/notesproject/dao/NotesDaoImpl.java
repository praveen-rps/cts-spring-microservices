package notesproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import notesproject.model.Notes;

public class NotesDaoImpl implements NotesDao {

	@Override
	public List<Notes> displayAllNotes()  throws Exception{
		// TODO Auto-generated method stub
		Connection con = null;
		List<Notes> notesList= new ArrayList<>();
		Statement st;
		ResultSet rs;
		// TODO Auto-generated method stub
		
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
			rs = st.executeQuery(sql);
			
			// 5. processs the data
			while (rs.next()) {
				Notes note = new Notes(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				notesList.add(note);
			}

			// System.out.println(k+" Records updated...");
			// 6. close the objects
			con.commit();
			rs.close();
			st.close();
			con.close();
			
			return notesList;
			
		}
		
		
	

	@Override
	public boolean insertNotes(Notes notes) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Establish the connection
		String url = "jdbc:mysql://localhost:3306/ctsdb";
		String uid="root";
		String pwd="root";
		Connection con = DriverManager.getConnection(url,uid,pwd);
		
		//3. create the statment object
		String sql = "insert into notes values (?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		
		
		pst.setInt(1, notes.getPid());
		pst.setString(2, notes.getAuthor());
		pst.setString(3, notes.getTitle());
		pst.setString(4, notes.getDescription());
		
		int k = pst.executeUpdate();
		
		pst.close();
		con.close();
		if(k==1)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteNotes(int pid) throws Exception{
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Establish the connection
		String url = "jdbc:mysql://localhost:3306/ctsdb";
		String uid="root";
		String pwd="root";
		Connection con = DriverManager.getConnection(url,uid,pwd);
		
		//3. create the statment object
		String sql = "delete from notes where pid =?";
		PreparedStatement pst = con.prepareStatement(sql);
		
		
		pst.setInt(1, pid);
		
		
		int k = pst.executeUpdate();
		
		pst.close();
		con.close();
		if(k==1)
			return true;
		else
			return false;
	}

	@Override
	public List<Notes> searchNotes(int pid) throws Exception{
		// TODO Auto-generated method stub
		Connection con = null;
		List<Notes> notesList= new ArrayList<>();
		PreparedStatement pst;
		ResultSet rs;
		// TODO Auto-generated method stub
		
			// 1. Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Establish the connection
			String url = "jdbc:mysql://localhost:3306/ctsdb";
			String uid = "root";
			String pwd = "root";
			con = DriverManager.getConnection(url, uid, pwd);
			con.setAutoCommit(false);
			String sql = "select * from notes where pid=?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, pid);
			rs = pst.executeQuery();
			
			// 5. processs the data
			while (rs.next()) {
				Notes note = new Notes(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				notesList.add(note);
			}

			// System.out.println(k+" Records updated...");
			// 6. close the objects
			con.commit();
			rs.close();
			pst.close();
			con.close();
			
			return notesList;
			
	}

}
