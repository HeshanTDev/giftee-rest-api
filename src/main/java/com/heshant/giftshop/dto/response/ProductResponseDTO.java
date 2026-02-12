package com.heshant.giftshop.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponseDTO {
    private Integer id;
    private String name;
    private String description;
    private Integer currentStock;
    private Double price;
    private CategoryResponseDTO category;
    private ProductStatusResponseDTO productStatus;
}
