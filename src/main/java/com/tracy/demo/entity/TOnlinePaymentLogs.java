package com.tracy.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TOnlinePaymentLogs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_ONLINE_PAYMENT_LOGS")
//@SequenceGenerator(sequenceName="T_ONLINE_PAYMENT_LOGS_ID_SEQ", name = "T_ONLINE_PAYMENT_LOGS_ID_SEQ",allocationSize=1)
public class TOnlinePaymentLogs implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String productId;
	private String payType;
	private String loginName;
	private Double amount;
	private String billsNo;
	private BigDecimal flag;
	private Timestamp createTime;
	private BigDecimal addFlag;
	private String auditor;
	private String createBy;
	private Timestamp auditTime;
	private String remarks;
	private Timestamp lastUpdate;
	private String lastUpdateBy;
	private Integer customerId;
	private String resetPerson;
	private Timestamp resetTime;
	private Double maxamount;
	private String productType;
	private BigDecimal isRefuse;
	private String refusePerson;
	private Timestamp refuseTime;

	// Constructors

	/** default constructor */
	public TOnlinePaymentLogs() {
	}

	/** minimal constructor */
	public TOnlinePaymentLogs(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public TOnlinePaymentLogs(BigDecimal id, String productId, String payType,
			String loginName, Double amount, String billsNo, BigDecimal flag,
			Timestamp createTime, BigDecimal addFlag, String auditor,
			String createBy, Timestamp auditTime, String remarks,
			Timestamp lastUpdate, String lastUpdateBy, Integer customerId,
			String resetPerson, Timestamp resetTime, Double maxamount,
			String productType, BigDecimal isRefuse, String refusePerson,
			Timestamp refuseTime) {
		this.id = id;
		this.productId = productId;
		this.payType = payType;
		this.loginName = loginName;
		this.amount = amount;
		this.billsNo = billsNo;
		this.flag = flag;
		this.createTime = createTime;
		this.addFlag = addFlag;
		this.auditor = auditor;
		this.createBy = createBy;
		this.auditTime = auditTime;
		this.remarks = remarks;
		this.lastUpdate = lastUpdate;
		this.lastUpdateBy = lastUpdateBy;
		this.customerId = customerId;
		this.resetPerson = resetPerson;
		this.resetTime = resetTime;
		this.maxamount = maxamount;
		this.productType = productType;
		this.isRefuse = isRefuse;
		this.refusePerson = refusePerson;
		this.refuseTime = refuseTime;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 32)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_ONLINE_PAYMENT_LOGS_ID_SEQ")
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "PRODUCT_ID", length = 50)
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Column(name = "PAY_TYPE", length = 50)
	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	@Column(name = "LOGIN_NAME", length = 50)
	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "AMOUNT", precision = 22)
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Column(name = "BILLS_NO", length = 200)
	public String getBillsNo() {
		return this.billsNo;
	}

	public void setBillsNo(String billsNo) {
		this.billsNo = billsNo;
	}

	@Column(name = "FLAG", precision = 22, scale = 0)
	public BigDecimal getFlag() {
		return this.flag;
	}

	public void setFlag(BigDecimal flag) {
		this.flag = flag;
	}

	@Column(name = "CREATE_TIME", length = 7)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "ADD_FLAG", precision = 22, scale = 0)
	public BigDecimal getAddFlag() {
		return this.addFlag;
	}

	public void setAddFlag(BigDecimal addFlag) {
		this.addFlag = addFlag;
	}

	@Column(name = "AUDITOR", length = 50)
	public String getAuditor() {
		return this.auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	@Column(name = "CREATE_BY", length = 50)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "AUDIT_TIME", length = 7)
	public Timestamp getAuditTime() {
		return this.auditTime;
	}

	public void setAuditTime(Timestamp auditTime) {
		this.auditTime = auditTime;
	}

	@Column(name = "REMARKS", length = 2000)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "LAST_UPDATE", length = 7)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "LAST_UPDATE_BY", length = 50)
	public String getLastUpdateBy() {
		return this.lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	@Column(name = "CUSTOMER_ID", precision = 22, scale = 0)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "RESET_PERSON", length = 50)
	public String getResetPerson() {
		return this.resetPerson;
	}

	public void setResetPerson(String resetPerson) {
		this.resetPerson = resetPerson;
	}

	@Column(name = "RESET_TIME", length = 7)
	public Timestamp getResetTime() {
		return this.resetTime;
	}

	public void setResetTime(Timestamp resetTime) {
		this.resetTime = resetTime;
	}

	@Column(name = "MAXAMOUNT", precision = 22)
	public Double getMaxamount() {
		return this.maxamount;
	}

	public void setMaxamount(Double maxamount) {
		this.maxamount = maxamount;
	}

	@Column(name = "PRODUCT_TYPE", length = 50)
	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	@Column(name = "IS_REFUSE", precision = 22, scale = 0)
	public BigDecimal getIsRefuse() {
		return this.isRefuse;
	}

	public void setIsRefuse(BigDecimal isRefuse) {
		this.isRefuse = isRefuse;
	}

	@Column(name = "REFUSE_PERSON", length = 50)
	public String getRefusePerson() {
		return this.refusePerson;
	}

	public void setRefusePerson(String refusePerson) {
		this.refusePerson = refusePerson;
	}

	@Column(name = "REFUSE_TIME", length = 7)
	public Timestamp getRefuseTime() {
		return this.refuseTime;
	}

	public void setRefuseTime(Timestamp refuseTime) {
		this.refuseTime = refuseTime;
	}

}