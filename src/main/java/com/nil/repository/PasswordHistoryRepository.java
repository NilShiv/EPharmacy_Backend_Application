package com.nil.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nil.entity.PasswordHistory;

@Repository
public interface PasswordHistoryRepository extends CrudRepository<PasswordHistory, Integer>{

	List<PasswordHistory> findByCustomerIdOrderByCustomerId(Integer customerId);
}
