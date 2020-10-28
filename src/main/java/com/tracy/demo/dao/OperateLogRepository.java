package com.tracy.demo.dao;

import com.tracy.demo.entity.TOperatorLogs;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;

public interface OperateLogRepository extends PagingAndSortingRepository<TOperatorLogs, BigDecimal>, JpaSpecificationExecutor<TOperatorLogs> {

}
