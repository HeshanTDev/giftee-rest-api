package com.heshant.giftshop.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDTO {
    private Integer userId;
    private Integer addressId;
    private Integer orderStatusId;
    private Integer paymentMethodId;
    private Double subTotal;
    private Double totalAmount;
    private Double deliveryCharge;
    private String shippingAddressSnapshot;
}
