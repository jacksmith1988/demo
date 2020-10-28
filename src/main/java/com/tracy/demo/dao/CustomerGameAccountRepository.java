package com.tracy.demo.dao;

import com.tracy.demo.entity.TCustomersGameAccount;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;

public interface CustomerGameAccountRepository extends PagingAndSortingRepository<TCustomersGameAccount, BigDecimal>, JpaSpecificationExecutor<TCustomersGameAccount> {

}
