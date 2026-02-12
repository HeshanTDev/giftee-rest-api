package com.heshant.giftshop.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReturnItemResponseDTO {
    private Integer id;
    private Integer qty;
    private String conditionNote;
    private ProductResponseDTO product;
}
