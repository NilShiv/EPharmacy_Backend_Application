package com.nil.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nil.entity.CustomerAddress;

@Repository
public interface CustomerAddressRepository extends CrudRepository<CustomerAddress, Integer> {

}
