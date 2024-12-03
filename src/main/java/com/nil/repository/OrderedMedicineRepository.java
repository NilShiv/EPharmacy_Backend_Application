package com.nil.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nil.entity.OrderedMedicine;

@Repository
public interface OrderedMedicineRepository extends CrudRepository<OrderedMedicine, Integer>{

}
