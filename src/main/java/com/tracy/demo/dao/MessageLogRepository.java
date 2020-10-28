package com.tracy.demo.dao;

import com.tracy.demo.entity.TMessageLogs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.List;

public interface MessageLogRepository extends PagingAndSortingRepository<TMessageLogs, BigDecimal>, JpaSpecificationExecutor<TMessageLogs> {
	
	public Page<TMessageLogs> findByReceipients(String loginName, Pageable page);
	
	
	
	public TMessageLogs findByReceipientsAndMessageId(String loginName,BigDecimal id);
	
	public long countByReceipientsAndReadFalse(String loginName);
	
	
	@Query(value="delete T_MESSAGE_LOGS a where a.receipients = ?1 and MESSAGE_ID in ?2",nativeQuery=true)
	@Modifying
	public void deleteMessages(String loginName,List<BigDecimal> ids);
}
