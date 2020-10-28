package com.tracy.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TOnlinePaymentConfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_ONLINE_PAYMENT_CONFIG")
//@SequenceGenerator(sequenceName="BANKACCOUNT_ID_SEQ", name = "ONLINEPAYMENT_ID_SEQ",allocationSize=1)
public class TOnlinePaymentConfig implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String payId;
	private String name;
	private String shortName;
	private String domainName;
	private String product;
	private String orderId;
	private Double dayLimit;
	private String flag;
	private String productPass;
	private Timestamp createTime;
	private String createBy;
	private Timestamp lastUpdate;
	private String lastUpdateBy;
	private Double limitAmount;
	private String min;
	private String max;
	// Constructors

	/** default constructor */
	public TOnlinePaymentConfig() {
	}

	/** minimal constructor */
	public TOnlinePaymentConfig(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public TOnlinePaymentConfig(BigDecimal id, String payId, String name,
			String shortName, String domainName, String product,
			String orderId, Double dayLimit, String flag,
			String productPass, Timestamp createTime, String createBy,
			Timestamp lastUpdate, String lastUpdateBy) {
		this.id = id;
		this.payId = payId;
		this.name = name;
		this.shortName = shortName;
		this.domainName = domainName;
		this.product = product;
		this.orderId = orderId;
		this.dayLimit = dayLimit;
		this.flag = flag;
		this.productPass = productPass;
		this.createTime = createTime;
		this.createBy = createBy;
		this.lastUpdate = lastUpdate;
		this.lastUpdateBy = lastUpdateBy;
	}

	// Property accessors
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ONLINEPAYMENT_ID_SEQ")
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "PAY_ID", length = 50)
	public String getPayId() {
		return this.payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "SHORT_NAME", length = 50)
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	@Column(name = "DOMAIN_NAME", length = 200)
	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	@Column(name = "PRODUCT", length = 50)
	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Column(name = "ORDER_ID", length = 50)
	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Column(name = "DAY_LIMIT", precision = 22)
	public Double getDayLimit() {
		return this.dayLimit;
	}

	public void setDayLimit(Double dayLimit) {
		this.dayLimit = dayLimit;
	}

	@Column(name = "FLAG", precision = 22, scale = 0)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "PRODUCT_PASS", length = 2000)
	public String getProductPass() {
		return this.productPass;
	}

	public void setProductPass(String productPass) {
		this.productPass = productPass;
	}

	@Column(name = "CREATE_TIME", length = 7)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "CREATE_BY", length = 50)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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
	@Column(name = "LIMIT_AMOUNT", precision = 22)
	public Double getLimitAmount() {
		return limitAmount;
	}

	public void setLimitAmount(Double limitAmount) {
		this.limitAmount = limitAmount;
	}
	@Column(name = "MIN", length = 20)
	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}
	@Column(name = "MAX", length = 20)
	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

}