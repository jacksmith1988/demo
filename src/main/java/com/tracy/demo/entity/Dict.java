
package com.tracy.demo.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 字典Entity
 *
 * @author ware
 * @version 2013-05-15
 */

/**
 * SysDict entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_DICT")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region="sysDataCache") 
@Cacheable(true)
public class Dict implements java.io.Serializable {

	// Fields

	private String id;
	private String value;
	private String label;
	private String type;
	private String description;
	private Long sort;
	private String parentId;
	private String createBy;
	private Timestamp createDate;
	private String updateBy;
	private Timestamp updateDate;
	private String remarks;
	private String delFlag;

	// Constructors

	/** default constructor */
	public Dict() {
	}

	/** minimal constructor */
	public Dict(String id, String value, String label, String type,
			String description, Long sort, String createBy,
			Timestamp createDate, String updateBy, Timestamp updateDate,
			String delFlag) {
		this.id = id;
		this.value = value;
		this.label = label;
		this.type = type;
		this.description = description;
		this.sort = sort;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.delFlag = delFlag;
	}

	/** full constructor */
	public Dict(String id, String value, String label, String type,
			String description, Long sort, String parentId, String createBy,
			Timestamp createDate, String updateBy, Timestamp updateDate,
			String remarks, String delFlag) {
		this.id = id;
		this.value = value;
		this.label = label;
		this.type = type;
		this.description = description;
		this.sort = sort;
		this.parentId = parentId;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.remarks = remarks;
		this.delFlag = delFlag;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "VALUE", nullable = false, length = 100)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "LABEL", nullable = false, length = 100)
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Column(name = "TYPE", nullable = false, length = 100)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "DESCRIPTION", nullable = false)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "SORT", nullable = false, precision = 10, scale = 0)
	public Long getSort() {
		return this.sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
	}

	@Column(name = "PARENT_ID", length = 64)
	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Column(name = "CREATE_BY", nullable = false, length = 64)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "CREATE_DATE", nullable = false, length = 11)
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Column(name = "UPDATE_BY", nullable = false, length = 64)
	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	@Column(name = "UPDATE_DATE", nullable = false, length = 11)
	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "REMARKS")
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "DEL_FLAG", nullable = false, length = 1)
	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

}