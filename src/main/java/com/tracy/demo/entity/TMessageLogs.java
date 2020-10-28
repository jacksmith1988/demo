package com.tracy.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TMessageLogs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_MESSAGE_LOGS")
public class TMessageLogs implements java.io.Serializable {

	// Fields

	private BigDecimal messageId;
	private Integer messageType;
	private String subject;
	private String sender;
	private String message;
	private String receipients;
	private Timestamp dateCreated;
	private Boolean read;
	private com.tracy.demo.entity.TMessageSpec messageSpec;
	// Constructors

	/** default constructor */
	public TMessageLogs() {
	}

	/** minimal constructor */
	public TMessageLogs(BigDecimal messageId, Integer messageType,
			String subject, String sender, String message, Timestamp dateCreated) {
		this.messageId = messageId;
		this.messageType = messageType;
		this.subject = subject;
		this.sender = sender;
		this.message = message;
		this.dateCreated = dateCreated;
	}

	/** full constructor */
	public TMessageLogs(BigDecimal messageId, Integer messageType,
			String subject, String sender, String message, String receipients,
			Timestamp dateCreated, Boolean read) {
		this.messageId = messageId;
		this.messageType = messageType;
		this.subject = subject;
		this.sender = sender;
		this.message = message;
		this.receipients = receipients;
		this.dateCreated = dateCreated;
		this.read = read;
	}

	// Property accessors
	@Id
	@Column(name = "MESSAGE_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getMessageId() {
		return this.messageId;
	}

	public void setMessageId(BigDecimal messageId) {
		this.messageId = messageId;
	}

	@Column(name = "MESSAGE_TYPE", nullable = false, precision = 1, scale = 0)
	public Integer getMessageType() {
		return this.messageType;
	}

	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}

	@Column(name = "SUBJECT", nullable = false, length = 200)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "SENDER", nullable = false, length = 50)
	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	@Column(name = "MESSAGE", nullable = false, length = 4000)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "RECEIPIENTS", length = 50)
	public String getReceipients() {
		return this.receipients;
	}

	public void setReceipients(String receipients) {
		this.receipients = receipients;
	}

	@Column(name = "DATE_CREATED", nullable = false, length = 7)
	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Column(name = "[READ]", precision = 1, scale = 0)
	public Boolean getRead() {
		return this.read;
	}

	public void setRead(Boolean read) {
		this.read = read;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "SPEC_ID")
	public com.tracy.demo.entity.TMessageSpec getMessageSpec() {
		return messageSpec;
	}

	public void setMessageSpec(com.tracy.demo.entity.TMessageSpec messageSpec) {
		this.messageSpec = messageSpec;
	}


}