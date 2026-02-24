package com.heshant.giftshop.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReturnRequestDTO {
    @NotNull(message = "Order ID is required")
    @Positive(message = "Order ID must be a valid ID")
    private Integer orderId;

    @NotNull(message = "User ID is required")
    @Positive(message = "User ID must be a valid ID")
    private Integer userId;

    @NotBlank(message = "Refund reason is required")
    @Size(min = 10, max = 500, message = "Reason must be between 10 and 500 characters")
    private String reason;

    @NotNull(message = "Refund amount is required")
    @DecimalMin(value = "0.01", message = "Refund amount must be greater than 0")
    @Digits(integer = 10, fraction = 2, message = "Invalid refund amount format")
    private BigDecimal totalRefundAmount;

    @NotBlank(message = "Refund status is required")
    @Pattern(
            regexp = "PENDING|APPROVED|REJECTED|COMPLETED",
            message = "Status must be PENDING, APPROVED, REJECTED, or COMPLETED"
    )
    private String status;
}
