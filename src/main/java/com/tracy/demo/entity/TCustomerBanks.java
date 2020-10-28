package com.tracy.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TCustomerBanks entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_CUSTOMER_BANKS")
//@SequenceGenerator(sequenceName="T_CUSTOMER_BANKS_ID_SEQ", name = "T_CUSTOMER_BANKS_ID_SEQ",allocationSize=1)
public class TCustomerBanks implements java.io.Serializable {

	// Fields

	private BigDecimal customerBankId;
	private String bankAccountName;
	private String bankAccountNo;
	private String bankAccountType;
	private String bankCountry;
	private String bankCity;
	private String bankName;
	private String branchName;
	private String createdBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Timestamp createdDate;
	private Integer customerId;
	private Boolean flag;
	private String remarks;
	private Byte priorityOrder;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Timestamp lastUpdate;
	private String lastUpdatedBy;
	private String currency;

	// Constructors

	/** default constructor */
	public TCustomerBanks() {
	}

	/** minimal constructor */
	public TCustomerBanks(BigDecimal customerBankId, String bankAccountName,
			String bankAccountNo, String bankAccountType, String bankCountry,
			String bankCity, String bankName, String branchName,
			String createdBy, Timestamp createdDate, Integer customerId,
			Boolean flag, Byte priorityOrder) {
		this.customerBankId = customerBankId;
		this.bankAccountName = bankAccountName;
		this.bankAccountNo = bankAccountNo;
		this.bankAccountType = bankAccountType;
		this.bankCountry = bankCountry;
		this.bankCity = bankCity;
		this.bankName = bankName;
		this.branchName = branchName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.customerId = customerId;
		this.flag = flag;
		this.priorityOrder = priorityOrder;
	}

	/** full constructor */
	public TCustomerBanks(BigDecimal customerBankId, String bankAccountName,
			String bankAccountNo, String bankAccountType, String bankCountry,
			String bankCity, String bankName, String branchName,
			String createdBy, Timestamp createdDate, Integer customerId,
			Boolean flag, String remarks, Byte priorityOrder,
			Timestamp lastUpdate, String lastUpdatedBy, String currency) {
		this.customerBankId = customerBankId;
		this.bankAccountName = bankAccountName;
		this.bankAccountNo = bankAccountNo;
		this.bankAccountType = bankAccountType;
		this.bankCountry = bankCountry;
		this.bankCity = bankCity;
		this.bankName = bankName;
		this.branchName = branchName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.customerId = customerId;
		this.flag = flag;
		this.remarks = remarks;
		this.priorityOrder = priorityOrder;
		this.lastUpdate = lastUpdate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.currency = currency;
	}

	// Property accessors
	@Id
	@Column(name = "CUSTOMER_BANK_ID", unique = true, nullable = false, precision = 22, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_CUSTOMER_BANKS_ID_SEQ")
	public BigDecimal getCustomerBankId() {
		return this.customerBankId;
	}

	public void setCustomerBankId(BigDecimal customerBankId) {
		this.customerBankId = customerBankId;
	}

	@Column(name = "BANK_ACCOUNT_NAME", nullable = false, length = 50)
	public String getBankAccountName() {
		return this.bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	@Column(name = "BANK_ACCOUNT_NO", nullable = false, length = 50)
	public String getBankAccountNo() {
		return this.bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	@Column(name = "BANK_ACCOUNT_TYPE", nullable = false, length = 50)
	public String getBankAccountType() {
		return this.bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	@Column(name = "BANK_COUNTRY", nullable = false, length = 50)
	public String getBankCountry() {
		return this.bankCountry;
	}

	public void setBankCountry(String bankCountry) {
		this.bankCountry = bankCountry;
	}

	@Column(name = "BANK_CITY", nullable = false, length = 100)
	public String getBankCity() {
		return this.bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	@Column(name = "BANK_NAME", nullable = false, length = 80)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "BRANCH_NAME", nullable = false, length = 100)
	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Column(name = "CREATED_BY", nullable = false, length = 50)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "CREATED_DATE", nullable = false, length = 7)
	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "CUSTOMER_ID", nullable = false, precision = 22, scale = 0)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "FLAG", nullable = false, precision = 1, scale = 0)
	public Boolean getFlag() {
		return this.flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	@Column(name = "REMARKS", length = 500)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "PRIORITY_ORDER", nullable = false, precision = 2, scale = 0)
	public Byte getPriorityOrder() {
		return this.priorityOrder;
	}

	public void setPriorityOrder(Byte priorityOrder) {
		this.priorityOrder = priorityOrder;
	}

	@Column(name = "LAST_UPDATE", length = 7)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "LAST_UPDATED_BY", length = 50)
	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Column(name = "CURRENCY", length = 4)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}