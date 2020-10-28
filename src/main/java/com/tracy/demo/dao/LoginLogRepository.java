package com.tracy.demo.dao;

import com.tracy.demo.entity.TLoginLogEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface LoginLogRepository extends PagingAndSortingRepository<TLoginLogEntity, Integer>, JpaSpecificationExecutor<TLoginLogEntity> {
	long countByLoginNameAndSource(String loginName,String source); 
}
