package com.tracy.demo.dao;

import com.tracy.demo.entity.Bankaccount;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BankAccountRepository extends PagingAndSortingRepository<Bankaccount, Integer>, JpaSpecificationExecutor<Bankaccount> {
	
//	@Query("select a from Bankaccount a where bankname = ?1 and status = ?2")
//	public List<Bankaccount> findAccountnameAndstatus(String accountName,String status);
//	
//	@Query("select a from Bankaccount a where bankname != ?1 and status = ?2")
//	public List<Bankaccount> findAccountnameNotLikeAndstatusEquals(String accountName,String status);
	
	
	@Query("select a from Bankaccount a where type = ?1 and status =1 and cusLevel like %?2% order by a.id")
	public List<Bankaccount> findBankAccountList(String type,String custLevel);
	
	//card load
	@Query("select a.accountname,a.accountno from Bankaccount a where type = ?1 and status =1 and cusLevel like %?2% and bankcode <>'PHONE_PAY' and accountname = '点卡支付' group by a.accountname,a.accountno order by accountno ")
	public List<Object[]> findCardPayMethod(String type,String custLevel);
	
	@Query("select a.accountname,a.accountno from Bankaccount a where type = ?1 and status =1 and cusLevel like %?2%  and accountname <> '点卡支付' group by a.accountname,a.accountno order by accountno ")
	public List<Object[]> findOnlienPayMethod(String type,String custLevel);
	
	@Query("select a.accountname,a.accountno from Bankaccount a where type = ?1 and status =1 and cusLevel like %?2% and bankcode ='PHONE_PAY' and accountname <> '点卡支付' group by a.accountname,a.accountno order by accountno ")
	public List<Object[]> findOnlienPhonePayMethod(String type,String custLevel);
	
	public List<Bankaccount> findByBankcodeEquals(String bankCode);
}
