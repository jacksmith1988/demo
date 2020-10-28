package com.tracy.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * TCreditLogs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_CREDIT_LOGS")
//@SequenceGenerator(sequenceName="T_CREDIT_LOGS_ID_SEQ", name = "T_CREDIT_LOGS_ID_SEQ",allocationSize=1)
public class TCreditLogs implements java.io.Serializable {

	// Fields

	private Integer creditLogId;
	private Double amount;
	private String createdBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Timestamp createdDate;
	private String creditMode;
	private String currency;
	//private Integer customerId;
	private Double dstAmount;
	private String flag;
	private String referenceId;
	private String remarks;
	private Double srcAmount;
	private String transCode;
	private String secondCurrency;
	private String exchangeRate;
	private Double exchangedAmount;
	private Double gameSrcAmount;
	private Double gameDstAmount;
	private TCustomers TCustomers;
	// Constructors

	/** default constructor */
	public TCreditLogs() {
	}

	/** minimal constructor */
	public TCreditLogs(Integer creditLogId, String createdBy,
			Timestamp createdDate, String creditMode, String currency,
			Integer customerId, Double dstAmount, String flag,
			Double srcAmount, String transCode) {
		this.creditLogId = creditLogId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.creditMode = creditMode;
		this.currency = currency;
		//this.customerId = customerId;
		this.dstAmount = dstAmount;
		this.flag = flag;
		this.srcAmount = srcAmount;
		this.transCode = transCode;
	}

	/** full constructor */
	public TCreditLogs(Integer creditLogId, Double amount, String createdBy,
			Timestamp createdDate, String creditMode, String currency,
			Integer customerId, Double dstAmount, String flag,
			String referenceId, String remarks, Double srcAmount,
			String transCode, String secondCurrency, String exchangeRate,
			Double exchangedAmount) {
		this.creditLogId = creditLogId;
		this.amount = amount;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.creditMode = creditMode;
		this.currency = currency;
		//this.customerId = customerId;
		this.dstAmount = dstAmount;
		this.flag = flag;
		this.referenceId = referenceId;
		this.remarks = remarks;
		this.srcAmount = srcAmount;
		this.transCode = transCode;
		this.secondCurrency = secondCurrency;
		this.exchangeRate = exchangeRate;
		this.exchangedAmount = exchangedAmount;
	}

	// Property accessors
	@Id
	@Column(name = "CREDIT_LOG_ID", unique = true, nullable = false, precision = 22, scale = 0)
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_CREDIT_LOGS_ID_SEQ")
	public Integer getCreditLogId() {
		return this.creditLogId;
	}

	public void setCreditLogId(Integer creditLogId) {
		this.creditLogId = creditLogId;
	}

	@Column(name = "AMOUNT", precision = 22)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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

	@Column(name = "CREDIT_MODE", nullable = false, length = 3)
	public String getCreditMode() {
		return this.creditMode;
	}

	public void setCreditMode(String creditMode) {
		this.creditMode = creditMode;
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

	@Column(name = "DST_AMOUNT", nullable = false, precision = 22)
	public Double getDstAmount() {
		return this.dstAmount;
	}

	public void setDstAmount(Double dstAmount) {
		this.dstAmount = dstAmount;
	}

	@Column(name = "FLAG", nullable = false, precision = 1, scale = 0)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "REFERENCE_ID", length = 32)
	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	@Column(name = "REMARKS", length = 2000)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "SRC_AMOUNT", nullable = false, precision = 22)
	public Double getSrcAmount() {
		return this.srcAmount;
	}

	public void setSrcAmount(Double srcAmount) {
		this.srcAmount = srcAmount;
	}

	@Column(name = "TRANS_CODE", nullable = false, length = 8)
	public String getTransCode() {
		return this.transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CUSTOMER_ID", nullable = false)
	public TCustomers getTCustomers() {
		return TCustomers;
	}

	public void setTCustomers(TCustomers tCustomers) {
		TCustomers = tCustomers;
	}
	@Column(name = "GAME_SRC_AMOUNT", nullable = true, precision = 22)
	public Double getGameSrcAmount() {
		return gameSrcAmount;
	}

	public void setGameSrcAmount(Double gameSrcAmount) {
		this.gameSrcAmount = gameSrcAmount;
	}
	@Column(name = "GAME_DST_AMOUNT", nullable = true, precision = 22)
	public Double getGameDstAmount() {
		return gameDstAmount;
	}

	public void setGameDstAmount(Double gameDstAmount) {
		this.gameDstAmount = gameDstAmount;
	}

}