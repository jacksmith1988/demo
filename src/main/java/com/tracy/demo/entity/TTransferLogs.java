package com.tracy.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TTransferLogs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_TRANSFER_LOGS")
public class TTransferLogs implements java.io.Serializable {

	// Fields

	private BigDecimal transferLogId;
	private String customerId;
	private Double amount;
	private String createdBy;
	private Timestamp createdDate;
	private Timestamp effectivityDate;
	private Timestamp expiryDate;
	private Boolean flag;
	private Timestamp lastUpdate;
	private String remarks;
	private String returnCode;
	private String source;
	private String target;
	private String referenceId;
	private String transferMode;

	// Constructors

	/** default constructor */
	public TTransferLogs() {
	}

	/** minimal constructor */
	public TTransferLogs(BigDecimal transferLogId, Integer customerId,
			Double amount, String createdBy, Timestamp createdDate,
			Timestamp effectivityDate, Timestamp expiryDate, Boolean flag,
			String source, String target, String referenceId,
			String transferMode) {
		this.transferLogId = transferLogId;
		this.amount = amount;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.effectivityDate = effectivityDate;
		this.expiryDate = expiryDate;
		this.flag = flag;
		this.source = source;
		this.target = target;
		this.referenceId = referenceId;
		this.transferMode = transferMode;
	}

	/** full constructor */
	public TTransferLogs(BigDecimal transferLogId, Integer customerId,
			Double amount, String createdBy, Timestamp createdDate,
			Timestamp effectivityDate, Timestamp expiryDate, Boolean flag,
			Timestamp lastUpdate, String remarks, String returnCode,
			String source, String target, String referenceId,
			String transferMode) {
		this.transferLogId = transferLogId;
		this.amount = amount;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.effectivityDate = effectivityDate;
		this.expiryDate = expiryDate;
		this.flag = flag;
		this.lastUpdate = lastUpdate;
		this.remarks = remarks;
		this.returnCode = returnCode;
		this.source = source;
		this.target = target;
		this.referenceId = referenceId;
		this.transferMode = transferMode;
	}

	// Property accessors
	@Id
	@Column(name = "TRANSFER_LOG_ID", unique = true,  precision = 22, scale = 0)
	public BigDecimal getTransferLogId() {
		return this.transferLogId;
	}

	public void setTransferLogId(BigDecimal transferLogId) {
		this.transferLogId = transferLogId;
	}

	@Column(name = "CUSTOMER_ID",  length = 200)
	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Column(name = "AMOUNT",  precision = 22)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "CREATED_BY",  length = 50)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "CREATED_DATE",  length = 7)
	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "EFFECTIVITY_DATE",  length = 7)
	public Timestamp getEffectivityDate() {
		return this.effectivityDate;
	}

	public void setEffectivityDate(Timestamp effectivityDate) {
		this.effectivityDate = effectivityDate;
	}

	@Column(name = "EXPIRY_DATE",  length = 7)
	public Timestamp getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Column(name = "FLAG",  precision = 1, scale = 0)
	public Boolean getFlag() {
		return this.flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	@Column(name = "LAST_UPDATE", length = 7)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "REMARKS", length = 500)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "RETURN_CODE", length = 200)
	public String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	@Column(name = "SOURCE",  length = 4000)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "TARGET",  length = 4000)
	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Column(name = "REFERENCE_ID",  length = 32)
	public String getReferenceId() {
		return this.referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	@Column(name = "TRANSFER_MODE",  length = 3)
	public String getTransferMode() {
		return this.transferMode;
	}

	public void setTransferMode(String transferMode) {
		this.transferMode = transferMode;
	}

}