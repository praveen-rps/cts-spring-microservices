package com.examples.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationBeans {
	
	@Autowired
	Shape shape;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AnnotationConfigClass.class);
		
		//Address adr = ctx.getBean(Address.class);
		Address adr = (Address) ctx.getBean("address");
		System.out.println(adr);
	//	Company cmp = ctx.getBean(Company.class);
		Company cmp = (Company) ctx.getBean("company");
		Company cmp1 = (Company) ctx.getBean("company");
		System.out.println(cmp);
		System.out.println(cmp1.hashCode());
		System.out.println(cmp.hashCode());
		
		Oraganization org = (Oraganization)ctx.getBean(Oraganization.class);
		System.out.println(org);
		
		
		ShapeService ss = 	ctx.getBean(ShapeService.class);
		ss.printArea();
	}

}
