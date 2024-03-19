package com.example.springbootdatajpademo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdatajpademo.dao.CustomersDao;
import com.example.springbootdatajpademo.model.Customers;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired	
	private CustomersDao customersDao;
	

	@Override
	
	public void addCustomer(Customers customer) {
		// TODO Auto-generated method stub
		customersDao.save(customer);

	}

	@Override
	public void updateCustomer(Customers customer) {
		// TODO Auto-generated method stub
		customersDao.save(customer);

	}

	@Override
	public void deleteCustomer(int custId) {
		// TODO Auto-generated method stub
		customersDao.deleteById(custId);

	}

	@Override
	public Customers getCustomerById(int custId) {
		// TODO Auto-generated method stub
		return customersDao.findById(custId).get();
	}

	@Override
	public List<Customers> getCustomers() {
		// TODO Auto-generated method stub
		return customersDao.findAll();
	}

	@Override
	public List<Customers> getCustomersByName(String custName) {
		// TODO Auto-generated method stub
		return customersDao.findAllByCustName(custName);
	}

	@Override
	public List<Customers> getCustomersByEmail(String custEmail) {
		// TODO Auto-generated method stub
		return  customersDao.findAllByCustEmail(custEmail);
	}

	@Override
	public List<Customers> getCustomersByIdAndName(int custId, String custName) {
		// TODO Auto-generated method stub
		return customersDao.findAllByCustIdAndCustName(custId, custName);
	}

}
