package com.nil.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Card {
	@Id
	private String cardId;
	private String nameOnCard;
	private String cvv;
	private LocalDate expiryDate;
	@Enumerated(EnumType.STRING)
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
		return "Card [cardId=" + cardId + ", nameOnCard=" + nameOnCard + ", cvv=" + cvv + ", expiryDate=" + expiryDate
				+ ", CardType=" + CardType + "]";
	}
	
	
}
