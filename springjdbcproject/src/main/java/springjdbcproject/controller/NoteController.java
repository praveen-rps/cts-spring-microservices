package springjdbcproject.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springjdbcproject.configs.NotesConfigs;
import springjdbcproject.model.Notes;
import springjdbcproject.service.NoteServiceImpl;

public class NoteController {
	
	public static void main(String args[]) throws Exception {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(NotesConfigs.class);
		NoteServiceImpl service  = (NoteServiceImpl) context.getBean("noteservice");
		List<Notes> notes = service.displayAllNotes();
		notes.forEach(System.out::println);
		
		
	}

}
