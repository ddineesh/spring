package com.dinesh.repository;

import java.util.List;

import com.dinesh.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}