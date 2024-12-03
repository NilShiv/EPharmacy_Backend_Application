package com.nil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRIME_PLANS")
public class PrimePlans {
	@Id
	private Integer planId;
	private String planName;
	private String PlanDescription;
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanDescription() {
		return PlanDescription;
	}
	public void setPlanDescription(String planDescription) {
		PlanDescription = planDescription;
	}
	@Override
	public String toString() {
		return "PrimePlans [planId=" + planId + ", planName=" + planName + ", PlanDescription=" + PlanDescription + "]";
	}
	
}
