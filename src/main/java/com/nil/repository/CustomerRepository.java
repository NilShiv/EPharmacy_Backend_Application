package com.nil.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nil.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	Customer findByCustomerEmailId(String customerEmailId);
	
	Customer findByCustomerId(Integer customerId);
}
