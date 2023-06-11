package com.planittesting.cloud.jupiter.pom.objects;

public class PaymentDetails {
    private String cardType;

    private String cardNumber;

    public PaymentDetails() {}

    public PaymentDetails(String cardType, String cardNumber) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

}
