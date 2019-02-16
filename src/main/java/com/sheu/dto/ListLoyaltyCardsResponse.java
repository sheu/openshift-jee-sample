package com.sheu.dto;

import java.util.List;

public class ListLoyaltyCardsResponse {
    private ResponseHeader header;
    private List<LoyaltyCard> loyaltyCardList;

    public ResponseHeader getHeader() {
        return header;
    }

    public void setHeader(ResponseHeader header) {
        this.header = header;
    }

    public List<LoyaltyCard> getLoyaltyCardList() {
        return loyaltyCardList;
    }

    public void setLoyaltyCardList(List<LoyaltyCard> loyaltyCardList) {
        this.loyaltyCardList = loyaltyCardList;
    }
}
