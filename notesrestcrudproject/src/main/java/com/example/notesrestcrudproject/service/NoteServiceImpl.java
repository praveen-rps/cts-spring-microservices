package com.example.notesrestcrudproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notesrestcrudproject.dao.NotesDao;
import com.example.notesrestcrudproject.model.Notes;


@Service
public class NoteServiceImpl implements NoteService {
	
	
	@Autowired
	private NotesDao notesDao;
	
	
	
	public NoteServiceImpl(NotesDao notesDao) {
		super();
		this.notesDao = notesDao;
	}

	@Override
	public List<Notes> displayAllNotes() {
		// TODO Auto-generated method stub
		return notesDao.findAll();
	}

	@Override
	public Notes insertNotes(Notes notes) {
		// TODO Auto-generated method stub
		return notesDao.save(notes);
				}

	@Override
	public boolean deleteNotes(int pid) {
		// TODO Auto-generated method stub
		notesDao.deleteById(pid);
		return true;
	}

	@Override
	public Optional<Notes> searchNotes(int pid) {
		// TODO Auto-generated method stub
		return notesDao.findById(pid);
	}

}
