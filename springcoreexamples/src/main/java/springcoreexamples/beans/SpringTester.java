package springcoreexamples.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Address a = (Address) context.getBean("adr");
		System.out.println(a);
		Department d = (Department) context.getBean("dept");
		System.out.println(d);
		
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		

	}

}
