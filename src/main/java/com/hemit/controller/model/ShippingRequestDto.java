package com.hemit.controller.model;

public class ShippingRequestDto {
    public String orderId;
    public int nbProducts;

    public ShippingRequestDto(String orderId, int nbProducts) {
        this.orderId = orderId;
        this.nbProducts = nbProducts;
    }
}
