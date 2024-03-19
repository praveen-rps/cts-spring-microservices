package com.example.springbootdatajpademo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springbootdatajpademo.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
	 
		List<Product> findByIdGreaterThan(int id);
		
		List<Product> findByIdLessThan(int id);
		
		List<Product> findAllByNameGreaterThan(String name);
		
		@Query("from Product where id=?1and price=?2")	
		List<Product> findProductsByIdAndPrice(int id, double price);
		
		@Query("from Product order by price")
		public List<Product> findAllByPriceDesc();
		
		
		
}
