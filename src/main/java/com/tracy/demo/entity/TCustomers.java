package com.tracy.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * TCustomers entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T_CUSTOMERS",  uniqueConstraints = @UniqueConstraint(columnNames = "LOGIN_NAME"))
//@SequenceGenerator(sequenceName="T_CUSTOMERS_ID_SEQ", name = "T_CUSTOMERS_ID_SEQ",allocationSize=1)
//@OptimisticLocking(type=OptimisticLockType.VERSION)
@DynamicUpdate(value=true)
public class TCustomers implements java.io.Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="T_CUSTOMERS_ID_SEQ")
	@Column(name = "CUSTOMER_ID", unique = true, nullable = false, precision = 20, scale = 0)
	public Integer customerId;
	@Version
	@Column(name = "version", columnDefinition = "integer DEFAULT 0", nullable = false)
	public Integer version;
	@Column(name = "ADDRESS", length = 128)
	public String address;
	@Column(name = "BEFORE_LOGIN_DATE", length = 7)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	public Timestamp beforeLoginDate;
	@Column(name = "BEFORE_LOGIN_IP", length = 60)
	public String beforeLoginIp;
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	@Column(name = "BIRTH_DATE", length = 7)
	public Timestamp birthDate;
	@Column(name = "CREATED_BY", length = 50)
	public String createdBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@Column(name = "CREATED_DATE", length = 7)
	public Timestamp createdDate;
	@Column(name = "CREDIT", precision = 22)
	public Double credit;
	@Column(name = "CURRENCY", length = 20)
	public String currency;
	@Column(name = "CUSTOMER_TYPE", precision = 1, scale = 0)
	public String customerType;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@Column(name = "EFFECTIVITY_DATE", length = 7)
	public Timestamp effectivityDate;
	@Column(name = "EMAIL", length = 256)
	public String email;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@Column(name = "EXPIRY_DATE", length = 7)
	public Timestamp expiryDate;
	@Column(name = "FLAG", precision = 1, scale = 0)
	public String flag;
	@Column(name = "IP_ADDRESS", length = 60)
	public String ipAddress;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@Column(name = "LAST_LOGIN_DATE", length = 7)
	public Timestamp lastLoginDate;
	@Column(name = "LAST_LOGIN_IP", length = 60)
	public String lastLoginIp;
	@Column(name = "LOGIN_NAME", unique = true, length = 50)
	public String loginName;
	@Column(name = "LOGIN_TIMES", precision = 10, scale = 0)
	public Long loginTimes;
	@Column(name = "PARENT_ID", precision = 22, scale = 0)
	public BigDecimal parentId;
	@Column(name = "PHONE", length = 40)
	public String phone;
	@Column(name = "PWD", length = 32)
	public String pwd;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@Column(name = "PWD_EXPIRY_DATE", length = 7)
	public Timestamp pwdExpiryDate;
	@Column(name = "REAL_NAME", length = 100)
	public String realName;
	@Column(name = "REMARKS", length = 500)
	public String remarks;
	@Column(name = "SEX", length = 1)
	public String sex;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@Column(name = "LAST_UPDATE", length = 7)
	public Timestamp lastUpdate;
	@Column(name = "LAST_UPDATED_BY", length = 50)
	public String lastUpdatedBy;
	@Column(name = "PRODUCT_ID", length = 5)
	public String productId;
	@Column(name = "GAME_KEY", length = 32)
	public String gameKey;
	@Column(name = "ONLINE_MESSENGER", length = 50)
	public String onlineMessenger;
	@Column(name = "PWD_OLD", length = 32)
	public String pwdOld;
	@Column(name = "[CODE]", precision = 10, scale = 0)
	public Long code;
	@Column(name = "SELF_EXCL_ENABLE", precision = 1, scale = 0)
	public String selfExclEnable;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@Column(name = "SELF_EXCL_DATE", length = 7)
	public Timestamp selfExclDate;
	@Column(name = "MAX_DEPOSIT_AMT", precision = 22)
	public Double maxDepositAmt;
	@Column(name = "MAX_DEPOSIT_PERIOD", precision = 1, scale = 0)
	public String maxDepositPeriod;
	@Column(name = "MAX_STAKE_AMT", precision = 22)
	public Double maxStakeAmt;
	@Column(name = "MAX_STAKE_PERIOD", precision = 1, scale = 0)
	public String maxStakePeriod;
	@Column(name = "MAX_NO_OF_BET", precision = 22)
	public Double maxNoOfBet;
	@Column(name = "MAX_NO_OF_BET_PERIOD", precision = 1, scale = 0)
	public String maxNoOfBetPeriod;
	@Column(name = "TITLE", length = 30)
	public String title;
	@Column(name = "FIRST_NAME", length = 30)
	public String firstName;
	@Column(name = "LAST_NAME", length = 30)
	public String lastName;
	@Column(name = "COUNTRY", length = 30)
	public String country;
	@Column(name = "BUILDING", length = 30)
	public String building;
	@Column(name = "STREET", length = 30)
	public String street;
	@Column(name = "TOWN", length = 30)
	public String town;
	@Column(name = "CITY", length = 30)
	public String city;
	@Column(name = "POSTCODE", length = 30)
	public String postcode;
	@Column(name = "MOBILEPHONE", length = 30)
	public String mobilephone;
	@Column(name = "AGENTCODE", length = 30)
	public String agentcode;
	@Column(name = "REFCODE", length = 30)
	public String refcode;
	@Column(name = "DISPLAYLANGUAGE", length = 30)
	public String displaylanguage;
	@Column(name = "SECURITYQUESTION_1", length = 50)
	public String securityquestion1;
	@Column(name = "SECURITYANSWER_1", length = 50)
	public String securityanswer1;
	@Column(name = "SECURITYQUESTION_2", length = 50)
	public String securityquestion2;
	@Column(name = "SECURITYANSWER_2", length = 50)
	public String securityanswer2;
	@Column(name = "CUSTOMER_GROUP", length = 20)
	public String customerGroup;
	@Column(name = "HOUSE", length = 200)
	public String house;
	@Column(name = "HEAR_US")
	public String hearUs;
	@Column(name = "PROMOTIONAL_CODE", length = 200)
	public String promotionalCode;
	@Column(name = "KYC_STATUS", length = 200)
	public String kycStatus;
	@Column(name = "DOCUMENT1", length = 20)
	public String document1;
	@Column(name = "DOCUMENT2", length = 20)
	public String document2;
	@Column(name = "DOCUMENT3", length = 20)
	public String document3;
	@Column(name = "CUSTOMER_PLEVEL", length = 20)
	public String customerPlevel;
	@Column(name = "ACCOUNT_STATUS", precision = 1, scale = 0)
	public String accountStatus;
	@Column(name = "AGE_VERIFICATION", precision = 1, scale = 0)
	public String ageVerification;
	@Column(name = "FRAUD_CUSTOMER", precision = 1, scale = 0)
	public String fraudCustomer;
	@Column(name = "CLOSE_MON_REQUIRED", precision = 1, scale = 0)
	public String closeMonRequired;
	@Column(name = "DORMANT", precision = 1, scale = 0)
	public String dormant;
	@Column(name = "ENCHANCE_CCD", precision = 1, scale = 0)
	public String enchanceCcd;
	@Column(name = "FIRST_DEPOSIT", precision = 1, scale = 0)
	public String firstDeposit;
	@Column(name = "STANDARD_CDD", precision = 1, scale = 0)
	public String standardCdd;
	@Column(name = "FIRST_TIME", length = 1)
	public String firstTime;
	@Column(name = "[KEY]", length = 50)
	public String key;
	@Column(name = "INTEGRAL", length = 50)
	public String integral;
	@Column(name = "RESERVE1", length = 500)
	public String reserve1;
	@Column(name = "RESERVE2", length = 500)
	public String reserve2;
	@Column(name = "RESERVE3", length = 500)
	public String reserve3;
	@Column(name = "AGENT_ID", precision = 22, scale = 0)
	public BigDecimal agentId;
	@Column(name = "LAST_WEEK_BET_HIST", length = 500)
	public String lastWeekBetHist;
	@Column(name = "ADVERTISEMENT_CODE", precision = 22, scale = 0)
	public BigDecimal advertisementCode;
	@Column(name = "SUSPEND_PROMOTION", length = 1)
	public String suspendPromotion;
	@Column(name = "RECOMMEND_CODE", precision = 22, scale = 0)
	public BigDecimal recommendCode;
	@Column(name = "WHO_RECOMMEND_ME", precision = 22, scale = 0)
	public BigDecimal whoRecommendMe;
	
	@Column(name = "QQ")
