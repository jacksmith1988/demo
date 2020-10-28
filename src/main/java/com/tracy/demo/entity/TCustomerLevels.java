package com.tracy.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TCustomerLevels entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_CUSTOMER_LEVELS")
//@SequenceGenerator(sequenceName="T_CUSTOMER_LEVELS_ID_SEQ", name = "T_CUSTOMER_LEVELS_ID_SEQ",allocationSize=1)
public class TCustomerLevels implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields
	private BigDecimal id;
	private Integer customerId;
	private String levelId;
	//private String levelId;
	private String createdBy;
	private Timestamp createdDate;
	private Short flag;
	private Timestamp lastUpdate;
	private String lastUpdatedBy;

	// Constructors

	/** default constructor */
	public TCustomerLevels() {
	}

	/** minimal constructor */
	public TCustomerLevels(com.tracy.demo.entity.TLevels TLevels,
                           String createdBy, Timestamp createdDate, Short flag) {
//		this.TLevels = TLevels;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.flag = flag;
	}

	/** full constructor */
	public TCustomerLevels( com.tracy.demo.entity.TLevels TLevels,
			String createdBy, Timestamp createdDate, Short flag,
			Timestamp lastUpdate, String lastUpdatedBy) {
//		this.TLevels = TLevels;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.flag = flag;
		this.lastUpdate = lastUpdate;
		this.lastUpdatedBy = lastUpdatedBy;
	}

	// Property accessors


	@Column(name = "CREATED_BY", nullable = false, length = 50)
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

	@Column(name = "FLAG", nullable = false, precision = 3, scale = 0)
	public Short getFlag() {
		return this.flag;
	}

	public void setFlag(Short flag) {
		this.flag = flag;
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
//	@Column(name = "LEVEL_ID", unique = true, nullable = false, length = 4)
//	public String getLevelId() {
//		return levelId;
//	}
//
//	public void setLevelId(String levelId) {
//		this.levelId = levelId;
//	}

	@Column(name = "CUSTOMER_ID", nullable = false, precision = 22, scale = 0)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "LEVEL_ID", nullable = false, length = 4)
	public String getLevelId() {
		return this.levelId;
	}

	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 20, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_CUSTOMER_LEVELS_ID_SEQ")
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

}