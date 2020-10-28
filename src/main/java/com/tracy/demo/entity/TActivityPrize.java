package com.tracy.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TActivityPrize entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_ACTIVITY_PRIZE")
//@SequenceGenerator(sequenceName="T_ACTIVITY_PRIZE_SEQ", name = "T_ACTIVITY_PRIZE_SEQ",allocationSize=1)
public class TActivityPrize implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String prizeid;
	private String productId;
	private String platformId;
	private String loginname;
	private Integer customerId;
	private Integer flag;
	private Integer type;
	private Integer amount;
	private Integer betAmountMultiplier;
	private Integer special;
	private String validdate;
	private Timestamp useDate;
	private String createdBy;
	private Timestamp createdDate;
	private Timestamp lastUpdate;
	private String lastUpdatedBy;
	private String remark;
	private String reserve1;
	private String reserve2;
	private String reserve3;

	// Constructors

	/** default constructor */
	public TActivityPrize() {
	}

	/** minimal constructor */
	public TActivityPrize(BigDecimal id) {
		this.id = id;
	}
	
	/** full constructor */
	public TActivityPrize(BigDecimal id, String prizeid, String productId,
			String platformId, String loginname, Integer customerId,
			Integer flag, Integer type, Integer amount,
			Integer betAmountMultiplier, Integer special, String validdate,
			Timestamp useDate, String createdBy, Timestamp createdDate,
			Timestamp lastUpdate, String lastUpdatedBy, String remark,
			String reserve1, String reserve2, String reserve3) {
		this.id = id;
		this.prizeid = prizeid;
		this.productId = productId;
		this.platformId = platformId;
		this.loginname = loginname;
		this.customerId = customerId;
		this.flag = flag;
		this.type = type;
		this.amount = amount;
		this.betAmountMultiplier = betAmountMultiplier;
		this.special = special;
		this.validdate = validdate;
		this.useDate = useDate;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdate = lastUpdate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.remark = remark;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
	}

	// Property accessors
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_ACTIVITY_PRIZE_SEQ")
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "PRIZEID", length = 100)
	public String getPrizeid() {
		return this.prizeid;
	}

	public void setPrizeid(String prizeid) {
		this.prizeid = prizeid;
	}

	@Column(name = "PRODUCT_ID", length = 10)
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Column(name = "PLATFORM_ID", length = 10)
	public String getPlatformId() {
		return this.platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	@Column(name = "LOGINNAME", length = 20)
	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	@Column(name = "CUSTOMER_ID", precision = 22, scale = 0)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "FLAG", precision = 1, scale = 0)
	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	@Column(name = "TYPE", precision = 1, scale = 0)
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "AMOUNT", precision = 5, scale = 0)
	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Column(name = "BET_AMOUNT_MULTIPLIER", precision = 8, scale = 0)
	public Integer getBetAmountMultiplier() {
		return this.betAmountMultiplier;
	}

	public void setBetAmountMultiplier(Integer betAmountMultiplier) {
		this.betAmountMultiplier = betAmountMultiplier;
	}

	@Column(name = "SPECIAL", precision = 1, scale = 0)
	public Integer getSpecial() {
		return this.special;
	}

	public void setSpecial(Integer special) {
		this.special = special;
	}

	@Column(name = "VALIDDATE", length = 20)
	public String getValiddate() {
		return this.validdate;
	}

	public void setValiddate(String validdate) {
		this.validdate = validdate;
	}

	@Column(name = "USE_DATE", length = 7)
	public Timestamp getUseDate() {
		return this.useDate;
	}

	public void setUseDate(Timestamp useDate) {
		this.useDate = useDate;
	}

	@Column(name = "CREATED_BY", length = 20)
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

	@Column(name = "LAST_UPDATE", length = 7)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "LAST_UPDATED_BY", length = 20)
	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Column(name = "REMARK", length = 500)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "RESERVE1", length = 20)
	public String getReserve1() {
		return this.reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	@Column(name = "RESERVE2", length = 50)
	public String getReserve2() {
		return this.reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	@Column(name = "RESERVE3", length = 100)
	public String getReserve3() {
		return this.reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

}