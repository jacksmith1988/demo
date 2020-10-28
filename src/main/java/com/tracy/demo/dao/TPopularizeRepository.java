package com.tracy.demo.dao;

import com.tracy.demo.entity.TPopularize;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;


public interface TPopularizeRepository extends PagingAndSortingRepository<TPopularize, Integer>, JpaSpecificationExecutor<TPopularize> {
	
	public	TPopularize findById(BigDecimal id);
	
}
