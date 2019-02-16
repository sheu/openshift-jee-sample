package com.sheu.dto;

public class PaymentCard {
    private String number;
    private String ownerName;
    private String issuingOrganisation;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getIssuingOrganisation() {
        return issuingOrganisation;
    }

    public void setIssuingOrganisation(String issuingOrganisation) {
        this.issuingOrganisation = issuingOrganisation;
    }
}
