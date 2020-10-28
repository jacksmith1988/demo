package com.tracy.demo.dao;

import com.tracy.demo.entity.TOnlinePaymentConfig;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.List;


public interface OnlinePayConfigRepository  extends PagingAndSortingRepository<TOnlinePaymentConfig, BigDecimal>, JpaSpecificationExecutor<TOnlinePaymentConfig> {
	public List<TOnlinePaymentConfig> findByPayId(String payId);
	
	@Query(value="select * from t_online_payment_config where (start_time <= sysdate or start_time is null) and  (end_time >= sysdate or end_time is null) and flag='1' and domain_name like %?1%",nativeQuery=true)
	public List<TOnlinePaymentConfig> findRecords(String level);
}
