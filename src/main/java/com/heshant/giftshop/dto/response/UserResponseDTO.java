package com.heshant.giftshop.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private UserTypeResponseDTO userType;
    private UserStatusResponseDTO userStatus;
}
