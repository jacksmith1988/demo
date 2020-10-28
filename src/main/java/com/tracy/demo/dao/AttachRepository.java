package com.tracy.demo.dao;

import com.tracy.demo.entity.TAttach;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;

public interface  AttachRepository extends PagingAndSortingRepository<TAttach, BigDecimal>, JpaSpecificationExecutor<TAttach> {

}
