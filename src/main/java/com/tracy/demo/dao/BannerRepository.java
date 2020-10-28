package com.tracy.demo.dao;

import com.tracy.demo.entity.TBanner;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;


public interface BannerRepository extends PagingAndSortingRepository<TBanner, BigDecimal>, JpaSpecificationExecutor<TBanner> {

}
