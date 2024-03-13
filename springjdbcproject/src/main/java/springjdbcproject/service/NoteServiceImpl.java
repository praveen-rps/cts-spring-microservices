package springjdbcproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springjdbcproject.dao.NotesDao;
import springjdbcproject.model.Notes;

@Component("noteservice")
public class NoteServiceImpl implements NoteService {
	
	@Autowired
	NotesDao dao;

	@Override
	public List<Notes> displayAllNotes() throws Exception {
		// TODO Auto-generated method stub
		return dao.displayAllNotes();
	}

	@Override
	public boolean insertNotes(Notes notes) throws Exception {
		// TODO Auto-generated method stub
		return dao.insertNotes(notes);
	}

	@Override
	public boolean deleteNotes(int pid) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteNotes(pid);
	}

	@Override
	public List<Notes> searchNotes(int pid) throws Exception {
		// TODO Auto-generated method stub
		return dao.searchNotes(pid);
	}

}
