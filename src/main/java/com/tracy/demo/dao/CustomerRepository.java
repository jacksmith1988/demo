package com.tracy.demo.dao;

import com.tracy.demo.entity.TCustomers;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.LockModeType;
import java.math.BigDecimal;
import java.util.List;


public interface CustomerRepository extends PagingAndSortingRepository<TCustomers, Integer>, JpaSpecificationExecutor<TCustomers> {
	TCustomers findByLoginName(String loginName);
    
//    @Override
//    @Lock(LockModeType.OPTIMISTIC_FORCE_INCREMENT)
//    TCustomers save(TCustomers entity);
	
	List<TCustomers> findByQq(String qq);
	
	List<TCustomers> findByEmail(String email);
	
	List<TCustomers> findByParentId(BigDecimal parentId);
	
	List<TCustomers> findByPhone(String phone);
	
	List<TCustomers> findByIpAddressAndCustomerType(String ip,String customerType);

	@Query(value = "SELECT T_CUSTOMERS_TRIAL_SEQ.NEXTVAL FROM DUAL",nativeQuery=true)
	Object findSequcen();
	
	//@Lock(value = LockModeType.OPTIMISTIC_FORCE_INCREMENT)
	@Lock(value = LockModeType.PESSIMISTIC_WRITE)
	@Query(value = "select j from TCustomers j where j.customerId = ?1 ")
	TCustomers findOne(BigDecimal id);
	
	
	
	
	@Query(nativeQuery=true,value="select t.* from t_customers t where t.ip_address in( select t1.ip_address from t_customers t1 group by t1.ip_address having count(1)>1 ) and house is null")
	List<TCustomers> getIpRepeat();
	
	@Query(nativeQuery=true,value="select t.* from t_customers t where t.qq in( select t1.qq from t_customers t1 group by t1.qq having count(1)>1 ) and house is null")
	List<TCustomers> getQqRepeat();
	
	@Query(nativeQuery=true,value="select t.* from t_customers t where t.email in( select t1.email from t_customers t1 group by t1.email having count(1)>1 ) and house is null")
	List<TCustomers> getEmailRepeat();
	
	@Query(nativeQuery=true,value="select t.* from t_customers t where t.phone in( select t1.phone from t_customers t1 group by t1.phone having count(1)>1 ) and house is null")
	List<TCustomers> getPhoneRepeat();
	
	@Query(nativeQuery=true,value="select count(1) from t_customers t where t.who_recommend_me =?1 and house is not null")
	Integer cnByRecommendRepeatCustomer(BigDecimal whoRecommendMe);
	
	@Query(nativeQuery=true,value="select count(1) from t_customers t where t.who_recommend_me =?1 ")
	Integer cnByRecommendTotalCustomer(BigDecimal whoRecommendMe);
}
