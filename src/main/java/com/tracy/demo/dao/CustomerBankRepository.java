package com.tracy.demo.dao;

import com.tracy.demo.entity.TCustomerBanks;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.List;


public interface CustomerBankRepository extends PagingAndSortingRepository<TCustomerBanks, BigDecimal>, JpaSpecificationExecutor<TCustomerBanks> {
	
	public List<TCustomerBanks> findByCustomerId(Integer customerId);
	
	@Modifying
	@Query(value="DELETE T_CUSTOMER_BANKS a where a.customer_id=?1 and a.CUSTOMER_BANK_ID=?2",nativeQuery=true)
	public void deleteBankCard(Integer customerId,BigDecimal customerBankId);
	
	
	public long countByBankAccountNo(String bankAccountNo);
}
