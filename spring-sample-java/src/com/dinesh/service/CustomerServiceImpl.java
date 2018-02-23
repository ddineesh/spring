package com.dinesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dinesh.model.Customer;
import com.dinesh.repository.CustomerRepository;
import com.dinesh.repository.HibernateCustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	
	CustomerRepository customerRepository;
	/* (non-Javadoc)
	 * @see com.dinesh.service.CustomerService#findAll()
	 */
	
	public  CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository)
	{
		this.customerRepository=customerRepository;
		System.out.println(" Constructor injection");
	}
	
	@Override
	public List<Customer> findAll()
	{
		return customerRepository.findAll();
	}
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println(" Setter injection");
		this.customerRepository = customerRepository;
	}
	
	
}
