package notesproject.dao;

import java.util.List;

import notesproject.model.Notes;

public interface NotesDao {
	
	public List<Notes> displayAllNotes() throws Exception;
	public boolean insertNotes(Notes notes) throws Exception;
	public boolean deleteNotes(int pid) throws Exception;
	public List<Notes> searchNotes(int pid) throws Exception;

}
