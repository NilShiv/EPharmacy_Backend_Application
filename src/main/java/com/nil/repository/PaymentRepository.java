package com.nil.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nil.entity.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer>{

}
