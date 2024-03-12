package springcoreexamples.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigTester extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigurationsDemo.class);
		Address a1 = (Address) context.getBean("adr1");
		Address a2 = (Address) context.getBean("adr1");
		
	//	Address a = (Address) context.getBean(Address.class);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());

	}

}
