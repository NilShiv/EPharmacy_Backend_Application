package com.nil.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nil.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>{

}
