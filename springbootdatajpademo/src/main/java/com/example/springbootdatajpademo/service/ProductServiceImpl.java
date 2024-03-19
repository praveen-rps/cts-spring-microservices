package com.example.springbootdatajpademo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdatajpademo.dao.ProductDao;
import com.example.springbootdatajpademo.model.Product;


@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDao employeeDao;

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	
	// public Optional<Product> findById(int id) ;  nu
	
	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id).get();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
	
		return employeeDao.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return employeeDao.save(product);
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(id);
		
	}


	@Override
	public List<Product> findByIdGreaterThan(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findByIdGreaterThan(id);
	}
	@Override
	public List<Product> findByIdLessThan(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findByIdLessThan(id);
	}
	@Override
	public List<Product> findAllByNameGreaterThan(String name) {
		// TODO Auto-generated method stub
		return employeeDao.findAllByNameGreaterThan(name);
	}
	@Override
	public List<Product> findProductsByIdAndPrice(int id, double price) {
		// TODO Auto-generated method stub
		return employeeDao.findProductsByIdAndPrice(id, price);
	}
	@Override
	public List<Product> displayProductsSortedByPrice() {
		// TODO Auto-generated method stub
		return employeeDao.findAllByPriceDesc();
	}


	
}
