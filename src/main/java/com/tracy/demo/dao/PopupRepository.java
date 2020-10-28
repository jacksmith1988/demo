package com.tracy.demo.dao;

import com.tracy.demo.entity.TPopup;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;


public interface PopupRepository  extends PagingAndSortingRepository<TPopup, BigDecimal>, JpaSpecificationExecutor<TPopup> {
	
}