//	public List<TCustomerLevels> customerLevels;
	public String qq;
	@Column(name = "WECHAT")
	public String wechat;
	@Column(name = "ID_CARD")
	public String idCard;
	@Column(name = "SCORE")
	public BigDecimal score ;
	@Column(name = "GAME_STATE", length = 500)
	public String gameState;
	@Column(name = "CUSTOMER_LEVEL", precision = 6, scale = 0 )
	public Integer customerLevel;
	@Column(name = "TOTAL_SCORE", precision = 6, scale = 0 )
	public Integer totalScore;
	@Fetch(FetchMode.JOIN)
	@OneToOne(optional=true,fetch=FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID")
	public com.tracy.demo.entity.TCustomersGameAccount customersGameAccount;
	
	@OneToOne(optional=true,fetch=FetchType.EAGER)
	@JoinColumn(name = "PARENT_ID", referencedColumnName = "CUSTOMER_ID",nullable = true,insertable=false,updatable=false)
	public com.tracy.demo.entity.TCustomers parentCustomer;//推荐人
	
	@Transient
	private List<String> roles;
	
	@Column(name = "RELEASED_BONUS", precision = 22, scale = 0)
	public BigDecimal releasedBonus;
	@Column(name = "RELEASING_BONUS", precision = 22, scale = 0)
	public BigDecimal releasingBonus;
	

	/** default constructor */
	public TCustomers() {
	}

	/** minimal constructor */
	public TCustomers(Integer customerId) {
		this.customerId = customerId;
	}

	/** full constructor */
	public TCustomers(Integer customerId, String address,
			Timestamp beforeLoginDate, String beforeLoginIp,
			Timestamp birthDate, String createdBy, Timestamp createdDate,
			Double credit, String currency, String customerType,
			Timestamp effectivityDate, String email, Timestamp expiryDate,
			String flag, String ipAddress, Timestamp lastLoginDate,
			String lastLoginIp, String loginName, Long loginTimes,
			BigDecimal parentId, String phone, String pwd,
			Timestamp pwdExpiryDate, String realName, String remarks,
			String sex, Timestamp lastUpdate, String lastUpdatedBy,
			String productId, String gameKey, String onlineMessenger,
			String pwdOld, Long code, String selfExclEnable,
			Timestamp selfExclDate, Double maxDepositAmt,
			String maxDepositPeriod, Double maxStakeAmt,
			String maxStakePeriod, Double maxNoOfBet,
			String maxNoOfBetPeriod, String title, String firstName,
			String lastName, String country, String building, String street,
			String town, String city, String postcode, String mobilephone,
			String agentcode, String refcode, String displaylanguage,
			String securityquestion1, String securityanswer1,
			String securityquestion2, String securityanswer2,
			String customerGroup, String house, String hearUs,
			String promotionalCode, String kycStatus, String document1,
			String document2, String document3, String customerPlevel,
			String accountStatus, String ageVerification,
			String fraudCustomer, String closeMonRequired, String dormant,
			String enchanceCcd, String firstDeposit, String standardCdd,
			String firstTime, String key, String integral, String reserve1,
			String reserve2, String reserve3, BigDecimal agentId,
			String lastWeekBetHist, BigDecimal advertisementCode,
			String suspendPromotion, BigDecimal recommendCode,
			BigDecimal whoRecommendMe) {
		this.customerId = customerId;
		this.address = address;
		this.beforeLoginDate = beforeLoginDate;
		this.beforeLoginIp = beforeLoginIp;
		this.birthDate = birthDate;
		this.createdBy = createdBy;
		//this.createdDate = createdDate;
		this.credit = credit;
		this.currency = currency;
		this.customerType = customerType;
		this.effectivityDate = effectivityDate;
		this.email = email;
		this.expiryDate = expiryDate;
		this.flag = flag;
		this.ipAddress = ipAddress;
		this.lastLoginDate = lastLoginDate;
		this.lastLoginIp = lastLoginIp;
		this.loginName = loginName;
		this.loginTimes = loginTimes;
		//this.parentId = parentId;
		this.phone = phone;
		this.pwd = pwd;
		this.pwdExpiryDate = pwdExpiryDate;
		this.realName = realName;
		this.remarks = remarks;
		this.sex = sex;
		this.lastUpdate = lastUpdate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.productId = productId;
		this.gameKey = gameKey;
		this.onlineMessenger = onlineMessenger;
		this.pwdOld = pwdOld;
		this.code = code;
		this.selfExclEnable = selfExclEnable;
		this.selfExclDate = selfExclDate;
		this.maxDepositAmt = maxDepositAmt;
		this.maxDepositPeriod = maxDepositPeriod;
		this.maxStakeAmt = maxStakeAmt;
		this.maxStakePeriod = maxStakePeriod;
		this.maxNoOfBet = maxNoOfBet;
		this.maxNoOfBetPeriod = maxNoOfBetPeriod;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.building = building;
		this.street = street;
		this.town = town;
		this.city = city;
		this.postcode = postcode;
		this.mobilephone = mobilephone;
		this.agentcode = agentcode;
		this.refcode = refcode;
		this.displaylanguage = displaylanguage;
		this.securityquestion1 = securityquestion1;
		this.securityanswer1 = securityanswer1;
		this.securityquestion2 = securityquestion2;
		this.securityanswer2 = securityanswer2;
		this.customerGroup = customerGroup;
		this.house = house;
		this.hearUs = hearUs;
		this.promotionalCode = promotionalCode;
		this.kycStatus = kycStatus;
		this.document1 = document1;
		this.document2 = document2;
		this.document3 = document3;
		this.customerPlevel = customerPlevel;
		this.accountStatus = accountStatus;
		this.ageVerification = ageVerification;
		this.fraudCustomer = fraudCustomer;
		this.closeMonRequired = closeMonRequired;
		this.dormant = dormant;
		this.enchanceCcd = enchanceCcd;
		this.firstDeposit = firstDeposit;
		this.standardCdd = standardCdd;
		this.firstTime = firstTime;
		this.key = key;
		this.integral = integral;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.agentId = agentId;
		this.lastWeekBetHist = lastWeekBetHist;
		this.advertisementCode = advertisementCode;
		this.suspendPromotion = suspendPromotion;
		this.recommendCode = recommendCode;
		this.whoRecommendMe = whoRecommendMe;
		//this.TRebateRequestses = TRebateRequestses;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getBeforeLoginDate() {
		return beforeLoginDate;
	}

	public void setBeforeLoginDate(Timestamp beforeLoginDate) {
		this.beforeLoginDate = beforeLoginDate;
	}

	public String getBeforeLoginIp() {
		return beforeLoginIp;
	}

	public void setBeforeLoginIp(String beforeLoginIp) {
		this.beforeLoginIp = beforeLoginIp;
	}

	public Timestamp getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Timestamp getEffectivityDate() {
		return effectivityDate;
	}

	public void setEffectivityDate(Timestamp effectivityDate) {
		this.effectivityDate = effectivityDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Timestamp getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Long getLoginTimes() {
		return loginTimes;
	}

	public void setLoginTimes(Long loginTimes) {
		this.loginTimes = loginTimes;
	}

	public BigDecimal getParentId() {
		return parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Timestamp getPwdExpiryDate() {
		return pwdExpiryDate;
	}

	public void setPwdExpiryDate(Timestamp pwdExpiryDate) {
		this.pwdExpiryDate = pwdExpiryDate;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getGameKey() {
		return gameKey;
	}

	public void setGameKey(String gameKey) {
		this.gameKey = gameKey;
	}

	public String getOnlineMessenger() {
		return onlineMessenger;
	}

	public void setOnlineMessenger(String onlineMessenger) {
		this.onlineMessenger = onlineMessenger;
	}

	public String getPwdOld() {
		return pwdOld;
	}

	public void setPwdOld(String pwdOld) {
		this.pwdOld = pwdOld;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getSelfExclEnable() {
		return selfExclEnable;
	}

	public void setSelfExclEnable(String selfExclEnable) {
		this.selfExclEnable = selfExclEnable;
	}

	public Timestamp getSelfExclDate() {
		return selfExclDate;
	}

	public void setSelfExclDate(Timestamp selfExclDate) {
		this.selfExclDate = selfExclDate;
	}

	public Double getMaxDepositAmt() {
		return maxDepositAmt;
	}

	public void setMaxDepositAmt(Double maxDepositAmt) {
		this.maxDepositAmt = maxDepositAmt;
	}

	public String getMaxDepositPeriod() {
		return maxDepositPeriod;
	}

	public void setMaxDepositPeriod(String maxDepositPeriod) {
		this.maxDepositPeriod = maxDepositPeriod;
	}

	public Double getMaxStakeAmt() {
		return maxStakeAmt;
	}

	public void setMaxStakeAmt(Double maxStakeAmt) {
		this.maxStakeAmt = maxStakeAmt;
	}

	public String getMaxStakePeriod() {
		return maxStakePeriod;
	}

	public void setMaxStakePeriod(String maxStakePeriod) {
		this.maxStakePeriod = maxStakePeriod;
	}

	public Double getMaxNoOfBet() {
		return maxNoOfBet;
	}

	public void setMaxNoOfBet(Double maxNoOfBet) {
		this.maxNoOfBet = maxNoOfBet;
	}

	public String getMaxNoOfBetPeriod() {
		return maxNoOfBetPeriod;
	}

	public void setMaxNoOfBetPeriod(String maxNoOfBetPeriod) {
		this.maxNoOfBetPeriod = maxNoOfBetPeriod;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getAgentcode() {
		return agentcode;
	}

	public void setAgentcode(String agentcode) {
		this.agentcode = agentcode;
	}

	public String getRefcode() {
		return refcode;
	}

	public void setRefcode(String refcode) {
		this.refcode = refcode;
	}

	public String getDisplaylanguage() {
		return displaylanguage;
	}

	public void setDisplaylanguage(String displaylanguage) {
		this.displaylanguage = displaylanguage;
	}

	public String getSecurityquestion1() {
		return securityquestion1;
	}

	public void setSecurityquestion1(String securityquestion1) {
		this.securityquestion1 = securityquestion1;
	}

	public String getSecurityanswer1() {
		return securityanswer1;
	}

	public void setSecurityanswer1(String securityanswer1) {
		this.securityanswer1 = securityanswer1;
	}

	public String getSecurityquestion2() {
		return securityquestion2;
	}

	public void setSecurityquestion2(String securityquestion2) {
		this.securityquestion2 = securityquestion2;
	}

	public String getSecurityanswer2() {
		return securityanswer2;
	}

	public void setSecurityanswer2(String securityanswer2) {
		this.securityanswer2 = securityanswer2;
	}

	public String getCustomerGroup() {
		return customerGroup;
	}

	public void setCustomerGroup(String customerGroup) {
		this.customerGroup = customerGroup;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getHearUs() {
		return hearUs;
	}

	public void setHearUs(String hearUs) {
		this.hearUs = hearUs;
	}

	public String getPromotionalCode() {
		return promotionalCode;
	}

	public void setPromotionalCode(String promotionalCode) {
		this.promotionalCode = promotionalCode;
	}

	public String getKycStatus() {
		return kycStatus;
	}

	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}

	public String getDocument1() {
		return document1;
	}

	public void setDocument1(String document1) {
		this.document1 = document1;
	}

	public String getDocument2() {
		return document2;
	}

	public void setDocument2(String document2) {
		this.document2 = document2;
	}

	public String getDocument3() {
		return document3;
	}

	public void setDocument3(String document3) {
		this.document3 = document3;
	}

	public String getCustomerPlevel() {
		return customerPlevel;
	}

	public void setCustomerPlevel(String customerPlevel) {
		this.customerPlevel = customerPlevel;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getAgeVerification() {
		return ageVerification;
	}

	public void setAgeVerification(String ageVerification) {
		this.ageVerification = ageVerification;
	}

	public String getFraudCustomer() {
		return fraudCustomer;
	}

	public void setFraudCustomer(String fraudCustomer) {
		this.fraudCustomer = fraudCustomer;
	}

	public String getCloseMonRequired() {
		return closeMonRequired;
	}

	public void setCloseMonRequired(String closeMonRequired) {
		this.closeMonRequired = closeMonRequired;
	}

	public String getDormant() {
		return dormant;
	}

	public void setDormant(String dormant) {
		this.dormant = dormant;
	}

	public String getEnchanceCcd() {
		return enchanceCcd;
	}

	public void setEnchanceCcd(String enchanceCcd) {
		this.enchanceCcd = enchanceCcd;
	}

	public String getFirstDeposit() {
		return firstDeposit;
	}

	public void setFirstDeposit(String firstDeposit) {
		this.firstDeposit = firstDeposit;
	}

	public String getStandardCdd() {
		return standardCdd;
	}

	public void setStandardCdd(String standardCdd) {
		this.standardCdd = standardCdd;
	}

	public String getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(String firstTime) {
		this.firstTime = firstTime;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getIntegral() {
		return integral;
	}

	public void setIntegral(String integral) {
		this.integral = integral;
	}

	public String getReserve1() {
		return reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getReserve2() {
		return reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	public String getReserve3() {
		return reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

	public BigDecimal getAgentId() {
		return agentId;
	}

	public void setAgentId(BigDecimal agentId) {
		this.agentId = agentId;
	}

	public String getLastWeekBetHist() {
		return lastWeekBetHist;
	}

	public void setLastWeekBetHist(String lastWeekBetHist) {
		this.lastWeekBetHist = lastWeekBetHist;
	}

	public BigDecimal getAdvertisementCode() {
		return advertisementCode;
	}

	public void setAdvertisementCode(BigDecimal advertisementCode) {
		this.advertisementCode = advertisementCode;
	}

	public String getSuspendPromotion() {
		return suspendPromotion;
	}

	public void setSuspendPromotion(String suspendPromotion) {
		this.suspendPromotion = suspendPromotion;
	}

	public BigDecimal getRecommendCode() {
		return recommendCode;
	}

	public void setRecommendCode(BigDecimal recommendCode) {
		this.recommendCode = recommendCode;
	}

	public BigDecimal getWhoRecommendMe() {
		return whoRecommendMe;
	}

	public void setWhoRecommendMe(BigDecimal whoRecommendMe) {
		this.whoRecommendMe = whoRecommendMe;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public String getGameState() {
		return gameState;
	}

	public void setGameState(String gameState) {
		this.gameState = gameState;
	}

	public Integer getCustomerLevel() {
		return customerLevel;
	}

	public void setCustomerLevel(Integer customerLevel) {
		this.customerLevel = customerLevel;
	}

	public Integer getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

	public com.tracy.demo.entity.TCustomersGameAccount getCustomersGameAccount() {
		return customersGameAccount;
	}

	public void setCustomersGameAccount(com.tracy.demo.entity.TCustomersGameAccount customersGameAccount) {
		this.customersGameAccount = customersGameAccount;
	}

	public com.tracy.demo.entity.TCustomers getParentCustomer() {
		return parentCustomer;
	}

	public void setParentCustomer(com.tracy.demo.entity.TCustomers parentCustomer) {
		this.parentCustomer = parentCustomer;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public BigDecimal getReleasedBonus() {
		return releasedBonus;
	}

	public void setReleasedBonus(BigDecimal releasedBonus) {
		this.releasedBonus = releasedBonus;
	}

	public BigDecimal getReleasingBonus() {
		return releasingBonus;
	}

	public void setReleasingBonus(BigDecimal releasingBonus) {
		this.releasingBonus = releasingBonus;
	}

	


	
	
}