package com.tracy.demo.dao;

import com.tracy.demo.entity.Dict;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface DictRepository extends PagingAndSortingRepository<Dict, String>, JpaSpecificationExecutor<Dict> {
	
	//@Cacheable(value="dictCache", key="#type")
	public List<Dict> findByType(String type);
	
}
