package com.example.springbootdatajpademo.service;

import java.util.List;

import com.example.springbootdatajpademo.model.Product;

public interface ProductService {
	
	
	
	
	public List<Product> getProducts();
	public Product getProductById(int id);
	public Product addProduct(Product product);
	public Product updateProduct(Product product);

	public void deleteProduct(int id);
	public List<Product> displayProductsSortedByPrice();
	public List<Product> findByIdGreaterThan(int id);
	public List<Product> findByIdLessThan(int id);
	public List<Product> findAllByNameGreaterThan(String name);
	public List<Product> findProductsByIdAndPrice(int id, double price);
}
