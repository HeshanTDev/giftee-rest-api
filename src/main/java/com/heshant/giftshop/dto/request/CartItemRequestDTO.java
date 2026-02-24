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
public class CartItemRequestDTO {

    @NotNull(message = "Cart ID is required")
    @Positive(message = "Cart ID must be a valid ID")
    private Integer cartId;

    @NotNull(message = "Product ID is required")
    @Positive(message = "Product ID must be a valid ID")
    private Integer productId;

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "Quantity must be at least 1")
    @Max(value = 1000, message = "Quantity is too large")
    private Integer qty;
}