package com.tracy.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;


/**
 * Bankaccount entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "BANKACCOUNT")
public class Bankaccount implements java.io.Serializable {

	// Fields

	private Long id;
	private String bankcode;
	private String accountname;
	private String accountno;
	private String trustLevel;
	private String cusLevel;
	private String branch;
	private Double limitAmount;
	private String bankname;
	private String province;
	private String city;
	private String productId;
	private String remarks;
	private Double dailyDepositCredit;
	private Timestamp dailyDepositCreditDate;
	private String status;
	private String currency;
	private Double historyAmount;
	private String type;

	// Constructors

	/** default constructor */
	public Bankaccount() {
	}

	/** minimal constructor */
	public Bankaccount(Long id) {
		this.id = id;
	}

	/** full constructor */
	public Bankaccount(Long id, String bankcode, String accountname,
			String accountno, String trustLevel, String cusLevel,
			String branch, Double limitAmount, String bankname,
			String province, String city, String productId, String remarks,
			Double dailyDepositCredit, Timestamp dailyDepositCreditDate,
			String status, String currency, Double historyAmount) {
		this.id = id;
		this.bankcode = bankcode;
		this.accountname = accountname;
		this.accountno = accountno;
		this.trustLevel = trustLevel;
		this.cusLevel = cusLevel;
		this.branch = branch;
		this.limitAmount = limitAmount;
		this.bankname = bankname;
		this.province = province;
		this.city = city;
		this.productId = productId;
		this.remarks = remarks;
		this.dailyDepositCredit = dailyDepositCredit;
		this.dailyDepositCreditDate = dailyDepositCreditDate;
		this.status = status;
		this.currency = currency;
		this.historyAmount = historyAmount;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 11, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "BANKCODE", length = 30)
	public String getBankcode() {
		return this.bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	@Column(name = "ACCOUNTNAME", length = 100)
	public String getAccountname() {
		return this.accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	@Column(name = "ACCOUNTNO", length = 50)
	public String getAccountno() {
		return this.accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	@Column(name = "TRUST_LEVEL", length = 20)
	public String getTrustLevel() {
		return this.trustLevel;
	}

	public void setTrustLevel(String trustLevel) {
		this.trustLevel = trustLevel;
	}

	@Column(name = "CUS_LEVEL", length = 20)
	public String getCusLevel() {
		return this.cusLevel;
	}

	public void setCusLevel(String cusLevel) {
		this.cusLevel = cusLevel;
	}

	@Column(name = "BRANCH", length = 100)
	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Column(name = "LIMIT_AMOUNT", precision = 16)
	public Double getLimitAmount() {
		return this.limitAmount;
	}

	public void setLimitAmount(Double limitAmount) {
		this.limitAmount = limitAmount;
	}

	@Column(name = "BANKNAME", length = 100)
	public String getBankname() {
		return this.bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Column(name = "PROVINCE", length = 50)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "CITY", length = 50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "PRODUCT_ID", length = 3)
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Column(name = "REMARKS", length = 500)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "DAILY_DEPOSIT_CREDIT", precision = 16)
	public Double getDailyDepositCredit() {
		return this.dailyDepositCredit;
	}

	public void setDailyDepositCredit(Double dailyDepositCredit) {
		this.dailyDepositCredit = dailyDepositCredit;
	}

	@Column(name = "DAILY_DEPOSIT_CREDIT_DATE", length = 7)
	public Timestamp getDailyDepositCreditDate() {
		return this.dailyDepositCreditDate;
	}

	public void setDailyDepositCreditDate(Timestamp dailyDepositCreditDate) {
		this.dailyDepositCreditDate = dailyDepositCreditDate;
	}

	@Column(name = "STATUS", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "CURRENCY", length = 4)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "HISTORY_AMOUNT", precision = 22)
	public Double getHistoryAmount() {
		return this.historyAmount;
	}

	public void setHistoryAmount(Double historyAmount) {
		this.historyAmount = historyAmount;
	}
	@Column(name = "TYPE", length = 1)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}