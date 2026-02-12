package com.heshant.giftshop.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ReturnResponseDTO {
    private Integer id;
    private String reason;
    private Double totalRefundAmount;
    private LocalDateTime createdAt;
    private String status;
    private OrderResponseDTO order;
    private UserResponseDTO user;
}