package com.dinesh.service;

import java.util.List;

import com.dinesh.model.Customer;
import com.dinesh.repository.CustomerRepository;
import com.dinesh.repository.HibernateCustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepository customerRepository=new HibernateCustomerRepository();
	/* (non-Javadoc)
	 * @see com.dinesh.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		return customerRepository.findAll();
	}
	
	
}
