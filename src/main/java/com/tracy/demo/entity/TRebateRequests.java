package com.tracy.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * TRebateRequests entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_REBATE_REQUESTS")
public class TRebateRequests implements java.io.Serializable {

	// Fields

	private String requestId;
	private TCustomers TCustomers;
	private String gameId;
	private Double bettingAmount;
	private Double amount;
	private Double rate;
	private String flag;
	private String rebateMode;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Timestamp startDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Timestamp endDate;
	private String createdBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Timestamp createdDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Timestamp lastUpdate;
	private String lastUpdatedBy;
	private String ipAddress;
	private String remarks;
	private String gameKind;
	private Short customerLevel;
	private String reserve1;
	private String reserve2;
	private String reserve3;
	private String xmType;
	private Double totalBetAmount;
	private String currency;

	// Constructors

	/** default constructor */
	public TRebateRequests() {
	}

	/** minimal constructor */
	public TRebateRequests(String requestId, TCustomers TCustomers,
			Double bettingAmount, Double amount, Double rate, String flag,
			String rebateMode, Timestamp startDate, Timestamp endDate,
			String createdBy, Timestamp createdDate) {
		this.requestId = requestId;
		this.TCustomers = TCustomers;
		this.bettingAmount = bettingAmount;
		this.amount = amount;
		this.rate = rate;
		this.flag = flag;
		this.rebateMode = rebateMode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	/** full constructor */
	public TRebateRequests(String requestId, TCustomers TCustomers,
			String gameId, Double bettingAmount, Double amount, Double rate,
			String flag, String rebateMode, Timestamp startDate,
			Timestamp endDate, String createdBy, Timestamp createdDate,
			Timestamp lastUpdate, String lastUpdatedBy, String ipAddress,
			String remarks, String gameKind, Short customerLevel,
			String reserve1, String reserve2, String reserve3, String xmType,
			Double totalBetAmount, String currency) {
		this.requestId = requestId;
		this.TCustomers = TCustomers;
		this.gameId = gameId;
		this.bettingAmount = bettingAmount;
		this.amount = amount;
		this.rate = rate;
		this.flag = flag;
		this.rebateMode = rebateMode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdate = lastUpdate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.ipAddress = ipAddress;
		this.remarks = remarks;
		this.gameKind = gameKind;
		this.customerLevel = customerLevel;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.xmType = xmType;
		this.totalBetAmount = totalBetAmount;
		this.currency = currency;
	}

	// Property accessors
	@Id
	@Column(name = "REQUEST_ID", unique = true, nullable = false, length = 19)
	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CUSTOMER_ID", nullable = false)
	public TCustomers getTCustomers() {
		return this.TCustomers;
	}

	public void setTCustomers(TCustomers TCustomers) {
		this.TCustomers = TCustomers;
	}

	@Column(name = "GAME_ID", length = 50)
	public String getGameId() {
		return this.gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	@Column(name = "BETTING_AMOUNT", nullable = false, precision = 22)
	public Double getBettingAmount() {
		return this.bettingAmount;
	}

	public void setBettingAmount(Double bettingAmount) {
		this.bettingAmount = bettingAmount;
	}

	@Column(name = "AMOUNT", nullable = false, precision = 22)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "RATE", nullable = false, precision = 6)
	public Double getRate() {
		return this.rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	@Column(name = "FLAG", nullable = false, precision = 1, scale = 0)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "REBATE_MODE", nullable = false, precision = 1, scale = 0)
	public String getRebateMode() {
		return this.rebateMode;
	}

	public void setRebateMode(String rebateMode) {
		this.rebateMode = rebateMode;
	}

	@Column(name = "START_DATE", nullable = false, length = 7)
	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	@Column(name = "END_DATE", nullable = false, length = 7)
	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
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

	@Column(name = "IP_ADDRESS", length = 60)
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Column(name = "REMARKS", length = 2000)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "GAME_KIND", length = 3)
	public String getGameKind() {
		return this.gameKind;
	}

	public void setGameKind(String gameKind) {
		this.gameKind = gameKind;
	}

	@Column(name = "CUSTOMER_LEVEL", precision = 3, scale = 0)
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

	@Column(name = "XM_TYPE", length = 50)
	public String getXmType() {
		return this.xmType;
	}

	public void setXmType(String xmType) {
		this.xmType = xmType;
	}

	@Column(name = "TOTAL_BET_AMOUNT", precision = 22)
	public Double getTotalBetAmount() {
		return this.totalBetAmount;
	}

	public void setTotalBetAmount(Double totalBetAmount) {
		this.totalBetAmount = totalBetAmount;
	}

	@Column(name = "CURRENCY", length = 4)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}