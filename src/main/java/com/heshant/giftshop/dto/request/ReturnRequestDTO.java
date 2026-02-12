package com.heshant.giftshop.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReturnRequestDTO {
    private Integer orderId;
    private Integer userId;
    private String reason;
    private Double totalRefundAmount;
    private String status;
}
