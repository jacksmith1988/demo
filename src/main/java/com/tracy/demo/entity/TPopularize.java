package com.tracy.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * TPopularize entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_POPULARIZE", schema = "FYZY")
public class TPopularize implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String name;
	private BigDecimal cn;
	private String url;

	// Constructors

	/** default constructor */
	public TPopularize() {
	}

	/** minimal constructor */
	public TPopularize(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public TPopularize(BigDecimal id, String name, BigDecimal cn, String url) {
		this.id = id;
		this.name = name;
		this.cn = cn;
		this.url = url;
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

	@Column(name = "NAME", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CN", precision = 22, scale = 0)
	public BigDecimal getCn() {
		return this.cn;
	}

	public void setCn(BigDecimal cn) {
		this.cn = cn;
	}

	@Column(name = "URL", length = 2000)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}