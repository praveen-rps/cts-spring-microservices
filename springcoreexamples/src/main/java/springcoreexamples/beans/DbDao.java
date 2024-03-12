package springcoreexamples.beans;

import org.springframework.stereotype.Component;

@Component
public class DbDao {
	
	public void getAllEmployees() {
		System.out.println("connected to database and obtained all records");
	}
	
	public void deleteEmployee(int empid) {
		System.out.println("connected to database and deleted the give id in database");
	}



}
