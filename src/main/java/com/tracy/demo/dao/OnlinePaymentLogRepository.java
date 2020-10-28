package com.tracy.demo.dao;

import com.tracy.demo.entity.TOnlinePaymentLogs;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.List;


public interface OnlinePaymentLogRepository extends PagingAndSortingRepository<TOnlinePaymentLogs, BigDecimal>, JpaSpecificationExecutor<TOnlinePaymentLogs> {
	List<TOnlinePaymentLogs> findByBillsNo(String billsno);
}
