package com.nil.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMER_CART")
public class CustomerCart {

	@Id
	@Column(name = "CART_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartId;
	private Integer customerId;
	private Integer medicineId;
	private Integer quantity;
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(Integer medicineId) {
		this.medicineId = medicineId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "CustomerCart [cartId=" + cartId + ", customerId=" + customerId + ", medicineId=" + medicineId
				+ ", quantity=" + quantity + "]";
	}
	
}
