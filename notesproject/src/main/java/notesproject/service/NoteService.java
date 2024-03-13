package notesproject.service;

import java.util.List;

import notesproject.model.Notes;

public interface NoteService {
	
	public List<Notes> displayAllNotes() throws Exception;
	public boolean insertNotes(Notes notes) throws Exception;
	public boolean deleteNotes(int pid) throws Exception;
	public List<Notes> searchNotes(int pid) throws Exception;
	

}
