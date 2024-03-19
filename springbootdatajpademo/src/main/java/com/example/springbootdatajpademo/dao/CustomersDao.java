package com.example.springbootdatajpademo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootdatajpademo.model.Customers;


@Repository
public interface CustomersDao extends JpaRepository<Customers,Integer>{
	public List<Customers> findAllByCustName(String custName);
	public List<Customers> findAllByCustEmail(String custEmail);
	public List<Customers> findAllByCustIdAndCustName(int custId, String custName);
	

	
}
