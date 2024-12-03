package com.nil.dto;

import java.time.LocalDate;

import com.nil.entity.CardType;

public class CardDTO {

	private String cardId;
	private String nameOnCard;
	private String cvv;
	private LocalDate expiryDate;
	private CardType CardType;
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public CardType getCardType() {
		return CardType;
	}
	public void setCardType(CardType cardType) {
		CardType = cardType;
	}
	@Override
	public String toString() {
		return "CardDTO [cardId=" + cardId + ", nameOnCard=" + nameOnCard + ", cvv=" + cvv + ", expiryDate="
				+ expiryDate + ", CardType=" + CardType + "]";
	}
	
	
}
