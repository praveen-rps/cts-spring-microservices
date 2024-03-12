package springcoreexamples.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class DbService {
	
	@Autowired ////dao= new DbDao();
	DbDao dao;
	
	public DbService() {
		//dao= new DbDao();
	}
	
	public void getAllEmployees() {
		dao.getAllEmployees();
	}
	
	public void deleteEmployee(int empid) {
		dao.deleteEmployee(empid);
	}


}
