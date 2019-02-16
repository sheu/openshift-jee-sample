package com.sheu.dto;

public class LoyaltyCard {
    private String number;
    private String nameOnCard;
    private int points;
    private int monetaryValue;
    private String currency;
    private long expiryDate;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getMonetaryValue() {
        return monetaryValue;
    }

    public void setMonetaryValue(int monetaryValue) {
        this.monetaryValue = monetaryValue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(long expiryDate) {
        this.expiryDate = expiryDate;
    }
}
