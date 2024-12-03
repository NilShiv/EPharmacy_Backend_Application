package com.nil.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nil.entity.CustomerCart;

@Repository
public interface CustomerCartRepository extends CrudRepository<CustomerCart, Integer>{

	List<CustomerCart> findByCustomerId(Integer customerId);
	
	CustomerCart findByCustomerIdAndMedicineId(Integer customerId, Integer medicineId);
	
	void deleteAllByCustomerId(Integer customerId);
	
	void deleteByCustomerId(Integer customerId);
	
	void deleteByCustomerIdAndMedicineId(Integer customerId, Integer medicineId);
}
 