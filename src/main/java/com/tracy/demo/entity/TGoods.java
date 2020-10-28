package com.tracy.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TGoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_GOODS")
public class TGoods implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String title;
	private String describe;
	private BigDecimal score;
	private Timestamp createTime;
	private String state;
	private BigDecimal totalCn;
	private String path;

	// Constructors

	/** default constructor */
	public TGoods() {
	}

	/** minimal constructor */
	public TGoods(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public TGoods(BigDecimal id, String title, String describe,
			BigDecimal score, Timestamp createTime, String state,
			BigDecimal totalCn, String path) {
		this.id = id;
		this.title = title;
		this.describe = describe;
		this.score = score;
		this.createTime = createTime;
		this.state = state;
		this.totalCn = totalCn;
		this.path = path;
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

	@Column(name = "TITLE", length = 200)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "[DESCRIBE]", length = 2000)
	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Column(name = "SCORE", precision = 22, scale = 0)
	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	@Column(name = "CREATE_TIME", length = 7)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "STATE", length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "TOTAL_CN", precision = 22, scale = 0)
	public BigDecimal getTotalCn() {
		return this.totalCn;
	}

	public void setTotalCn(BigDecimal totalCn) {
		this.totalCn = totalCn;
	}

	@Column(name = "PATH", length = 200)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}