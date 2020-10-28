package com.tracy.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Set;

/**
 * TLevels entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_LEVELS", schema = "WARE")
public class TLevels implements java.io.Serializable {

	// Fields

	private String levelId;
	private String createdBy;
	private Timestamp createdDate;
	private String levelName;
	private String levelDesc;
	private Timestamp lastUpdate;
	private String lastUpdatedBy;

	// Constructors

	/** default constructor */
	public TLevels() {
	}

	/** minimal constructor */
	public TLevels(String levelId, String createdBy, Timestamp createdDate,
			String levelName) {
		this.levelId = levelId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.levelName = levelName;
	}

	/** full constructor */
	public TLevels(String levelId, String createdBy, Timestamp createdDate,
			String levelName, String levelDesc, Timestamp lastUpdate,
			String lastUpdatedBy, Set<TCustomerLevels> TCustomerLevelses) {
		this.levelId = levelId;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.levelName = levelName;
		this.levelDesc = levelDesc;
		this.lastUpdate = lastUpdate;
		this.lastUpdatedBy = lastUpdatedBy;
	}

	// Property accessors
	@Id
	@Column(name = "LEVEL_ID", unique = true, nullable = false, length = 4)
	public String getLevelId() {
		return this.levelId;
	}

	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}

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

	@Column(name = "LEVEL_NAME", nullable = false, length = 20)
	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	@Column(name = "LEVEL_DESC", length = 200)
	public String getLevelDesc() {
		return this.levelDesc;
	}

	public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
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


}