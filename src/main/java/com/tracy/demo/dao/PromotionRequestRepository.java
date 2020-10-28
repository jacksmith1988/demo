package com.tracy.demo.dao;

import com.tracy.demo.entity.TPromotionRequests;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.Date;


public interface PromotionRequestRepository extends PagingAndSortingRepository<TPromotionRequests, String>, JpaSpecificationExecutor<TPromotionRequests> {
	
	@Query(value="select nvl(sum(amount),0) from t_promotion_requests t where t.created_date>=?1 and t.created_date<?2 and flag=2 and customer_id =?3 and t.promotion_type='RESCUE_TODAY'",nativeQuery=true)
	public BigDecimal findTotalRescueAmount(Date beginDate,Date endDate,Integer customerId);
	
	@Query(value="select nvl(count(1),0) from t_promotion_requests t where t.created_date>=?1 and t.created_date<?2 and flag=2 and customer_id =?3 and t.promotion_type='RESCUE_YESTERDAY'",nativeQuery=true)
	public BigDecimal findTotalRescueTimesOfRescueYesterday(Date beginDate,Date endDate,Integer customerId);
	
	@Query(value="select count(1) from t_promotion_requests t where t.promotion_config_id ='1000001368' and t.flag='2' and t.customer_id =?3 and created_date>=?1 and created_date<?2",nativeQuery=true)
	public BigDecimal findTodayFirstDepositNum(Date beginDate,Date endDate,Integer customerId);
}
