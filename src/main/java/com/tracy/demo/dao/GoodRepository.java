package com.tracy.demo.dao;

import com.tracy.demo.entity.TGoods;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.List;

public interface GoodRepository extends PagingAndSortingRepository<TGoods, BigDecimal>, JpaSpecificationExecutor<TGoods> {
	
	
	public List<TGoods> findByStateEqualsOrderByScoreAsc(String state);
}
