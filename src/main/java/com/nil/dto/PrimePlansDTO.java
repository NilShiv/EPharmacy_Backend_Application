package com.nil.dto;

public class PrimePlansDTO {

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
		return "PrimePlansDTO [planId=" + planId + ", planName=" + planName + ", PlanDescription=" + PlanDescription
				+ "]";
	}
	
	
}
