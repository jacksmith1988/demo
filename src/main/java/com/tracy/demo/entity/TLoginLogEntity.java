package com.tracy.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "T_LOGIN_LOG")
//@SequenceGenerator(sequenceName="T_OPERATOR_LOGS_ID_SEQ", name = "T_OPERATOR_LOGS_ID_SEQ",allocationSize=1)
public class TLoginLogEntity {

	private BigDecimal id;
	private String loginName;
	private String domain;
	private String source;
	private String ua;
	private String refer;
	private String remark;
	private String ip;
	private Timestamp createDate;
	
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_OPERATOR_LOGS_ID_SEQ")
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	@Column(name = "LOGIN_NAME", length = 50)
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	@Column(name = "DOMAIN", length = 100)
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Column(name = "SOURCE", length = 100)
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	@Column(name = "UA", length = 2000)
	public String getUa() {
		return ua;
	}
	public void setUa(String ua) {
		this.ua = ua;
	}
	@Column(name = "REFER", length = 100)
	public String getRefer() {
		return refer;
	}
	public void setRefer(String refer) {
		this.refer = refer;
	}
	@Column(name = "REMARK", length = 2000)
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Column(name = "CREATE_DATE", length = 7)
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	@Column(name = "IP", length = 100)
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
