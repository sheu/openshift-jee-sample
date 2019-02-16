package com.sheu.rest;

import com.sheu.dto.*;
import com.sheu.service.MemberService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public class MemberRESTService {
    @Inject
    private MemberService memberService;

    @POST
    @Path("register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RegisterResponse register(final RegisterRequest request) {
        return memberService.register(request);
    }
    @POST
    @Path("/add/payment/card")
    @Produces(MediaType.APPLICATION_JSON)
    public AddPaymentCardResponse addPaymentCard(final AddPaymentCardRequest request) {
        return memberService.addPaymentCard(request);
    }
    @GET
    @Path("list/loyalty/partner")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ListLoyaltyPartnersResponse listLoyaltyPartner(final ListLoyaltyPartnersRequest request) {
        return memberService.listLoyaltyPartner(request);
    }
    @GET
    @Path("list/loyalty/cards")
    public ListLoyaltyCardsResponse listLoyaltyCards(final ListLoyaltyCardsRequest request) {
        return memberService.listLoyaltyCards(request);
    }

    @POST
    @Path("/add/loyalty/card")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public AddLoyaltyCardResponse addLoyaltytCard(final AddLoyaltyCardRequest request) {
        return null;
    }
}
