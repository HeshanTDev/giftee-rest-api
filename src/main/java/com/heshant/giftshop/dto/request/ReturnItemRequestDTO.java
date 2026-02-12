package com.heshant.giftshop.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReturnItemRequestDTO {
    private Integer productId;
    private Integer qty;
    private String conditionNote;
    private Integer returnId;
}
