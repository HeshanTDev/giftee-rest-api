package com.heshant.giftshop.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDTO {

    @NotNull(message = "Address ID is required")
    @Positive(message = "Address ID must be valid")
    private Integer addressId;

    @NotNull(message = "Payment method ID is required")
    @Positive(message = "Payment method ID must be valid")
    private Integer paymentMethodId;

    @Size(max = 500, message = "Shipping address snapshot is too long")
    private String shippingAddressSnapshot;
}