package com.tracy.demo.dao;

import com.tracy.demo.entity.TCustomerLevels;
import com.tracy.demo.entity.TCustomerLevelsId;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CustomerLevelRepository extends PagingAndSortingRepository<TCustomerLevels, TCustomerLevelsId>, JpaSpecificationExecutor<TCustomerLevels> {

	
	
}
