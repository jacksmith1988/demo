package com.tracy.demo.dao;

import com.tracy.demo.entity.TBalanceCopy;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;

public interface BalanceCopyRepository extends PagingAndSortingRepository<TBalanceCopy, BigDecimal>, JpaSpecificationExecutor<TBalanceCopy> {

}
