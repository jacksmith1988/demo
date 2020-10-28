package com.tracy.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "T_RED_ENVELOPE_CONFIG")
//@SequenceGenerator(sequenceName="T_RED_ENVELOPE_CONFIG_ID_SEQ", name = "T_RED_ENVELOPE_CONFIG_ID_SEQ",allocationSize=1)
public class TRedEnvelopeConfig {
	private BigDecimal id;
	private String url;
	private String flag;
	private String remarks;
	private Timestamp createDate;
	private String effectStartDate;
	private String effectEndDate;
	private Double maxAmount;   //红包金额
	private Double minAmount;	//中奖概率
	private BigDecimal minDeposit;
	private BigDecimal maxDeposit;
	private Integer sendNum;
	private Integer limitNum;
	private String type;
	private String backUrl;
	
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_RED_ENVELOPE_CONFIG_ID_SEQ")
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	@Column(name = "URL", length = 500)
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Column(name = "FLAG", length = 200)
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	@Column(name = "REMARKS", length = 500)
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Column(name = "CREATE_DATE", length = 7)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	@Column(name = "EFFECT_START_DATE", length = 20)
	public String getEffectStartDate() {
		return effectStartDate;
	}
	public void setEffectStartDate(String effectStartDate) {
		this.effectStartDate = effectStartDate;
	}
	@Column(name = "EFFECT_END_DATE", length = 20)
	public String getEffectEndDate() {
		return effectEndDate;
	}
	public void setEffectEndDate(String effectEndDate) {
		this.effectEndDate = effectEndDate;
	}
	@Column(name = "MAX_AMOUNT", precision = 22)
	public Double getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(Double maxAmount) {
		this.maxAmount = maxAmount;
	}
	@Column(name = "MIN_AMOUNT", precision = 22)
	public Double getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(Double minAmount) {
		this.minAmount = minAmount;
	}
	@Column(name = "SENDNUM", precision = 8, scale = 0)
	public Integer getSendNum() {
		return sendNum;
	}
	public void setSendNum(Integer sendNum) {
		this.sendNum = sendNum;
	}
	@Column(name = "MIN_DEPOSIT", precision = 22)
	public BigDecimal getMinDeposit() {
		return minDeposit;
	}
	public void setMinDeposit(BigDecimal minDeposit) {
		this.minDeposit = minDeposit;
	}
	@Column(name = "MAX_DEPOSIT", precision = 22)
	public BigDecimal getMaxDeposit() {
		return maxDeposit;
	}
	public void setMaxDeposit(BigDecimal maxDeposit) {
		this.maxDeposit = maxDeposit;
	}
	@Column(name = "LIMITNUM", precision = 5, scale = 0)
	public Integer getLimitNum() {
		return limitNum;
	}
	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}
	@Column(name = "TYPE", length = 20)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(name = "BACKURL", length = 500)
	public String getBackUrl() {
		return backUrl;
	}
	
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}
	
}
