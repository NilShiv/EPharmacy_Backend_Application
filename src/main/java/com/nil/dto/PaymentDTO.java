package com.nil.dto;

import java.time.LocalDateTime;


public class PaymentDTO {

	private Integer paymentId;
	private LocalDateTime paymentTime;
	private Float amount;
	private CustomerDTO customer;
	private CardDTO card;
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public LocalDateTime getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(LocalDateTime paymentTime) {
		this.paymentTime = paymentTime;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	public CardDTO getCard() {
		return card;
	}
	public void setCard(CardDTO card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "PaymentDTO [paymentId=" + paymentId + ", paymentTime=" + paymentTime + ", amount=" + amount
				+ ", customer=" + customer + ", card=" + card + "]";
	}
	
	
}
