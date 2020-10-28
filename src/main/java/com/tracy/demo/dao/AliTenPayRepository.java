package com.tracy.demo.dao;

import com.tracy.demo.entity.TAliTenPay;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public interface AliTenPayRepository extends PagingAndSortingRepository<TAliTenPay, String>, JpaSpecificationExecutor<TAliTenPay> {
	public List<TAliTenPay> findByBillNoEndingWithAndCreateDateBetween(String billNo,Date startDate,Date endDate);
	
	public List<TAliTenPay> findByFlagEqualsAndNameEqualsAndAmountEquals(String flag,String name,BigDecimal amount);
	
	@Query(value="select * from t_ali_ten_pay where flag = ?1 and name=?2 and amount=?3 and vuser=?4 and create_date>=?5",nativeQuery=true)
	public List<TAliTenPay> findByVuser(String flag,String name,BigDecimal amount,String vuser,Date date);
	
	@Query(value="select * from t_ali_ten_pay where flag = ?1 and name=?2 and amount=?3 and create_date>=?4",nativeQuery=true)
	public List<TAliTenPay> findByNotVuser(String flag,String name,BigDecimal amount,Date date);
	
	@Query(value="select * from t_ali_ten_pay where flag = ?1 and amount=?2 and create_date>=?3",nativeQuery=true)
	public List<TAliTenPay> findByAmount(String flag,BigDecimal amount,Date date);
	
}	

