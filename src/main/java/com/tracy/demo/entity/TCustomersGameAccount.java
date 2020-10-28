package com.tracy.demo.entity;

import org.codehaus.jackson.annotate.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * TCustomersGameAccount entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_CUSTOMERS_GAME_ACCOUNT")
public class TCustomersGameAccount implements java.io.Serializable {

	// Fields
	
	private Integer customerId;
	private BigDecimal ptStatus;
	private BigDecimal mgStatus;
	private BigDecimal gameplayStatus;
	private BigDecimal gameosStatus;
	private BigDecimal laxinoStatus;
	private BigDecimal netentStatus;
	private BigDecimal onesgamesStatus;
	private BigDecimal xproStatus;
	private BigDecimal bbinStatus;
	private BigDecimal bbtechStatus;
	private BigDecimal ttgStatus;
	private BigDecimal imptStatus;
	
	
    private TCustomers tCustomers;
	// Constructors

	/** default constructor */
	public TCustomersGameAccount() {
	}

	/** full constructor */
	public TCustomersGameAccount(Integer customerId, int ptStatus,
			int mgStatus, int gameplayStatus,
			int gameosStatus, int laxinoStatus,
			int netentStatus, int onesgamesStatus,int xproStatus,int bbinStatus) {
		this.customerId = customerId;
		this.ptStatus = new BigDecimal(ptStatus);
		this.mgStatus = new BigDecimal(mgStatus);
		this.gameplayStatus = new BigDecimal(gameplayStatus);
		this.gameosStatus = new BigDecimal(gameosStatus);
		this.laxinoStatus = new BigDecimal(laxinoStatus);
		this.netentStatus = new BigDecimal(netentStatus);
		this.onesgamesStatus = new BigDecimal(onesgamesStatus);
		this.xproStatus = new BigDecimal(xproStatus);
		this.bbinStatus = new BigDecimal(bbinStatus);
	}

	// Property accessors
	//@GenericGenerator(name = "generator", strategy = "foreign",parameters=@Parameter(name = "property", value = "tCustomers"))
	////@GeneratedValue(generator = "generator")
//	@Id
//	@Column(name = "CUSTOMER_ID", unique = true, nullable = false, precision = 22, scale = 0)
	 @Id
	    @Column(name="CUSTOMER_ID",unique = true, nullable = false, precision = 22, scale = 0)
	    //@GeneratedValue(generator="gen")
//	    @GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="tCustomers"))
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "PT_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getPtStatus() {
		return this.ptStatus;
	}

	public void setPtStatus(BigDecimal ptStatus) {
		this.ptStatus = ptStatus;
	}

	@Column(name = "MG_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getMgStatus() {
		return this.mgStatus;
	}

	public void setMgStatus(BigDecimal mgStatus) {
		this.mgStatus = mgStatus;
	}

	@Column(name = "GAMEPLAY_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getGameplayStatus() {
		return this.gameplayStatus;
	}

	public void setGameplayStatus(BigDecimal gameplayStatus) {
		this.gameplayStatus = gameplayStatus;
	}

	@Column(name = "GAMEOS_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getGameosStatus() {
		return this.gameosStatus;
	}

	public void setGameosStatus(BigDecimal gameosStatus) {
		this.gameosStatus = gameosStatus;
	}

	@Column(name = "LAXINO_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getLaxinoStatus() {
		return this.laxinoStatus;
	}

	public void setLaxinoStatus(BigDecimal laxinoStatus) {
		this.laxinoStatus = laxinoStatus;
	}

	@Column(name = "NETENT_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getNetentStatus() {
		return this.netentStatus;
	}

	public void setNetentStatus(BigDecimal netentStatus) {
		this.netentStatus = netentStatus;
	}

	@Column(name = "ONESGAMES_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getOnesgamesStatus() {
		return this.onesgamesStatus;
	}

	public void setOnesgamesStatus(BigDecimal onesgamesStatus) {
		this.onesgamesStatus = onesgamesStatus;
	}
	
	@Column(name = "XPRO_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getXproStatus() {
		return xproStatus;
	}

	public void setXproStatus(BigDecimal xproStatus) {
		this.xproStatus = xproStatus;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@JsonBackReference
	public TCustomers gettCustomers() {
		return tCustomers;
	}
	@JsonBackReference
	public void settCustomers(TCustomers tCustomers) {
		this.tCustomers = tCustomers;
	}

	@Column(name = "BBIN_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getBbinStatus() {
		return bbinStatus;
	}

	public void setBbinStatus(BigDecimal bbinStatus) {
		this.bbinStatus = bbinStatus;
	}
	@Column(name = "BBTECH_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getBbtechStatus() {
		return bbtechStatus;
	}

	public void setBbtechStatus(BigDecimal bbtechStatus) {
		this.bbtechStatus = bbtechStatus;
	}
	@Column(name = "TTG_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getTtgStatus() {
		return ttgStatus;
	}

	public void setTtgStatus(BigDecimal ttgStatus) {
		this.ttgStatus = ttgStatus;
	}
	@Column(name = "IMPT_STATUS", nullable = true, precision = 22, scale = 0)
	public BigDecimal getImptStatus() {
		return imptStatus;
	}

	public void setImptStatus(BigDecimal imptStatus) {
		this.imptStatus = imptStatus;
	}

}