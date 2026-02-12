package com.heshant.giftshop.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartItemResponseDTO {
    private Integer id;
    private Integer qty;
    private ProductResponseDTO product;
}
