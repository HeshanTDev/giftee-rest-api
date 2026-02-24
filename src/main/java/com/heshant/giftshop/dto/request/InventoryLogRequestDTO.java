package com.heshant.giftshop.dto.request;

import jakarta.validation.constraints.*;

public record InventoryLogRequestDTO(

        @NotNull(message = "Product ID is required")
        @Positive(message = "Product ID must be valid")
        Integer productId,

        @NotNull(message = "Change amount is required")
        @Min(value = -100000, message = "Change amount too small")
        @Max(value = 100000, message = "Change amount too large")
        Integer changeAmount,

        @NotBlank(message = "Reason is required")
        @Size(min = 5, max = 300, message = "Reason must be between 5 and 300 characters")
        String reason

) {}