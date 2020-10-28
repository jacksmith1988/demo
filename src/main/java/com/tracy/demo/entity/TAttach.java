package com.tracy.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "T_ATTACH")
//@SequenceGenerator(sequenceName="T_PROMOTION_CONFIG_ID_SEQ", name = "T_ATTACH_ID_SEQ",allocationSize=1)
public class TAttach {
	private BigDecimal id;
	private byte[] content;
	
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_ATTACH_ID_SEQ")
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	@Lob
	@Column(name = "CONTENT")
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
}
