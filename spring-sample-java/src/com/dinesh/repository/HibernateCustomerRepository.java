package com.dinesh.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.dinesh.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepository implements CustomerRepository {

	
	/* (non-Javadoc)
	 * @see com.dinesh.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("Dinesh ");
		customer.setLastName("Dasaratharao");
		customers.add(customer);
		return customers;
	}

}
