package com.heshant.giftshop.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserStatusResponseDTO {
    private Integer id;
    private String name;
}

