package springjdbcproject.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import springjdbcproject.model.Notes;
import springjdbcproject.model.NotesRowMapper;

@Component
public class NotesDaoImpl implements NotesDao {

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Notes> displayAllNotes() throws Exception {
		// TODO Auto-generated method stub
		String sql = "select * from notes";
		List<Notes> notes = template.query(sql, new NotesRowMapper());
		return notes;
	}

	@Override
	public boolean insertNotes(Notes notes) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into notes values(?,?,?,?)";
		int k = template.update(sql, notes.getPid(), notes.getAuthor(), notes.getTitle(), notes.getDescription());
		if (k == 1)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteNotes(int pid) throws Exception {
		// TODO Auto-generated method stub
		String sql = "delete from notes where pid =?";
		int k = template.update(sql,pid);
		if (k == 1)
			return true;
		else
			return false;
	}

	@Override
	public List<Notes> searchNotes(int pid) throws Exception {
		// TODO Auto-generated method stub
		List<Notes> temp = null;
		String sql = "select * from notes where pid=?";
		List<Notes> notes = displayAllNotes();
		/*
		for(Notes n: notes) {
			if(n.getPid()==pid) {
				temp.add(n);
				
			}
		}
		*/
		temp = notes.stream().filter(n->n.getPid()==pid).map(p->p).collect(Collectors.toList());
		return temp;
	}

}
