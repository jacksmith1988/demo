package com.tracy.demo.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TNotices entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_NOTICES")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region="sysDataCache") 
@Cacheable(true)
public class TNotices implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String productId;
	private String language;
	private String content;
	private String createBy;
	private Timestamp createDate;
	private String lastUpdateBy;
	private Timestamp lastUpdate;
	private Timestamp startDate;
	private Timestamp endDate;
	private String flag;
	private String sortOrder;
	private BigDecimal groupId;

	// Constructors

	/** default constructor */
	public TNotices() {
	}

	/** minimal constructor */
	public TNotices(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public TNotices(BigDecimal id, String productId, String language,
			String content, String createBy, Timestamp createDate,
			String lastUpdateBy, Timestamp lastUpdate, Timestamp startDate,
			Timestamp endDate, String flag, String sortOrder, BigDecimal groupId) {
		this.id = id;
		this.productId = productId;
		this.language = language;
		this.content = content;
		this.createBy = createBy;
		this.createDate = createDate;
		this.lastUpdateBy = lastUpdateBy;
		this.lastUpdate = lastUpdate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.flag = flag;
		this.sortOrder = sortOrder;
		this.groupId = groupId;
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

	@Column(name = "PRODUCT_ID", length = 3)
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Column(name = "LANGUAGE", length = 10)
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "CONTENT", length = 2000)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "CREATE_BY", length = 50)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "CREATE_DATE", length = 7)
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Column(name = "LAST_UPDATE_BY", length = 50)
	public String getLastUpdateBy() {
		return this.lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	@Column(name = "LAST_UPDATE", length = 7)
	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "START_DATE", length = 7)
	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	@Column(name = "END_DATE", length = 7)
	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	@Column(name = "FLAG", length = 1)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "SORT_ORDER", length = 5)
	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Column(name = "GROUP_ID", precision = 22, scale = 0)
	public BigDecimal getGroupId() {
		return this.groupId;
	}

	public void setGroupId(BigDecimal groupId) {
		this.groupId = groupId;
	}

}