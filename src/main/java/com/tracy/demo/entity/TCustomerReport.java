package com.tracy.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TCreditLogs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_CUSTOMER_REPORT")
//@SequenceGenerator(sequenceName="T_CUSTOMERS_ID_SEQ", name = "T_CUSTOMERS_ID_SEQ",allocationSize=1)
public class TCustomerReport implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Timestamp createDate;
	
	private BigDecimal totalDeposit;
	private BigDecimal totalWithdrawal;
	private BigDecimal totalPromotion;
	private BigDecimal totalRebate;
	private BigDecimal credit;
	private BigDecimal gameCredit;
	private String month;
	private String loginName;
	private String agentName;
	
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_CUSTOMERS_ID_SEQ")
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	@Column(name = "CREATED_DATE", nullable = false, length = 7)
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
//	@Column(name = "TYPE", nullable = false, length = 100)
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	@Column(name = "REFERENCE_ID", nullable = false, length = 100)
//	public String getReferenceId() {
//		return referenceId;
//	}
//	public void setReferenceId(String referenceId) {
//		this.referenceId = referenceId;
//	}
//	@Column(name = "REMARK", nullable = false, length = 4000)
//	public String getRemark() {
//		return remark;
//	}
//	public void setRemark(String remark) {
//		this.remark = remark;
//	}
//	@Column(name = "PT", precision = 22)
//	public Double getPt() {
//		return pt;
//	}
//	public void setPt(Double pt) {
//		this.pt = pt;
//	}
//	@Column(name = "IMPT", precision = 22)
//	public Double getImpt() {
//		return impt;
//	}
//	public void setImpt(Double impt) {
//		this.impt = impt;
//	}
//	@Column(name = "MG", precision = 22)
//	public Double getMg() {
//		return mg;
//	}
//	public void setMg(Double mg) {
//		this.mg = mg;
//	}
//	@Column(name = "LOCAL", precision = 22)
//	public Double getLocal() {
//		return local;
//	}
//	public void setLocal(Double local) {
//		this.local = local;
//	}
//	@Column(name = "TOTAL", precision = 22)
//	public Double getTotal() {
//		return total;
//	}
//	public void setTotal(Double total) {
//		this.total = total;
//	}
//	@Column(name = "LOGIN_NAME", nullable = false, length = 100)
//	public String getLoginName() {
//		return loginName;
//	}
//	public void setLoginName(String loginName) {
//		this.loginName = loginName;
//	}
//	@Column(name = "AMOUNT", unique = true, nullable = false, precision = 22, scale = 0)
//	public BigDecimal getAmount() {
//		return amount;
//	}
//	public void setAmount(BigDecimal amount) {
//		this.amount = amount;
//	}
//	@Column(name = "BET_RATE", unique = true, nullable = false, precision = 22, scale = 0)
//	public BigDecimal getBetRate() {
//		return betRate;
//	}
//	public void setBetRate(BigDecimal betRate) {
//		this.betRate = betRate;
//	}
	
	@Column(name = "TOTAL_DEPOSIT", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getTotalDeposit() {
		return totalDeposit;
	}
	public void setTotalDeposit(BigDecimal totalDeposit) {
		this.totalDeposit = totalDeposit;
	}
	@Column(name = "TOTAL_WITHDRAWAL", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getTotalWithdrawal() {
		return totalWithdrawal;
	}
	public void setTotalWithdrawal(BigDecimal totalWithdrawal) {
		this.totalWithdrawal = totalWithdrawal;
	}
	@Column(name = "TOTAL_PROMOTION", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getTotalPromotion() {
		return totalPromotion;
	}
	public void setTotalPromotion(BigDecimal totalPromotion) {
		this.totalPromotion = totalPromotion;
	}
	@Column(name = "TOTAL_REBATE", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getTotalRebate() {
		return totalRebate;
	}
	public void setTotalRebate(BigDecimal totalRebate) {
		this.totalRebate = totalRebate;
	}
	@Column(name = "CREDIT", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getCredit() {
		return credit;
	}
	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}
	@Column(name = "GAME_CREDIT", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getGameCredit() {
		return gameCredit;
	}
	public void setGameCredit(BigDecimal gameCredit) {
		this.gameCredit = gameCredit;
	}
	@Column(name = "MONTH", nullable = false, length = 100)
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	@Column(name = "LOGIN_NAME", nullable = false, length = 100)
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	@Column(name = "AGENT_NAME", nullable = false, length = 100)
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	

}