package com.nil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDERED_MEDICINE")
public class OrderedMedicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderMedicineId;
	private Integer orderQuantity;
	private Float orderSubtotal;
	private String orderMedicineName;
	private Medicine medicine;
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
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	@Override
	public String toString() {
		return "OrderedMedicine [orderMedicineId=" + orderMedicineId + ", orderQuantity=" + orderQuantity
				+ ", orderSubtotal=" + orderSubtotal + ", orderMedicineName=" + orderMedicineName + ", medicine="
				+ medicine + "]";
	}
	
	
}
