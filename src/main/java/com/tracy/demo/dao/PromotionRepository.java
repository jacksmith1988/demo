package com.tracy.demo.dao;

import com.tracy.demo.entity.TPromotionRequests;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.Date;


public interface PromotionRepository extends PagingAndSortingRepository<TPromotionRequests, BigDecimal>, JpaSpecificationExecutor<TPromotionRequests> {
	
	@Query(value="select count(1) from T_Promotion_Requests where customer_Id =?1",nativeQuery=true)
	public long countBytcustomerId(BigDecimal id);

	public long countByFlagIs(Integer status);

	@Query(value="select nvl(sum(t.amount),0) from t_promotion_requests t where t.customer_id =?1 and t.promotion_config_id=?2 and t.flag='2' and t.created_date>=?3 and t.created_date<=?4",nativeQuery=true)
	public BigDecimal sumPromotionAmountByCustomerIdAndConfigIdAndDate(Integer customerId,BigDecimal configId,Date beginDate,Date endDate);
	
	@Query(value="select nvl(sum(t.amount),0) from t_promotion_requests t where t.customer_id =?1 and t.promotion_config_id=?2 and t.flag='2' ",nativeQuery=true)
	public BigDecimal sumPromotionAmountByCustomerIdAndConfigId(Integer customerId,BigDecimal configId);
	
	@Query(value="select nvl(sum(t.amount),0) from t_promotion_requests t where t.customer_id =?1 and t.flag='2' and t.created_date>=?2 and t.created_date<=?3",nativeQuery=true)
	public BigDecimal sumPromotionAmountByCustomerId(Integer customerId,Date beginDate,Date endDate);
	
	public TPromotionRequests findByRequestId(String requestId);
	
	@Query(value="select * from ( select * from t_promotion_requests t where t.promotion_config_id = ?2 and flag='2' and t.customer_id=?1  order by id desc ) where rownum<2",nativeQuery=true)
	TPromotionRequests findTop1OrderbyCreatedDateDesc(Integer customerId,BigDecimal configId);
	
//	 long countByTCustomers_loginNameAndFlagAndPromotionConfigId(String loginName ,Integer flag ,BigDecimal configId);
//
//	 long countByTCustomers_loginNameAndFlagAndPromotionConfigIdAndCreatedDateBetween(String loginName ,Integer flag ,BigDecimal configId,Date startDate,Date endDate);
//
	 
	 long  countByReserve3AndFlagAndPromotionConfigId(String uuid,Integer flag,BigDecimal configId);
}
