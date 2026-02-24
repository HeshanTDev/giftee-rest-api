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
public class ReturnItemRequestDTO {

    @NotNull(message = "Product ID is required")
    @Positive(message = "Product ID must be a valid ID")
    private Integer productId;

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "Quantity must be at least 1")
    private Integer qty;

    @NotBlank(message = "Condition note is required")
    @Size(min = 5, max = 500, message = "Condition note must be between 5 and 500 characters")
    private String conditionNote;

    @NotNull(message = "Return ID is required")
    @Positive(message = "Return ID must be a valid ID")
    private Integer returnId;
}