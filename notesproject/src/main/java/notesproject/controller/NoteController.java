package notesproject.controller;

import java.util.List;
import java.util.Scanner;

import notesproject.model.Notes;
import notesproject.service.NoteService;
import notesproject.service.NoteServiceImpl;

public class NoteController {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		NoteService service = new NoteServiceImpl();
		
	//List<Notes> notes = 	service.displayAllNotes();
	
	//notes.forEach(System.out::println);
	Scanner sc = new Scanner(System.in);
	//System.out.println("enter pid to search");
	System.out.println("enter pid to delete");
	int pid = sc.nextInt();
	
	//List<Notes> notes = service.searchNotes(pid);
	boolean result = service.deleteNotes(pid);
	
	if(result)
		System.out.println("Deleted succesfully");
	else
		
		System.out.println("No record found");
	}
}
