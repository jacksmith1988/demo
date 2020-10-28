package com.tracy.demo.dao;

import com.tracy.demo.entity.TNotices;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.List;

public interface NoticeRepository extends PagingAndSortingRepository<TNotices, BigDecimal>, JpaSpecificationExecutor<TNotices> {
	public List<TNotices> findByGroupId(BigDecimal groupId);
	
	@Query("select t from TNotices t where t.flag=1 and groupId =1 order by sortOrder")
	public List<TNotices> findAvailableNotice();
}
