package com.tracy.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * TWithdrawalRequests entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_WITHDRAWAL_REQUESTS")
//@SequenceGenerator(sequenceName="T_DRAW_ID_SEQ", name = "T_DRAW_ID_SEQ",allocationSize=1)
public class TWithdrawalRequests implements java.io.Serializable {

	// Fields
	private BigDecimal id;
	private String requestId;
	private Double amount;
	private String bankAccountName;
	private String bankAccountNo;
	private String bankAccountType;
	private String bankCity;
	private String bankName;
	private String branchName;
	private String createdBy;
	private Timestamp createdDate;
	private String currency;
	private Integer customerId;
	private String email;
	private String emailStatus;
	private int flag;
	private String ipAddress;
	private Timestamp lastUpdate;
	private String lastUpdatedBy;
	private String phone;
	private Boolean priorityType;
	private String processedBy;
	private Timestamp processedDate;
	private String remarks;
	private String smsStatus;
	private Boolean sameFlag;
	private BigDecimal customerLevel;
	private String bitcoinId;
	private String secondCurrency;
	private String exchangeRate;
	private Double exchangedAmount;
	private Double exchangeRateExt;
	private Double settleAmount;
	private String settleCurrency;

	
	private com.tracy.demo.entity.TCustomers tCustomers;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "CUSTOMER_ID",insertable = false, updatable = false)
	public com.tracy.demo.entity.TCustomers gettCustomers() {
		return tCustomers;
	}

	public void settCustomers(com.tracy.demo.entity.TCustomers tCustomers) {
		tCustomers = tCustomers;
	}
	
