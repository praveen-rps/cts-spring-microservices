package springcoreexamples.beans;

public class DbTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DbService service = new DbService();
		service.getAllEmployees();
		service.deleteEmployee(1001);

	}

}
