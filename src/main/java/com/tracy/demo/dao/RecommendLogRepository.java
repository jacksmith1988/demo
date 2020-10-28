package com.tracy.demo.dao;

import com.tracy.demo.entity.TRecommendLogs;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;


public interface RecommendLogRepository extends PagingAndSortingRepository<TRecommendLogs, BigDecimal>, JpaSpecificationExecutor<TRecommendLogs> {
	
	
}
