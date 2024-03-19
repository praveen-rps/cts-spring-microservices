package com.example.springbootdatajpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springbootdatajpademo.model.Customers;
import com.example.springbootdatajpademo.model.Product;
import com.example.springbootdatajpademo.service.CustomerService;
import com.example.springbootdatajpademo.service.ProductService;

@SpringBootApplication
public class SpringbootdatajpademoApplication implements CommandLineRunner{
	
	
	@Autowired 
	ProductService service;
	
	@Autowired 
	CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdatajpademoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		Product product1 = new Product(1, "Laptop", 2000);
		Product product2= new Product(2, "Mobile", 4000);
		Product product3= new Product(3, "Mobile", 3000);
		Product product4= new Product(4, "Ipad", 9000);
		Product product5 = new Product(5, "Tables", 5000);
		Product product6= new Product(6 ,"Chairs", 6000);
		service.addProduct(product1);
		service.addProduct(product2);
		service.updateProduct(product3);
		service.updateProduct(product4);
		service.addProduct(product6);
		
		service.addProduct(product5);
		
		service.displayProductsSortedByPrice().forEach(System.out::println);
		
		//service.findProductsByIdAndPrice(3, 4000).forEach(System.out::println);
		
		//service.getProducts().forEach(System.out::println);
		
		
		//service.getProducts().forEach(System.out::println);
		//service.deleteProduct(4);
		//service.getProducts().forEach(System.out::println);
		
		//service.findByIdLessThan(3).forEach(System.out::println);
		//service.findAllByNameGreaterThan("Mobile").forEach(System.out::println);
		//System.out.println(service.getProductById(8));
		
		*/
		Customers customer1 = new Customers(1, "Raj", "raj@gmail.com");
		Customers customer2 = new Customers(2, "Anil", "anil@gmail.com");
		Customers customer3 = new Customers(3, "Sunil", "sunil@gmail.com");
		
		customerService.addCustomer(customer1);
		customerService.addCustomer(customer2);
		customerService.addCustomer(customer3);
		customerService.getCustomers().forEach(System.out::println);
		
	}

}
