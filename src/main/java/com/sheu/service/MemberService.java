package com.sheu.service;

import com.sheu.dto.RegisterRequest;
import com.sheu.dto.RegisterResponse;
import com.sheu.dto.*;

public interface MemberService {
    RegisterResponse register(RegisterRequest request);
    AddPaymentCardResponse addPaymentCard(AddPaymentCardRequest request);
    AddLoyaltyCardResponse addLoyaltytCard(AddLoyaltyCardRequest request);
    ListLoyaltyPartnersResponse listLoyaltyPartner(ListLoyaltyPartnersRequest request);
    ListLoyaltyCardsResponse listLoyaltyCards(ListLoyaltyCardsRequest request);
}
