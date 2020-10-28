package com.tracy.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * TCustomerLevelsId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class TCustomerLevelsId implements java.io.Serializable {

	// Fields

	private Integer customerId;
	private String levelId;

	// Constructors

	/** default constructor */
	public TCustomerLevelsId() {
	}

	/** full constructor */
	public TCustomerLevelsId(Integer customerId, String levelId) {
		this.customerId = customerId;
		this.levelId = levelId;
	}

	// Property accessors

	@Column(name = "CUSTOMER_ID", nullable = false, precision = 22, scale = 0)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "LEVEL_ID", nullable = false, length = 4)
	public String getLevelId() {
		return this.levelId;
	}

	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof com.tracy.demo.entity.TCustomerLevelsId))
			return false;
		com.tracy.demo.entity.TCustomerLevelsId castOther = (com.tracy.demo.entity.TCustomerLevelsId) other;

		return ((this.getCustomerId() == castOther.getCustomerId()) || (this
				.getCustomerId() != null && castOther.getCustomerId() != null && this
				.getCustomerId().equals(castOther.getCustomerId())))
				&& ((this.getLevelId() == castOther.getLevelId()) || (this
						.getLevelId() != null && castOther.getLevelId() != null && this
						.getLevelId().equals(castOther.getLevelId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCustomerId() == null ? 0 : this.getCustomerId()
						.hashCode());
		result = 37 * result
				+ (getLevelId() == null ? 0 : this.getLevelId().hashCode());
		return result;
	}

}