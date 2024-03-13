package notesproject.service;

import java.util.List;

import notesproject.dao.NotesDao;
import notesproject.dao.NotesDaoImpl;
import notesproject.model.Notes;

public class NoteServiceImpl implements NoteService {
	
	NotesDao dao;
	
	public NoteServiceImpl() {
		dao = new NotesDaoImpl();
	}

	@Override
	public List<Notes> displayAllNotes() throws Exception {
		// TODO Auto-generated method stub
		// addtional processing will be implemented
		return dao.displayAllNotes();
	}

	@Override
	public boolean insertNotes(Notes notes) throws Exception{
		// TODO Auto-generated method stub
		return dao.insertNotes(notes);
	}

	@Override
	public boolean deleteNotes(int pid) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteNotes(pid);
	}

	@Override
	public List<Notes> searchNotes(int pid) throws Exception{
		// TODO Auto-generated method stub
		return dao.searchNotes(pid);
	}

}
