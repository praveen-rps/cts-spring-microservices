package springjdbcproject.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class NotesRowMapper implements RowMapper<Notes>{

	@Override
	public Notes mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return new Notes(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
	}

}
