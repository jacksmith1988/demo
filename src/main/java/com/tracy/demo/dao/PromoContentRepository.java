package com.tracy.demo.dao;

import com.tracy.demo.entity.TPromoContent;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;


public interface PromoContentRepository extends PagingAndSortingRepository<TPromoContent, BigDecimal>, JpaSpecificationExecutor<TPromoContent> {

}
