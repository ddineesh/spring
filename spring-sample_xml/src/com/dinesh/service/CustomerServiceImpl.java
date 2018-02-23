package com.dinesh.service;

import java.util.List;

import com.dinesh.model.Customer;
import com.dinesh.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepository customerRepository;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
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

	/*
	 * example for setter based injection
	 * 
	 **/
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
