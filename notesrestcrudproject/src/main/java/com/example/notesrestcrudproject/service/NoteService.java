package com.example.notesrestcrudproject.service;

import java.util.List;
import java.util.Optional;

import com.example.notesrestcrudproject.model.Notes;

public interface NoteService {
	
	public List<Notes> displayAllNotes();
	public Notes insertNotes(Notes notes);
	public boolean deleteNotes(int pid);
	public Optional<Notes> searchNotes(int pid);

}
