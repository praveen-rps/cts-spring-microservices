package springcoreexamples.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AnnotationConfigs.class);
		
		Address a = (Address) context.getBean("adr1");
		System.out.println(a);
	}

}
