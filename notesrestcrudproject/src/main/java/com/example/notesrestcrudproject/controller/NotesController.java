package com.example.notesrestcrudproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.notesrestcrudproject.model.Notes;
import com.example.notesrestcrudproject.service.NoteService;

@RestController
@RequestMapping("/notes")
public class NotesController {
	
	@Autowired
	NoteService noteService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Notes> displayAllNotes() {
		return noteService.displayAllNotes();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Notes insertNotes(@RequestBody Notes notes) {
		return noteService.insertNotes(notes);
	}
	
	@GetMapping("/search/{pid}")
	@ResponseStatus(HttpStatus.OK)
	public Notes searchNotes(@PathVariable int pid) {
		return noteService.searchNotes(pid).get();
	}
	
	@DeleteMapping("/delete/{pid}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public boolean deleteNotes(@PathVariable int pid) {
		return noteService.deleteNotes(pid);
	}
}
