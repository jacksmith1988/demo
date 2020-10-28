package com.tracy.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TAliTenPay entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_ALI_TEN_PAY")
public class TAliTenPay implements java.io.Serializable {

	// Fields
	private String id;
	private String billNo;
	private BigDecimal amount;
	private Timestamp createDate;
	private String remark;
	private String source;
	private String type;
	private String name;
	private String vuser;
	private String flag;
	private String get_user;
	private Timestamp get_time;

	// Constructors

	/** default constructor */
	public TAliTenPay() {
	}

	/** minimal constructor */
	public TAliTenPay(String billNo, BigDecimal amount, Timestamp createDate) {
		this.billNo = billNo;
		this.amount = amount;
		this.createDate = createDate;
	}

	/** full constructor */
	public TAliTenPay(String billNo, BigDecimal amount, Timestamp createDate,
			String remark, String source, String type) {
		this.billNo = billNo;
		this.amount = amount;
		this.createDate = createDate;
		this.remark = remark;
		this.source = source;
		this.type = type;
	}

	// Property accessors
	@Id
	@Column(name = "BILL_NO", unique = true, nullable = false, length = 100)
	public String getBillNo() {
		return this.billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	@Column(name = "AMOUNT", nullable = false, precision = 22, scale = 0)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "CREATE_DATE", nullable = false, length = 7)
	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	@Column(name = "REMARK", length = 4000)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "SOURCE", length = 4000)
	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Column(name = "TYPE", length = 20)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name = "ID", unique = true, nullable = false, length = 100)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@Column(name = "NAME", length = 200)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "VUSER", length = 200)
	public String getVuser() {
		return vuser;
	}

	public void setVuser(String vuser) {
		this.vuser = vuser;
	}
	@Column(name = "FLAG", length = 20)
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	@Column(name = "GET_USER",  length = 100)
	public String getGet_user() {
		return get_user;
	}
	public void setGet_user(String get_user) {
		this.get_user = get_user;
	}
	@Column(name = "GET_TIME")
	public Timestamp getGet_time() {
		return get_time;
	}
	public void setGet_time(Timestamp get_time) {
		this.get_time = get_time;
	}

}