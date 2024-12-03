package com.nil.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nil.entity.Card;
@Repository
public interface CardRepository extends CrudRepository<Card, String>{

}
