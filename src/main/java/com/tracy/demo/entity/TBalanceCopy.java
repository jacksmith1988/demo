package com.tracy.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TCreditLogs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_BALANCE_COPY")
public class TBalanceCopy implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Timestamp createDate;
	private String type;
	private Double pt;
	private Double impt;
	private Double mg;
	private String referenceId;
	private String remark;
	private Double local;
	private Double total;
	private String loginName;
	private BigDecimal amount;
	private BigDecimal betRate;
	
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	@Column(name = "CREATE_DATE", nullable = false, length = 7)
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	@Column(name = "TYPE", nullable = false, length = 100)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(name = "REFERENCE_ID", nullable = false, length = 100)
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	@Column(name = "REMARK", nullable = false, length = 4000)
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Column(name = "PT", precision = 22)
	public Double getPt() {
		return pt;
	}
	public void setPt(Double pt) {
		this.pt = pt;
	}
	@Column(name = "IMPT", precision = 22)
	public Double getImpt() {
		return impt;
	}
	public void setImpt(Double impt) {
		this.impt = impt;
	}
	@Column(name = "MG", precision = 22)
	public Double getMg() {
		return mg;
	}
	public void setMg(Double mg) {
		this.mg = mg;
	}
	@Column(name = "LOCAL", precision = 22)
	public Double getLocal() {
		return local;
	}
	public void setLocal(Double local) {
		this.local = local;
	}
	@Column(name = "TOTAL", precision = 22)
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	@Column(name = "LOGIN_NAME", nullable = false, length = 100)
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	@Column(name = "AMOUNT", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Column(name = "BET_RATE", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getBetRate() {
		return betRate;
	}
	public void setBetRate(BigDecimal betRate) {
		this.betRate = betRate;
	}
	

}