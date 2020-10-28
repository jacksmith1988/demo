package com.tracy.demo.dao;

import com.tracy.demo.entity.TRecommend;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.List;


public interface RecommendRepository extends PagingAndSortingRepository<TRecommend, BigDecimal>, JpaSpecificationExecutor<TRecommend> {
	
	List<TRecommend> findByLoginName(String loginName);
	
	
}
