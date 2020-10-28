package com.tracy.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * TLuckyDrawPrizeConfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_LUCKY_DRAW_PRIZE_CONFIG")
public class TLuckyDrawPrizeConfig implements java.io.Serializable {

	private String prizeKey;
	private String type;
	private String description;
	private String currency;
	private Integer dailyCount;
	private Double prizeAmount;
	private BigDecimal rate;
	
	private BigDecimal startRange;
	private BigDecimal endRange;

	// Constructors

	/** default constructor */
	public TLuckyDrawPrizeConfig() {
	}

	/** full constructor */
	public TLuckyDrawPrizeConfig(String prizeKey, String description,
			String currency, Integer dailyCount, Double prizeAmount) {
		this.prizeKey = prizeKey;
		this.description = description;
		this.currency = currency;
		this.dailyCount = dailyCount;
		this.prizeAmount = prizeAmount;
	}

	// Property accessors

	@Id
	@Column(name = "PRIZE_KEY", length = 20)
	public String getPrizeKey() {
		return this.prizeKey;
	}

	public void setPrizeKey(String prizeKey) {
		this.prizeKey = prizeKey;
	}

	@Column(name = "DESCRIPTION", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "CURRENCY", length = 10)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "DAILY_COUNT", precision = 20, scale = 0)
	public Integer getDailyCount() {
		return this.dailyCount;
	}

	public void setDailyCount(Integer dailyCount) {
		this.dailyCount = dailyCount;
	}

	@Column(name = "PRIZE_AMOUNT", precision = 18)
	public Double getPrizeAmount() {
		return this.prizeAmount;
	}

	public void setPrizeAmount(Double prizeAmount) {
		this.prizeAmount = prizeAmount;
	}
	@Column(name = "RATE", precision = 5, scale = 2)
	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	@Column(name = "START_RANGE", precision = 20, scale = 0)
	public BigDecimal getStartRange() {
		return startRange;
	}

	public void setStartRange(BigDecimal startRange) {
		this.startRange = startRange;
	}
	@Column(name = "END_RANGE", precision = 20, scale = 0)
	public BigDecimal getEndRange() {
		return endRange;
	}

	public void setEndRange(BigDecimal endRange) {
		this.endRange = endRange;
	}

	@Column(name = "TYPE", length = 20)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}