//	private TCustomers tCustomers;
//	
//	@Transient
//	public TCustomers getTCustomers() {
//		return tCustomers;
//	}
//
//	public void setTCustomers(TCustomers tCustomers) {
//		this.tCustomers = tCustomers;
//	}
//	
//	@ManyToOne(fetch=FetchType.EAGER)
//	@JoinColumn(name = "CUSTOMER_ID")
//	public TCustomers gettCustomers() {
//		return tCustomers;
//	}
//
//	public void settCustomers(TCustomers tCustomers) {
//		this.tCustomers = tCustomers;
//	}
	// Constructors

	/** default constructor */
	public TWithdrawalRequests() {
	}

	/** minimal constructor */
	public TWithdrawalRequests(String requestId, String bankAccountName,
			String bankAccountNo, String bankAccountType, String bankCity,
			String bankName, String branchName, Timestamp createdDate,
			String currency, Integer customerId, Boolean flag,
			BigDecimal customerLevel) {
		this.requestId = requestId;
		this.bankAccountName = bankAccountName;
		this.bankAccountNo = bankAccountNo;
		this.bankAccountType = bankAccountType;
		this.bankCity = bankCity;
		this.bankName = bankName;
		this.branchName = branchName;
		this.createdDate = createdDate;
		this.currency = currency;
		this.customerId = customerId;
//		this.flag = flag;
		this.customerLevel = customerLevel;
	}

	/** full constructor */
	public TWithdrawalRequests(String requestId, Double amount,
			String bankAccountName, String bankAccountNo,
			String bankAccountType, String bankCity, String bankName,
			String branchName, String createdBy, Timestamp createdDate,
			String currency, Integer customerId, String email,
			String emailStatus, Boolean flag, String ipAddress,
			Timestamp lastUpdate, String lastUpdatedBy, String phone,
			Boolean priorityType, String processedBy, Timestamp processedDate,
			String remarks, String smsStatus, Boolean sameFlag,
			BigDecimal customerLevel, String bitcoinId, String secondCurrency,
			String exchangeRate, Double exchangedAmount,
			Double exchangeRateExt, Double settleAmount, String settleCurrency) {
		this.requestId = requestId;
		this.amount = amount;
		this.bankAccountName = bankAccountName;
		this.bankAccountNo = bankAccountNo;
		this.bankAccountType = bankAccountType;
		this.bankCity = bankCity;
		this.bankName = bankName;
		this.branchName = branchName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.currency = currency;
		this.customerId = customerId;
		this.email = email;
		this.emailStatus = emailStatus;
//		this.flag = flag;
		this.ipAddress = ipAddress;
		this.lastUpdate = lastUpdate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.phone = phone;
		this.priorityType = priorityType;
		this.processedBy = processedBy;
		this.processedDate = processedDate;
		this.remarks = remarks;
		this.smsStatus = smsStatus;
		this.sameFlag = sameFlag;
		this.customerLevel = customerLevel;
		this.bitcoinId = bitcoinId;
		this.secondCurrency = secondCurrency;
		this.exchangeRate = exchangeRate;
		this.exchangedAmount = exchangedAmount;
		this.exchangeRateExt = exchangeRateExt;
		this.settleAmount = settleAmount;
		this.settleCurrency = settleCurrency;
	}

	// Property accessors
	@Column(name = "REQUEST_ID", unique = false, nullable = true, length = 19)
	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Column(name = "AMOUNT", precision = 22)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "BANK_ACCOUNT_NAME", nullable = true, length = 50)
	public String getBankAccountName() {
		return this.bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	@Column(name = "BANK_ACCOUNT_NO", nullable = true, length = 50)
	public String getBankAccountNo() {
		return this.bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	@Column(name = "BANK_ACCOUNT_TYPE", nullable = true, length = 50)
	public String getBankAccountType() {
		return this.bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	@Column(name = "BANK_CITY", nullable = true, length = 100)
	public String getBankCity() {
		return this.bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	@Column(name = "BANK_NAME", nullable = true, length = 50)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "BRANCH_NAME", nullable = true, length = 100)
	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Column(name = "CREATED_BY", length = 50)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "CREATED_DATE", nullable = true, length = 7)
	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "CURRENCY", nullable = true, length = 10)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "CUSTOMER_ID", nullable = true, precision = 22, scale = 0)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "EMAIL", length = 256)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "EMAIL_STATUS", length = 20)
	public String getEmailStatus() {
		return this.emailStatus;
	}

	public void setEmailStatus(String emailStatus) {
		this.emailStatus = emailStatus;
	}

	@Column(name = "FLAG", nullable = true, precision = 1, scale = 0)
	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Column(name = "IP_ADDRESS", length = 60)
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
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

	@Column(name = "PHONE", length = 30)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "PRIORITY_TYPE", precision = 1, scale = 0)
	public Boolean getPriorityType() {
		return this.priorityType;
	}

	public void setPriorityType(Boolean priorityType) {
		this.priorityType = priorityType;
	}

	@Column(name = "PROCESSED_BY", length = 50)
	public String getProcessedBy() {
		return this.processedBy;
	}

	public void setProcessedBy(String processedBy) {
		this.processedBy = processedBy;
	}

	@Column(name = "PROCESSED_DATE", length = 7)
	public Timestamp getProcessedDate() {
		return this.processedDate;
	}

	public void setProcessedDate(Timestamp processedDate) {
		this.processedDate = processedDate;
	}

	@Column(name = "REMARKS", length = 2000)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "SMS_STATUS", length = 20)
	public String getSmsStatus() {
		return this.smsStatus;
	}

	public void setSmsStatus(String smsStatus) {
		this.smsStatus = smsStatus;
	}

	@Column(name = "SAME_FLAG", precision = 1, scale = 0)
	public Boolean getSameFlag() {
		return this.sameFlag;
	}

	public void setSameFlag(Boolean sameFlag) {
		this.sameFlag = sameFlag;
	}

	@Column(name = "CUSTOMER_LEVEL", nullable = true, precision = 22, scale = 0)
	public BigDecimal getCustomerLevel() {
		return this.customerLevel;
	}

	public void setCustomerLevel(BigDecimal customerLevel) {
		this.customerLevel = customerLevel;
	}

	@Column(name = "BITCOIN_ID", length = 30)
	public String getBitcoinId() {
		return this.bitcoinId;
	}

	public void setBitcoinId(String bitcoinId) {
		this.bitcoinId = bitcoinId;
	}

	@Column(name = "SECOND_CURRENCY", length = 20)
	public String getSecondCurrency() {
		return this.secondCurrency;
	}

	public void setSecondCurrency(String secondCurrency) {
		this.secondCurrency = secondCurrency;
	}

	@Column(name = "EXCHANGE_RATE", length = 50)
	public String getExchangeRate() {
		return this.exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	@Column(name = "EXCHANGED_AMOUNT", precision = 22)
	public Double getExchangedAmount() {
		return this.exchangedAmount;
	}

	public void setExchangedAmount(Double exchangedAmount) {
		this.exchangedAmount = exchangedAmount;
	}

	@Column(name = "EXCHANGE_RATE_EXT", precision = 10, scale = 5)
	public Double getExchangeRateExt() {
		return this.exchangeRateExt;
	}

	public void setExchangeRateExt(Double exchangeRateExt) {
		this.exchangeRateExt = exchangeRateExt;
	}

	@Column(name = "SETTLE_AMOUNT", precision = 22)
	public Double getSettleAmount() {
		return this.settleAmount;
	}

	public void setSettleAmount(Double settleAmount) {
		this.settleAmount = settleAmount;
	}

	@Column(name = "SETTLE_CURRENCY", length = 4)
	public String getSettleCurrency() {
		return this.settleCurrency;
	}

	public void setSettleCurrency(String settleCurrency) {
		this.settleCurrency = settleCurrency;
	}
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 20, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_DRAW_ID_SEQ")
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

}