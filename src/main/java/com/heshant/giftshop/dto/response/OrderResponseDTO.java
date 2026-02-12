package com.heshant.giftshop.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class OrderResponseDTO {
    private Integer id;
    private Double subTotal;
    private Double totalAmount;
    private Double deliveryCharge;
    private LocalDateTime orderDate;
    private String shippingAddressSnapshot;
    private UserResponseDTO user;
    private AddressResponseDTO address;
    private OrderStatusResponseDTO orderStatus;
    private PaymentMethodResponseDTO paymentMethod;
}
