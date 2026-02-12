package com.heshant.giftshop.dto.response;

import lombok.Builder;
import lombok.Data;

// Response only (client does not create user types)
@Data
@Builder
public class UserTypeResponseDTO {
    private Integer id;
    private String name;
}

