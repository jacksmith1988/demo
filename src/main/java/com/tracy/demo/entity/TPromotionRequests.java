package com.tracy.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TPromotionRequests entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_PROMOTION_REQUESTS")
//@SequenceGenerator(sequenceName="T_PROMOTION_SEQ", name = "T_PROMOTION_SEQ",allocationSize=1,schema="")
public class TPromotionRequests implements java.io.Serializable {

	// Fields
	private BigDecimal id;
	private String requestId;
	private Double betAmount;
	private String createdBy;
	private Timestamp createdDate;
//	private Integer customerId;
	private String email;
	private Integer flag;
	private String ipAddress;
	private Timestamp lastUpdate;
	private String lastUpdatedBy;
	private String phone;
	private String promotionType;
	private String remarks;
	private Double refAmount;
	private Double amount;
	private Short customerLevel;
	private String reserve1;
	private String reserve2;
	private String reserve3;
	private BigDecimal promotionConfigId;
	private com.tracy.demo.entity.TPromotionConfig config;
	private String currency;
	private TCustomers tCustomers;
	// Constructors
//	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "CUSTOMER_ID")
	public TCustomers gettCustomers() {
		return tCustomers;
	}

	public void settCustomers(TCustomers tCustomers) {
		this.tCustomers = tCustomers;
	}
	// Constructors

	/** default constructor */
	public TPromotionRequests() {
	}

	/** minimal constructor */
	public TPromotionRequests(String requestId, String createdBy,
			Timestamp createdDate, Integer customerId, Integer flag,
			String ipAddress, Short customerLevel) {
		this.requestId = requestId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
//		this.customerId = customerId;
		this.flag = flag;
		this.ipAddress = ipAddress;
		this.customerLevel = customerLevel;
	}

	/** full constructor */
	public TPromotionRequests(String requestId, Double betAmount,
			String createdBy, Timestamp createdDate, Integer customerId,
			String email, Integer flag, String ipAddress, Timestamp lastUpdate,
			String lastUpdatedBy, String phone, String promotionType,
			String remarks, Double refAmount, Double amount,
			Short customerLevel, String reserve1, String reserve2,
			String reserve3, BigDecimal promotionConfigId, String currency) {
		this.requestId = requestId;
		this.betAmount = betAmount;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
//		this.customerId = customerId;
		this.email = email;
		this.flag = flag;
		this.ipAddress = ipAddress;
		this.lastUpdate = lastUpdate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.phone = phone;
		this.promotionType = promotionType;
		this.remarks = remarks;
		this.refAmount = refAmount;
		this.amount = amount;
		this.customerLevel = customerLevel;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.promotionConfigId = promotionConfigId;
		this.currency = currency;
	}

	// Property accessors
	@Column(name = "REQUEST_ID", unique = true, nullable = false, length = 30)
	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Column(name = "BET_AMOUNT", precision = 22)
	public Double getBetAmount() {
		return this.betAmount;
	}

	public void setBetAmount(Double betAmount) {
		this.betAmount = betAmount;
	}

	@Column(name = "CREATED_BY", nullable = false, length = 50)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@Column(name = "CREATED_DATE", nullable = false, length = 7)
	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
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

	@Column(name = "FLAG", nullable = false, precision = 1, scale = 0)
	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
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

	@Column(name = "PROMOTION_TYPE", length = 20)
	public String getPromotionType() {
		return this.promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	@Column(name = "REMARKS", length = 2000)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "REF_AMOUNT", precision = 22)
	public Double getRefAmount() {
		return this.refAmount;
	}

	public void setRefAmount(Double refAmount) {
		this.refAmount = refAmount;
	}

	@Column(name = "AMOUNT", precision = 22)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "CUSTOMER_LEVEL", nullable = false, precision = 3, scale = 0)
	public Short getCustomerLevel() {
		return this.customerLevel;
	}

	public void setCustomerLevel(Short customerLevel) {
		this.customerLevel = customerLevel;
	}

	@Column(name = "RESERVE1", length = 50)
	public String getReserve1() {
		return this.reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	@Column(name = "RESERVE2", length = 100)
	public String getReserve2() {
		return this.reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	@Column(name = "RESERVE3", length = 200)
	public String getReserve3() {
		return this.reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

	@Column(name = "PROMOTION_CONFIG_ID", precision = 22, scale = 0)
	public BigDecimal getPromotionConfigId() {
		return this.promotionConfigId;
	}

	public void setPromotionConfigId(BigDecimal promotionConfigId) {
		this.promotionConfigId = promotionConfigId;
	}

	@Column(name = "CURRENCY", length = 4)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 20, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_PROMOTION_SEQ")
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PROMOTION_CONFIG_ID",referencedColumnName="CONFIGURATION_ID",insertable=false,updatable=false)
	@Fetch(FetchMode.JOIN)
	public com.tracy.demo.entity.TPromotionConfig getConfig() {
		return config;
	}

	public void setConfig(com.tracy.demo.entity.TPromotionConfig config) {
		this.config = config;
	}


}