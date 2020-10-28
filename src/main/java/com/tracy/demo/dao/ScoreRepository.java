package com.tracy.demo.dao;

import com.tracy.demo.entity.TScoreLogs;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.Date;


public interface ScoreRepository extends PagingAndSortingRepository<TScoreLogs, BigDecimal>, JpaSpecificationExecutor<TScoreLogs> {
	
	@Query(value="select count(1) from t_score_logs t where t.customer_id =?1 and credit_mode='OUT'",nativeQuery=true)
	public Long countByCustomerAlreadyExchange(Integer customerId);
	
	@Query(value="select nvl(sum(t.amount),0) from t_score_logs t where t.customer_id =?1 and credit_mode='OUT' and created_date>=?2 and created_date<?3",nativeQuery=true)
	public BigDecimal sumByCustomerAlreadyExchange(Integer customerId,Date beginDate,Date endDate);
	
	
}
