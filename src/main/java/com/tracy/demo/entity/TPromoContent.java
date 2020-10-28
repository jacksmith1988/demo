package com.tracy.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TPromoContent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_PROMO_CONTENT")
//@SequenceGenerator(sequenceName="T_PROMOTION_CONFIG_ID_SEQ", name = "T_PROMO_CONTENT_ID_SEQ",allocationSize=1)
public class TPromoContent implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String title;
	private byte[] content;
	private BigDecimal priority;
	private String status;
	private String webImg;
	private String remarks;
	private Timestamp createDate;
	private String createBy;
	
	private String contentStr;
	// Constructors

	/** default constructor */
	public TPromoContent() {
	}

	/** minimal constructor */
	public TPromoContent(BigDecimal id) {
		this.id = id;
	}

	/** full constructor */
	public TPromoContent(BigDecimal id, String title, byte[] content,
			BigDecimal priority, String status, String webImg, String remarks,
			Timestamp createDate, String createBy) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.priority = priority;
		this.status = status;
		this.webImg = webImg;
		this.remarks = remarks;
		this.createDate = createDate;
		this.createBy = createBy;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_PROMO_CONTENT_ID_SEQ")
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "TITLE", length = 4000)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Lob
	@Column(name = "CONTENT")
	public byte[] getContent() {
		return this.content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	@Column(name = "PRIORITY", precision = 22, scale = 0)
	public BigDecimal getPriority() {
		return this.priority;
	}

	public void setPriority(BigDecimal priority) {
		this.priority = priority;
	}

	@Column(name = "STATUS", length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "WEB_IMG", length = 4000)
	public String getWebImg() {
		return this.webImg;
	}

	public void setWebImg(String webImg) {
		this.webImg = webImg;
	}

	@Column(name = "REMARKS", length = 4000)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "CREATE_DATE", length = 7)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Column(name = "CREATE_BY", length = 100)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	@Transient
	public String getContentStr() {
		return new String(content);
	}

	public void setContentStr(String contentStr) {
		this.contentStr = contentStr;
	}

}