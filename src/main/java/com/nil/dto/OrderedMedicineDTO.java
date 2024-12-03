package com.nil.dto;


public class OrderedMedicineDTO {

	private Integer orderMedicineId;
	private Integer orderQuantity;
	private Float orderSubtotal;
	private String orderMedicineName;
	private MedicineDTO medicine;
	public Integer getOrderMedicineId() {
		return orderMedicineId;
	}
	public void setOrderMedicineId(Integer orderMedicineId) {
		this.orderMedicineId = orderMedicineId;
	}
	public Integer getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(Integer orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public Float getOrderSubtotal() {
		return orderSubtotal;
	}
	public void setOrderSubtotal(Float orderSubtotal) {
		this.orderSubtotal = orderSubtotal;
	}
	public String getOrderMedicineName() {
		return orderMedicineName;
	}
	public void setOrderMedicineName(String orderMedicineName) {
		this.orderMedicineName = orderMedicineName;
	}
	public MedicineDTO getMedicine() {
		return medicine;
	}
	public void setMedicine(MedicineDTO medicine) {
		this.medicine = medicine;
	}
	@Override
	public String toString() {
		return "OrderedMedicineDTO [orderMedicineId=" + orderMedicineId + ", orderQuantity=" + orderQuantity
				+ ", orderSubtotal=" + orderSubtotal + ", orderMedicineName=" + orderMedicineName + ", medicine="
				+ medicine + "]";
	}
	
}
