package com.tracy.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TOnlinePaymentConfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_POPUP")
public class TPopup implements java.io.Serializable {

	private BigDecimal id;
	private String url;
	private String flag;
	private String remarks;
	private Timestamp createDate;
	private Timestamp effectStartDate;
	private Timestamp effectEndDate;
	private String title;
	private String href;
	
	
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	@Column(name = "URL", length = 200)
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
	@Column(name = "EFFECT_START_DATE", length = 7)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	public Timestamp getEffectStartDate() {
		return effectStartDate;
	}
	public void setEffectStartDate(Timestamp effectStartDate) {
		this.effectStartDate = effectStartDate;
	}
	@Column(name = "EFFECT_END_DATE", length = 7)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	public Timestamp getEffectEndDate() {
		return effectEndDate;
	}
	public void setEffectEndDate(Timestamp effectEndDate) {
		this.effectEndDate = effectEndDate;
	}
	@Column(name = "HREF", length = 500)
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	@Column(name = "TITLE", length = 500)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}