package com.tracy.demo.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TOperatorLogs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_OPERATOR_LOGS")
//@SequenceGenerator(sequenceName="T_OPERATOR_LOGS_ID_SEQ", name = "T_OPERATOR_LOGS_ID_SEQ",allocationSize=1)
public class TOperatorLogs implements java.io.Serializable {

	// Fields

	private BigDecimal operatorLogId;
	private String createdBy;
	private Timestamp createdDate;
	private Integer flag;
	private String ipAddress;
	private String operatorType;
	private String productId;
	private Integer transactionCode;
	private String remarks;
	private String moudle;

	// Constructors

	/** default constructor */
	public TOperatorLogs() {
	}

	/** minimal constructor */
	public TOperatorLogs(BigDecimal operatorLogId, String createdBy,
			String ipAddress, String operatorType) {
		this.operatorLogId = operatorLogId;
		this.createdBy = createdBy;
		this.ipAddress = ipAddress;
		this.operatorType = operatorType;
	}

	/** full constructor */
	public TOperatorLogs(BigDecimal operatorLogId, String createdBy,
			Timestamp createdDate, Integer flag, String ipAddress,
			String operatorType, String productId, Integer transactionCode,
			String remarks, String moudle) {
		this.operatorLogId = operatorLogId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.flag = flag;
		this.ipAddress = ipAddress;
		this.operatorType = operatorType;
		this.productId = productId;
		this.transactionCode = transactionCode;
		this.remarks = remarks;
		this.moudle = moudle;
	}

	// Property accessors
	@Id
	@Column(name = "OPERATOR_LOG_ID", unique = true, nullable = false, precision = 22, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_OPERATOR_LOGS_ID_SEQ")
	public BigDecimal getOperatorLogId() {
		return this.operatorLogId;
	}

	public void setOperatorLogId(BigDecimal operatorLogId) {
		this.operatorLogId = operatorLogId;
	}

	@Column(name = "CREATED_BY", nullable = false, length = 50)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "CREATED_DATE", length = 7)
	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "FLAG", precision = 1, scale = 0)
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

	@Column(name = "OPERATOR_TYPE", nullable = false, length = 2)
	public String getOperatorType() {
		return this.operatorType;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	@Column(name = "PRODUCT_ID", length = 3)
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Column(name = "TRANSACTION_CODE", precision = 6, scale = 0)
	public Integer getTransactionCode() {
		return this.transactionCode;
	}

	public void setTransactionCode(Integer transactionCode) {
		this.transactionCode = transactionCode;
	}

	@Column(name = "REMARKS", length = 100)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "MOUDLE", length = 50)
	public String getMoudle() {
		return this.moudle;
	}

	public void setMoudle(String moudle) {
		this.moudle = moudle;
	}

}