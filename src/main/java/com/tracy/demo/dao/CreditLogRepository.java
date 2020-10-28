package com.tracy.demo.dao;

import com.tracy.demo.entity.TCreditLogs;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface CreditLogRepository extends PagingAndSortingRepository<TCreditLogs, Integer>, JpaSpecificationExecutor<TCreditLogs> {
	//@Select("SELECT COUNT(1) FROM T_CREDIT_LOGS T WHERE T.CUSTOMER_ID = #{customerId} AND T.TRANS_CODE IN ('111101','111105')")
	@Query(nativeQuery=true,value="SELECT * FROM T_CREDIT_LOGS T WHERE T.CUSTOMER_ID = ?1 AND T.TRANS_CODE IN ?2")
	public List<TCreditLogs> findByTCustomersCustomerIdEqualsAndTransCodeIn(Integer customerId,List<String> transCodes);
	
	
	@Query(value="select nvl(sum(t.amount),0) from T_CREDIT_LOGS t where t.customer_id =?1 and trans_code='111109' and created_date>=?2 and created_date<?3",nativeQuery=true)
	public BigDecimal sumByCustomerAlreadyExchange(Integer customerId,Date beginDate,Date endDate);
	
	
	
	public TCreditLogs findTop1ByReferenceId(String referenceId);
	
	//获取红包雨中奖次数
	@Query(value="select count(1) from T_CREDIT_LOGS t where t.customer_id =?1 and trans_code='111601' and created_date>=?2 and created_date<?3",nativeQuery=true)
	public long countByCustomerWinPrize(Integer customerId,Date beginDate,Date endDate);
	
	
	
}
