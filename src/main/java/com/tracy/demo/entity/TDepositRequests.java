package com.tracy.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TDepositRequests entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_DEPOSIT_REQUESTS")
//@SequenceGenerator(sequenceName="T_DEPOSIT_ID_SEQ", name = "T_DEPOSIT_ID_SEQ",allocationSize=1)
public class TDepositRequests implements java.io.Serializable {

	// Fields
	private BigDecimal id;
	private String requestId;
	private Double amount;
	private String bankAccountName;
	private String bankAccountNo;
	private String bankName;
	private String createdBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Timestamp createdDate;
	private String currency;
	//private Integer customerId;
	private String email;
	private String emailStatus;
	private Integer flag;
	private String ipAddress;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Timestamp lastUpdate;
	private String lastUpdatedBy;
	private String phone;
	private Integer priorityType;
	private String remarks;
	private String smsStatus;
	private String depositLocation;
	private String depositDate;
	private String depositBy;
	private String depositType;
	private BigDecimal customerLevel;
	private Integer bankTransferStatus;
	private String onlineBillNo;
	private String bitcoinId;
	private String duplicateFrom;
	private BigDecimal depositCount;
	private String promotionStatus;
	@Column(name = "PROMOTION_STATUS", length = 1)
	public String getPromotionStatus() {
		return promotionStatus;
	}

	public void setPromotionStatus(String promotionStatus) {
		this.promotionStatus = promotionStatus;
	}
	private com.tracy.demo.entity.TCustomers tCustomers;
	// Constructors
//	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID", insertable = false, updatable = false)
//	@ManyToOne(fetch=FetchType.EAGER)
//	@JoinColumn(name = "CUSTOMER_ID")
//	@Transient
//	public com.tracy.demo.entity.TCustomers getTCustomers() {
//		return tCustomers;
//	}
//
//	public void setTCustomers(com.tracy.demo.entity.TCustomers tCustomers) {
//		this.tCustomers = tCustomers;
//	}
	/** default constructor */
	public TDepositRequests() {
	}

	/** minimal constructor */
	public TDepositRequests(String requestId, Double amount,
			String bankAccountName, String bankAccountNo, String bankName,
			String createdBy, Timestamp createdDate, String currency,
			Integer customerId, Integer flag, String ipAddress,
			Integer priorityType, BigDecimal customerLevel) {
		this.requestId = requestId;
		this.amount = amount;
		this.bankAccountName = bankAccountName;
		this.bankAccountNo = bankAccountNo;
		this.bankName = bankName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.currency = currency;
//		this.customerId = customerId;
//		this.flag = flag;
		this.ipAddress = ipAddress;
		this.priorityType = priorityType;
		this.customerLevel = customerLevel;
	}

	/** full constructor */
	public TDepositRequests(String requestId, Double amount,
			String bankAccountName, String bankAccountNo, String bankName,
			String createdBy, Timestamp createdDate, String currency,
			Integer customerId, String email, String emailStatus,
			Integer flag, String ipAddress, Timestamp lastUpdate,
			String lastUpdatedBy, String phone, Integer priorityType,
			String remarks, String smsStatus, String depositLocation,
			String depositDate, String depositBy, String depositType,
			BigDecimal customerLevel, Integer bankTransferStatus,
			String onlineBillNo, String bitcoinId, String duplicateFrom,
			BigDecimal depositCount) {
		this.requestId = requestId;
		this.amount = amount;
		this.bankAccountName = bankAccountName;
		this.bankAccountNo = bankAccountNo;
		this.bankName = bankName;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.currency = currency;
//		this.customerId = customerId;
		this.email = email;
		this.emailStatus = emailStatus;
//		this.flag = flag;
		this.ipAddress = ipAddress;
		this.lastUpdate = lastUpdate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.phone = phone;
		this.priorityType = priorityType;
		this.remarks = remarks;
		this.smsStatus = smsStatus;
		this.depositLocation = depositLocation;
		this.depositDate = depositDate;
		this.depositBy = depositBy;
		this.depositType = depositType;
		this.customerLevel = customerLevel;
//		this.bankTransferStatus = bankTransferStatus;
		this.onlineBillNo = onlineBillNo;
		this.bitcoinId = bitcoinId;
		this.duplicateFrom = duplicateFrom;
		this.depositCount = depositCount;
	}

