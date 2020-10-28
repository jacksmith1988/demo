package com.tracy.demo.dao;

import com.tracy.demo.entity.TCustomerReport;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CustomerReportRepository extends PagingAndSortingRepository<TCustomerReport, Integer>, JpaSpecificationExecutor<TCustomerReport> {
	
	
	
}
