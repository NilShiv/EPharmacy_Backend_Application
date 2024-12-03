package com.nil.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nil.entity.Medicine;

@Repository
public interface MedicineRepository extends PagingAndSortingRepository<Medicine, Integer>{

	List<Medicine> findByCategory(String category);
}
