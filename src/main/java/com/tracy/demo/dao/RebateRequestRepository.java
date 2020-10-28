package com.tracy.demo.dao;

import com.tracy.demo.entity.TRebateRequests;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public interface RebateRequestRepository extends PagingAndSortingRepository<TRebateRequests, String>, JpaSpecificationExecutor<TRebateRequests> {
	
//	@Query(value="SELECT NVL(SUM(BETTING_AMOUNT),0) FROM T_REBATE_REQUESTS T WHERE T.CUSTOMER_ID = ?1 AND T.GAME_ID = 'AG' AND T.FLAG = 2 AND T.START_DATE >= TO_DATE(?2,'YYYY-MM-DD HH24:MI:SS') AND T.END_DATE <= TO_DATE(?3,'YYYY-MM-DD HH24:MI:SS')",nativeQuery=true)
	@Query(value="SELECT NVL(SUM(BETTING_AMOUNT),0) FROM T_REBATE_REQUESTS T WHERE T.CUSTOMER_ID = ?1 AND T.GAME_ID = 'AG' AND T.START_DATE >= ?2 AND T.END_DATE <= ?3",nativeQuery=true)
	List<Object[]> getRebateRequestTotalBetAmount(Integer customerId, Date beginTime,Date endTime);
	
	@Query(value="SELECT T_REQUEST_SEQ.NEXTVAL FROM DUAL",nativeQuery=true)
	List<BigDecimal> getSequence();
	
	@Query(value="SELECT COUNT(1) FROM T_REBATE_REQUESTS T WHERE T.REBATE_MODE = 1 AND T.FLAG='2' AND T.XM_TYPE = 'WEEKLY' AND T.START_DATE >= TO_DATE(?1,'YYYY-MM-DD HH24:MI:SS') AND T.END_DATE <= TO_DATE(?2,'YYYY-MM-DD HH24:MI:SS') and t.CREATED_BY=?3 ",nativeQuery=true)
	List<BigDecimal> isExistsBatchRebate(String beginTime,String endTime,String agentLoginName);
	
	
	@Query(value="SELECT nvl(sum(T.AMOUNT),0) FROM T_REBATE_REQUESTS T WHERE T.REBATE_MODE = 1 AND T.FLAG='2'  AND T.created_date >= ?1 AND T.created_date <= ?2 and t.CREATED_BY=?3 ",nativeQuery=true)
	List<BigDecimal> getTotalRebateByAgentName(Date beginTime,Date endTime,String agentLoginName);
}
