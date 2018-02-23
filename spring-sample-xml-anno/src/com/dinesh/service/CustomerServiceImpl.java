package com.dinesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinesh.model.Customer;
import com.dinesh.repository.CustomerRepository;
import com.dinesh.repository.HibernateCustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	/** @Autowired - if you put on top any variable name it will be autowired by variable
	 * if you @Autowired on top any method it will auto wired through setter 
	 * if you @Autowired on top any constructor it will be constructor auto wired  **/
	
	CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	
	}
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dinesh.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
