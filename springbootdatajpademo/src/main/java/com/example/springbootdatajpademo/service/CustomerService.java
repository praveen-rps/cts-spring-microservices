package com.example.springbootdatajpademo.service;

import java.util.List;

import com.example.springbootdatajpademo.model.Customers;

public interface CustomerService {
	
	public void addCustomer(Customers customer);
    public void updateCustomer(Customers customer);
    public void deleteCustomer(int custId);
    public Customers getCustomerById(int custId);
    public List<Customers> getCustomers();
    public List<Customers> getCustomersByName(String custName);
    public List<Customers> getCustomersByEmail(String custEmail);
    public List<Customers> getCustomersByIdAndName(int custId, String custName);
    
    
   

}
