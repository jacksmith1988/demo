package com.tracy.demo.entity;


import javax.persistence.*;
import java.math.BigDecimal;

/**
 * TMessageSpec entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_MESSAGE_SPEC")
//@SequenceGenerator(sequenceName="T_MESSAGE_SPEC_ID_SEQ", name = "T_MESSAGE_SPEC_ID_SEQ",allocationSize=1)
public class TMessageSpec implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String subject;
	private String content;
	private String customerFilter;
	private BigDecimal total;
	private String sender;

	// Constructors

	/** default constructor */
	public TMessageSpec() {
	}

	/** minimal constructor */
	public TMessageSpec(BigDecimal id, String subject, String content,
			String customerFilter, String sender) {
		this.id = id;
		this.subject = subject;
		this.content = content;
		this.customerFilter = customerFilter;
		this.sender = sender;
	}

	/** full constructor */
	public TMessageSpec(BigDecimal id, String subject, String content,
			String customerFilter, BigDecimal total, String sender) {
		this.id = id;
		this.subject = subject;
		this.content = content;
		this.customerFilter = customerFilter;
		this.total = total;
		this.sender = sender;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_MESSAGE_SPEC_ID_SEQ")
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "[SUBJECT]", nullable = false, length = 4000)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "CONTENT", nullable = false, length = 4000)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "CUSTOMER_FILTER", nullable = false, length = 4000)
	public String getCustomerFilter() {
		return this.customerFilter;
	}

	public void setCustomerFilter(String customerFilter) {
		this.customerFilter = customerFilter;
	}

	@Column(name = "TOTAL", precision = 22, scale = 0)
	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Column(name = "SENDER", nullable = false, length = 200)
	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

}