package com.tracy.demo.dao;

import com.tracy.demo.entity.TWithdrawalRequests;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.Date;


public interface WithDrawRequestRepository extends PagingAndSortingRepository<TWithdrawalRequests, BigDecimal>, JpaSpecificationExecutor<TWithdrawalRequests> {
	
	public TWithdrawalRequests findByCustomerIdAndIdAndFlag(Integer customerId,BigDecimal id,int flag);
	
	
	@Query(value="select nvl(sum(amount),0) from t_withdrawal_requests t where t.created_date>=?1 and t.created_date<?2 and flag in(1,2) and customer_id =?3",nativeQuery=true)
	public BigDecimal findByCreatedDateBetweenAndflagEquals(Date beginDate,Date endDate,Integer customerId);
	
	@Query(value="select nvl(count(1),0) from t_withdrawal_requests t where t.created_date>=?1 and t.created_date<?2 and customer_id =?3 and flag in(1,2)",nativeQuery=true)
	public BigDecimal findWithdrawalRecord(Date beginDate,Date endDate,Integer customerId);
	
	@Query(value="select nvl(count(1),0) from t_withdrawal_requests t where t.created_date>=?1 and t.created_date<?2 and flag=0 and customer_id =?3",nativeQuery=true)
	public BigDecimal findPendingWithdrawalRecord(Date beginDate,Date endDate,Integer customerId);
	
	@Query(value="select nvl(count(1),0) from t_withdrawal_requests t where flag=0 and customer_id =?1",nativeQuery=true)
	public BigDecimal findPendingWithdrawalRecord(Integer customerId);
	
	@Query(value="select nvl(count(1),0) from t_withdrawal_requests t where flag in (1,2) and customer_id =?1",nativeQuery=true)
	public BigDecimal findWithdrawalSuccessCount(Integer customerId);
	
	@Query(value="select nvl(sum(t.amount),0) from t_withdrawal_requests t where  t.flag=1 and t.customer_id = ?1",nativeQuery=true)
	public BigDecimal findTotalWithDrawal(Integer customerId);
}
