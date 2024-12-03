package com.nil.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDER")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private Double orderValueBeforeDiscount;
	private Double discountPercent;
	private Double orderValueAfterDiscount;
	private LocalDateTime deliveryDate;
	private Customer customer;
	@Enumerated(EnumType.STRING)
	@Column(name= "order_status")
	private OrderStatus orderStatus;
	private LocalDateTime orderDate;
	private String cancelReason;
	private List<OrderedMedicine> orderedMedicines;
	private CustomerAddress deliveryAddress;
	private Card card;
	@Enumerated(EnumType.STRING)
	private DeliveryStatus deliveryStatus;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Double getOrderValueBeforeDiscount() {
		return orderValueBeforeDiscount;
	}
	public void setOrderValueBeforeDiscount(Double orderValueBeforeDiscount) {
		this.orderValueBeforeDiscount = orderValueBeforeDiscount;
	}
	public Double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Double getOrderValueAfterDiscount() {
		return orderValueAfterDiscount;
	}
	public void setOrderValueAfterDiscount(Double orderValueAfterDiscount) {
		this.orderValueAfterDiscount = orderValueAfterDiscount;
	}
	public LocalDateTime getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public String getCancelReason() {
		return cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}
	public List<OrderedMedicine> getOrderedMedicines() {
		return orderedMedicines;
	}
	public void setOrderedMedicines(List<OrderedMedicine> orderedMedicines) {
		this.orderedMedicines = orderedMedicines;
	}
	public CustomerAddress getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(CustomerAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderValueBeforeDiscount=" + orderValueBeforeDiscount
				+ ", discountPercent=" + discountPercent + ", orderValueAfterDiscount=" + orderValueAfterDiscount
				+ ", deliveryDate=" + deliveryDate + ", customer=" + customer + ", orderStatus=" + orderStatus
				+ ", orderDate=" + orderDate + ", cancelReason=" + cancelReason + ", orderedMedicines="
				+ orderedMedicines + ", deliveryAddress=" + deliveryAddress + ", card=" + card + ", deliveryStatus="
				+ deliveryStatus + "]";
	}
	
	
}
