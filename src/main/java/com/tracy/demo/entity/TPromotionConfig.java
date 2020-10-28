package com.tracy.demo.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TPromotionConfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_PROMOTION_CONFIG")
//@SequenceGenerator(sequenceName="T_PROMOTION_CONFIG_ID_SEQ", name = "T_PROMOTION_CONFIG_ID_SEQ",allocationSize=1)
public class TPromotionConfig implements java.io.Serializable {

	// Fields

	private BigDecimal configurationId;
	private String productId;
	private String promotionType;
	private Double percentage;
	private Double maxAmount;
	private String customerLevel;
	private String dateRange;
	private Integer maxAllow;
	private String flag;
	private String createdBy;
	private Timestamp createdDate;
	private Timestamp lastUpdate;
	private String lastUpdatedBy;
	private String remarks;
	private String promotionName;
	private BigDecimal minDeposit;
	private BigDecimal maxDeposit;
	private Integer betAmountMultiplier;
	private Integer applySite;
	private Integer applyType;
	private Integer approveType;
	private Long maxAmountTime;
	private String reserve1;
	private Timestamp effectDateStart;
	private Timestamp effectDateEnd;
	private BigDecimal maxNumber;
	private Double minAmount;
	private String suspendCustomer;
	private String currency;
	
	private BigDecimal dayLimitAmount;
	private BigDecimal dayLimitTime;
	private BigDecimal singleMaxAmount;

	// Constructors

	/** default constructor */
	public TPromotionConfig() {
	}

