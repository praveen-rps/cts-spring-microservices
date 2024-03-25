package com.example.notesrestcrudproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.notesrestcrudproject.model.Notes;


public interface NotesDao extends JpaRepository<Notes, Integer>{

}
