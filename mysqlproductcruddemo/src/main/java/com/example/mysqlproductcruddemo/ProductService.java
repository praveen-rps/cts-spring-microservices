package com.example.mysqlproductcruddemo;

import java.util.List;
import java.util.Optional;

public interface ProductService {
	
	public Product addProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(int pid);
	public void deleteProduct(int pid);
	public List<Product> searchProduct(String text);
	

}