	// Property accessors
//	@Id
	@Column(name = "REQUEST_ID", unique = true, nullable = false, length = 19)
	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Column(name = "AMOUNT", nullable = true, precision = 22)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "BANK_ACCOUNT_NAME", length = 50)
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

	@Column(name = "BANK_NAME", nullable = false, length = 50)
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
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

	@Column(name = "CURRENCY", nullable = false, length = 10)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

//	@Column(name = "CUSTOMER_ID", nullable = false, precision = 22, scale = 0)
//	public Integer getCustomerId() {
//		return this.customerId;
//	}
//
//	public void setCustomerId(Integer customerId) {
//		this.customerId = customerId;
//	}

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

	@Column(name = "FLAG", nullable = false, precision = 1, scale = 0)
	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Column(name = "IP_ADDRESS", nullable = false, length = 60)
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

	@Column(name = "PHONE", length = 16)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "PRIORITY_TYPE", nullable = false, precision = 1, scale = 0)
	public Integer getPriorityType() {
		return this.priorityType;
	}

	public void setPriorityType(Integer priorityType) {
		this.priorityType = priorityType;
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

	@Column(name = "DEPOSIT_LOCATION", length = 128)
	public String getDepositLocation() {
		return this.depositLocation;
	}

	public void setDepositLocation(String depositLocation) {
		this.depositLocation = depositLocation;
	}

	@Column(name = "DEPOSIT_DATE", length = 19)
	public String getDepositDate() {
		return this.depositDate;
	}

	public void setDepositDate(String depositDate) {
		this.depositDate = depositDate;
	}

	@Column(name = "DEPOSIT_BY", length = 50)
	public String getDepositBy() {
		return this.depositBy;
	}

	public void setDepositBy(String depositBy) {
		this.depositBy = depositBy;
	}

	@Column(name = "DEPOSIT_TYPE", length = 20)
	public String getDepositType() {
		return this.depositType;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}

	@Column(name = "CUSTOMER_LEVEL", nullable = false, precision = 22, scale = 0)
	public BigDecimal getCustomerLevel() {
		return this.customerLevel;
	}

	public void setCustomerLevel(BigDecimal customerLevel) {
		this.customerLevel = customerLevel;
	}

	@Column(name = "BANK_TRANSFER_STATUS", precision = 1, scale = 0)
	public Integer getBankTransferStatus() {
		return this.bankTransferStatus;
	}

	public void setBankTransferStatus(Integer bankTransferStatus) {
		this.bankTransferStatus = bankTransferStatus;
	}

	@Column(name = "ONLINE_BILL_NO", length = 50)
	public String getOnlineBillNo() {
		return this.onlineBillNo;
	}

	public void setOnlineBillNo(String onlineBillNo) {
		this.onlineBillNo = onlineBillNo;
	}

	@Column(name = "BITCOIN_ID", length = 30)
	public String getBitcoinId() {
		return this.bitcoinId;
	}

	public void setBitcoinId(String bitcoinId) {
		this.bitcoinId = bitcoinId;
	}

	@Column(name = "DUPLICATE_FROM", length = 19)
	public String getDuplicateFrom() {
		return this.duplicateFrom;
	}

	public void setDuplicateFrom(String duplicateFrom) {
		this.duplicateFrom = duplicateFrom;
	}

	@Column(name = "DEPOSIT_COUNT", precision = 22, scale = 0)
	public BigDecimal getDepositCount() {
		return this.depositCount;
	}

	public void setDepositCount(BigDecimal depositCount) {
		this.depositCount = depositCount;
	}
	
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 20, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_DEPOSIT_ID_SEQ")
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "CUSTOMER_ID")
	public com.tracy.demo.entity.TCustomers getTCustomers() {
		return tCustomers;
	}

	public void setTCustomers(com.tracy.demo.entity.TCustomers tCustomers) {
		this.tCustomers = tCustomers;
	}
	

}