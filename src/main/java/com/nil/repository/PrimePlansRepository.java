package com.nil.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nil.entity.PrimePlans;

@Repository
public interface PrimePlansRepository extends CrudRepository<PrimePlans, Integer>{

}
