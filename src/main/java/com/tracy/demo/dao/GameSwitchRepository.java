package com.tracy.demo.dao;

import com.tracy.demo.entity.TGameSwitch;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.QueryHint;
import java.math.BigDecimal;
import java.util.List;

public interface GameSwitchRepository extends PagingAndSortingRepository<TGameSwitch, BigDecimal>, JpaSpecificationExecutor<TGameSwitch> {
	
	@Query("select t from TGameSwitch t where t.flag='1' and t.productId=?1")
	@QueryHints({ @QueryHint(name = "org.hibernate.cacheable", value ="true") })
	public List<TGameSwitch> findByProductId(String productId);
	
}
