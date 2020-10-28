package com.tracy.demo.dao;

import com.tracy.demo.entity.TPromotionConfig;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.List;

public interface PromotionConfigRepository  extends PagingAndSortingRepository<TPromotionConfig, BigDecimal>, JpaSpecificationExecutor<TPromotionConfig> {
	
	@Query("select t from TPromotionConfig t where t.promotionType='DEPOSIT' and t.flag=1 and t.customerLevel like %?1%  and minDeposit <= ?2 and maxDeposit>= ?2")
	public List<TPromotionConfig> findAvailablePromotion(String customerLevel,BigDecimal amount);
	
	@Query("select t from TPromotionConfig t where t.promotionType='DEPOSIT' and t.flag=1 ")
	public List<TPromotionConfig> findAvailablePromotion();
	
	
}
