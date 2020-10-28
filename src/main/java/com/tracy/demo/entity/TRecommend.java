package com.tracy.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TRecommend entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_RECOMMEND", schema = "XINJI")
public class TRecommend implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	//private Integer customerId;
	private String loginName;
	private String repeat;
	private String deposit;
	private String good;
	private String excellent;
	private String outstanding;
	private Timestamp createDate;
	private Timestamp updateDate;
	private BigDecimal releasedBonus;
	private BigDecimal restBonus;
	private TCustomers tCustomers;
	// Constructors

	/** default constructor */
	public TRecommend() {
	}

	/** minimal constructor */
	public TRecommend(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public TRecommend(BigDecimal id, Integer customerId, String loginName,
			String repeat, String deposit, String good, String excellent,
			String outstanding, Timestamp createDate, Timestamp updateDate,
			BigDecimal releasedBonus, BigDecimal restBonus) {
		this.id = id;
		//this.customerId = customerId;
		this.loginName = loginName;
		this.repeat = repeat;
		this.deposit = deposit;
		this.good = good;
		this.excellent = excellent;
		this.outstanding = outstanding;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.releasedBonus = releasedBonus;
		this.restBonus = restBonus;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

//	@Column(name = "CUSTOMER_ID", precision = 22, scale = 0)
//	public Integer getCustomerId() {
//		return this.customerId;
//	}
//
//	public void setCustomerId(Integer customerId) {
//		this.customerId = customerId;
//	}

	@Column(name = "LOGIN_NAME", length = 200)
	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "[REPEAT]", length = 20)
	public String getRepeat() {
		return this.repeat;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

	@Column(name = "DEPOSIT", length = 20)
	public String getDeposit() {
		return this.deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	@Column(name = "GOOD", length = 20)
	public String getGood() {
		return this.good;
	}

	public void setGood(String good) {
		this.good = good;
	}

	@Column(name = "EXCELLENT", length = 20)
	public String getExcellent() {
		return this.excellent;
	}

	public void setExcellent(String excellent) {
		this.excellent = excellent;
	}

	@Column(name = "OUTSTANDING", length = 20)
	public String getOutstanding() {
		return this.outstanding;
	}

	public void setOutstanding(String outstanding) {
		this.outstanding = outstanding;
	}

	@Column(name = "CREATE_DATE", length = 7)
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Column(name = "UPDATE_DATE", length = 7)
	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "RELEASED_BONUS", precision = 22, scale = 0)
	public BigDecimal getReleasedBonus() {
		return this.releasedBonus;
	}

	public void setReleasedBonus(BigDecimal releasedBonus) {
		this.releasedBonus = releasedBonus;
	}

	@Column(name = "REST_BONUS", precision = 22, scale = 0)
	public BigDecimal getRestBonus() {
		return this.restBonus;
	}

	public void setRestBonus(BigDecimal restBonus) {
		this.restBonus = restBonus;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "CUSTOMER_ID",insertable = false, updatable = false)
	public TCustomers gettCustomers() {
		return tCustomers;
	}

	public void settCustomers(TCustomers tCustomers) {
		this.tCustomers = tCustomers;
	}
	
//	@JoinColumn(name = "CUSTOMER_ID")
//	public TCustomers getTCustomers() {
//		return tCustomers;
//	}
//
//	public void setTCustomers(TCustomers tCustomers) {
//		this.tCustomers = tCustomers;
//	}

}