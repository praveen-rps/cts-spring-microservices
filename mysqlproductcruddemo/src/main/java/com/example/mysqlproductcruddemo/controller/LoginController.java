package com.example.mysqlproductcruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mysqlproductcruddemo.Product;
import com.example.mysqlproductcruddemo.ProductService;
import com.example.mysqlproductcruddemo.UserDao;
import com.example.mysqlproductcruddemo.Users;

@Controller
public class LoginController {
	
	@Autowired
	UserDao dao;
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/deleteProduct")
	public String deleteProduct(@RequestParam int pid,Model model) {
		productService.deleteProduct(pid);
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "showProducts";
	}
	
	@GetMapping("/searchProduct")
	public String searchProduct(@RequestParam String pid, Model model) {
		//Product product = productService.getProductById(pid);
		List<Product> products = productService.searchProduct(pid);
		model.addAttribute("products", products);
		return "showProducts";
	}
	
	@GetMapping("/delete1")
	public String delete1() {
		return "delete1";
	}
	
	@GetMapping("/search")
	public String search() {
		return "search";
	}
	
	@GetMapping("/back")
	public String back() {
		return "valid";
	}
	
	@GetMapping("/display")
	public String display(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "showProducts";
	}
	
	
	@GetMapping("/registerUser")
	public String registerUser(@RequestParam String loginid, 
			@RequestParam("password") String password) {
		Users user = new Users(loginid, password);
		dao.save(user);
		return "login";
	}
	
	@GetMapping("addData")
	public String addData(
			@RequestParam("pid") int id,
			@RequestParam("pname") String name, 
			@RequestParam("price") int price,
			@RequestParam("quantity") int qty) {
		Product product = new Product(id, name, price, qty);
	
		productService.addProduct(product);
		
		return "valid";
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@GetMapping("/validate")
	public String validate(@RequestParam String loginid, 
			@RequestParam String password) {
		
		boolean isfound = false;

		List<Users> users = dao.findAll();
		
		
		for (Users usr : users) {
			if (usr.getUsername().equals(loginid) && usr.getPassword().equals(password)) {
				isfound = true;
				break;
			}
		}
		if (isfound)
			return "valid";
		else
			return "invalid";
	}
	
	@GetMapping("/add")
	public String add() {
		return "add";
	}

}
