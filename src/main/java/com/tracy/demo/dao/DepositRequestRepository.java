package com.tracy.demo.dao;

import com.tracy.demo.entity.TDepositRequests;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public interface DepositRequestRepository extends PagingAndSortingRepository<TDepositRequests, BigDecimal>, JpaSpecificationExecutor<TDepositRequests> {
	
	public TDepositRequests findByRequestId(String billNo);
	
	public List<TDepositRequests> findByCreatedDateBetweenAndAmountEqualsAndDepositLocation(Date beginDate,Date endDate,Double amount,String depositLocation);
	
	@Query(value="select t.* from t_deposit_requests t where t.created_date>=?1 and t.created_date<?2 and flag=0 and deposit_by = ?3 and amount =?4 ",nativeQuery=true)
	public List<TDepositRequests> findByCreatedDateBetweenAndflagEqualsAndDepositByEqualsAndAmountEquals(Date beginDate,Date endDate,String depositBy,String amount);
	
	@Query(value="select t.* from t_deposit_requests t where t.created_date>=?1 and t.created_date<?2 and flag=0 and amount =?3 ",nativeQuery=true)
	public List<TDepositRequests> findNotByDepositBy(Date beginDate,Date endDate,String amount);
	
	
	@Query(value="select nvl(sum(amount),0) from t_deposit_requests t where t.created_date>=?1 and t.created_date<?2 and flag=2 and customer_id =?3",nativeQuery=true)
	public BigDecimal findByCreatedDateBetweenAndflagEquals(Date beginDate,Date endDate,Integer customerId);
	
	public List<TDepositRequests> findByFlagAndTCustomers_CustomerId(int flag,Integer customerId);
	
	public List<TDepositRequests> findByFlagAndTCustomers_CustomerIdAndDepositType(int flag,Integer customerId,String depositType);
	
	public List<TDepositRequests> findByFlagAndDepositTypeAndCreatedDateBetweenAndAmount(int flag,String depositType,Date startDate,Date endDate,Double amount);
	
	public List<TDepositRequests> findByOnlineBillNo(String billNo);
	
	public List<TDepositRequests> findByOnlineBillNoAndCreatedDateBetween(String billNo,Date startDate,Date endDate);
	
	public List<TDepositRequests> findByOnlineBillNoAndTCustomers_CustomerId(String onlineBillNo,Integer customerId);
	
	
	public TDepositRequests findFirst1ByTCustomers_customerIdAndDepositTypeOrderByCreatedDateDesc(BigDecimal id,String depositType);
	
	@Query(value="select * from t_deposit_requests where created_date in (select max(created_date) from t_deposit_requests where deposit_type = ?3 and bank_name =?1 and customer_id =?2)"
			+" and  deposit_type = ?3 and bank_name =?1 and customer_id =?2 ",nativeQuery=true)
	public List<TDepositRequests> findDepositNameByTypeAndCreatedByAndBankName(String bankName,Integer customerId,String type);
	
	@Query(value="select * from t_deposit_requests where deposit_type =?3  and flag = 0 and bank_name =?1 and customer_id =?2 and rownum<2 ",nativeQuery=true)
	public List<TDepositRequests> findExitDepositRequest(String bankName,Integer customerId,String type);
	
	long countByFlagAndTCustomers_CustomerId(int flag,Integer customerId);
	
	long countByFlagAndTCustomers_CustomerIdAndCreatedDateBetween(int flag,Integer customerId,Date startDate,Date endDate);
	
	long countByFlagAndTCustomers_CustomerIdAndCreatedDateBetweenAndSmsStatus(int flag,Integer customerId,Date startDate,Date endDate,String deviceType);
	
	@Query(value="select t.login_name,nvl(sum(a.amount),0) from t_customers t left join t_deposit_requests a on t.customer_id = a.customer_id where t.who_recommend_me =?1 and t.house is null and a.flag='2' group by t.login_name",nativeQuery=true)
	List<Object[]> findRecommendCustomerDepositArray(BigDecimal whoReconmmendMe);
}
