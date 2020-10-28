package com.tracy.demo.dao;

import com.tracy.demo.entity.TTransferLogs;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TransferLogRepository extends PagingAndSortingRepository<TTransferLogs, String>, JpaSpecificationExecutor<TTransferLogs> {
	List<TTransferLogs> findByReturnCode(String returncode);
}