	/** minimal constructor */
	public TPromotionConfig(BigDecimal configurationId, String productId,
			String flag, String createdBy, Timestamp createdDate) {
		this.configurationId = configurationId;
		this.productId = productId;
		this.flag = flag;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	/** full constructor */
	public TPromotionConfig(BigDecimal configurationId, String productId,
			String promotionType, Double percentage, Double maxAmount,
			String customerLevel, String dateRange, Integer maxAllow,
			String flag, String createdBy, Timestamp createdDate,
			Timestamp lastUpdate, String lastUpdatedBy, String remarks,
			String promotionName, BigDecimal minDeposit, BigDecimal maxDeposit,
			Integer betAmountMultiplier, Integer applySite, Integer applyType,
			Integer approveType, Long maxAmountTime, String reserve1,
			Timestamp effectDateStart, Timestamp effectDateEnd,
			BigDecimal maxNumber, Double minAmount, String suspendCustomer,
			String currency) {
		this.configurationId = configurationId;
		this.productId = productId;
		this.promotionType = promotionType;
		this.percentage = percentage;
		this.maxAmount = maxAmount;
		this.customerLevel = customerLevel;
		this.dateRange = dateRange;
		this.maxAllow = maxAllow;
		this.flag = flag;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdate = lastUpdate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.remarks = remarks;
		this.promotionName = promotionName;
		this.minDeposit = minDeposit;
		this.maxDeposit = maxDeposit;
		this.betAmountMultiplier = betAmountMultiplier;
		this.applySite = applySite;
		this.applyType = applyType;
		this.approveType = approveType;
		this.maxAmountTime = maxAmountTime;
		this.reserve1 = reserve1;
		this.effectDateStart = effectDateStart;
		this.effectDateEnd = effectDateEnd;
		this.maxNumber = maxNumber;
		this.minAmount = minAmount;
		this.suspendCustomer = suspendCustomer;
		this.currency = currency;
	}

	// Property accessors
	@Id
	@Column(name = "CONFIGURATION_ID", unique = true, nullable = false, precision = 22, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_PROMOTION_CONFIG_ID_SEQ")
	public BigDecimal getConfigurationId() {
		return this.configurationId;
	}

	public void setConfigurationId(BigDecimal configurationId) {
		this.configurationId = configurationId;
	}

	@Column(name = "PRODUCT_ID", nullable = false, length = 3)
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Column(name = "PROMOTION_TYPE", length = 20)
	public String getPromotionType() {
		return this.promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	@Column(name = "PERCENTAGE", precision = 4)
	public Double getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Column(name = "MAX_AMOUNT", precision = 22)
	public Double getMaxAmount() {
		return this.maxAmount;
	}

	public void setMaxAmount(Double maxAmount) {
		this.maxAmount = maxAmount;
	}

	@Column(name = "CUSTOMER_LEVEL", length = 50)
	public String getCustomerLevel() {
		return this.customerLevel;
	}

	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}

	@Column(name = "DATE_RANGE", length = 10)
	public String getDateRange() {
		return this.dateRange;
	}

	public void setDateRange(String dateRange) {
		this.dateRange = dateRange;
	}

	@Column(name = "MAX_ALLOW", precision = 5, scale = 0)
	public Integer getMaxAllow() {
		return this.maxAllow;
	}

	public void setMaxAllow(Integer maxAllow) {
		this.maxAllow = maxAllow;
	}

	@Column(name = "FLAG", nullable = false, precision = 1, scale = 0)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "CREATED_BY", nullable = true, length = 50)
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

	@Column(name = "REMARKS", length = 500)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "PROMOTION_NAME", length = 50)
	public String getPromotionName() {
		return this.promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	@Column(name = "MIN_DEPOSIT", precision = 22, scale = 0)
	public BigDecimal getMinDeposit() {
		return this.minDeposit;
	}

	public void setMinDeposit(BigDecimal minDeposit) {
		this.minDeposit = minDeposit;
	}

	@Column(name = "MAX_DEPOSIT", precision = 22, scale = 0)
	public BigDecimal getMaxDeposit() {
		return this.maxDeposit;
	}

	public void setMaxDeposit(BigDecimal maxDeposit) {
		this.maxDeposit = maxDeposit;
	}

	@Column(name = "BET_AMOUNT_MULTIPLIER", precision = 5, scale = 0)
	public Integer getBetAmountMultiplier() {
		return this.betAmountMultiplier;
	}

	public void setBetAmountMultiplier(Integer betAmountMultiplier) {
		this.betAmountMultiplier = betAmountMultiplier;
	}

	@Column(name = "APPLY_SITE", precision = 1, scale = 0)
	public Integer getApplySite() {
		return this.applySite;
	}

	public void setApplySite(Integer applySite) {
		this.applySite = applySite;
	}

	@Column(name = "APPLY_TYPE", precision = 1, scale = 0)
	public Integer getApplyType() {
		return this.applyType;
	}

	public void setApplyType(Integer applyType) {
		this.applyType = applyType;
	}

	@Column(name = "APPROVE_TYPE", precision = 1, scale = 0)
	public Integer getApproveType() {
		return this.approveType;
	}

	public void setApproveType(Integer approveType) {
		this.approveType = approveType;
	}

	@Column(name = "MAX_AMOUNT_TIME", precision = 10, scale = 0)
	public Long getMaxAmountTime() {
		return this.maxAmountTime;
	}

	public void setMaxAmountTime(Long maxAmountTime) {
		this.maxAmountTime = maxAmountTime;
	}

	@Column(name = "RESERVE1", length = 200)
	public String getReserve1() {
		return this.reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	@Column(name = "EFFECT_DATE_START", length = 7)
	public Timestamp getEffectDateStart() {
		return this.effectDateStart;
	}

	public void setEffectDateStart(Timestamp effectDateStart) {
		this.effectDateStart = effectDateStart;
	}

	@Column(name = "EFFECT_DATE_END", length = 7)
	public Timestamp getEffectDateEnd() {
		return this.effectDateEnd;
	}

	public void setEffectDateEnd(Timestamp effectDateEnd) {
		this.effectDateEnd = effectDateEnd;
	}

	@Column(name = "MAX_NUMBER", precision = 22, scale = 0)
	public BigDecimal getMaxNumber() {
		return this.maxNumber;
	}

	public void setMaxNumber(BigDecimal maxNumber) {
		this.maxNumber = maxNumber;
	}

	@Column(name = "MIN_AMOUNT", precision = 22)
	public Double getMinAmount() {
		return this.minAmount;
	}

	public void setMinAmount(Double minAmount) {
		this.minAmount = minAmount;
	}

	@Column(name = "SUSPEND_CUSTOMER", length = 1)
	public String getSuspendCustomer() {
		return this.suspendCustomer;
	}

	public void setSuspendCustomer(String suspendCustomer) {
		this.suspendCustomer = suspendCustomer;
	}

	@Column(name = "CURRENCY", length = 20)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Column(name = "DAY_LIMIT_AMOUNT", precision = 22)
	public BigDecimal getDayLimitAmount() {
		return dayLimitAmount;
	}

	public void setDayLimitAmount(BigDecimal dayLimitAmount) {
		this.dayLimitAmount = dayLimitAmount;
	}
	@Column(name = "DAY_LIMIT_TIME", precision = 22)
	public BigDecimal getDayLimitTime() {
		return dayLimitTime;
	}

	public void setDayLimitTime(BigDecimal dayLimitTime) {
		this.dayLimitTime = dayLimitTime;
	}
	@Column(name = "SINGLE_MAX_AMOUNT", precision = 22)
	public BigDecimal getSingleMaxAmount() {
		return singleMaxAmount;
	}

	public void setSingleMaxAmount(BigDecimal singleMaxAmount) {
		this.singleMaxAmount = singleMaxAmount;
	}
}