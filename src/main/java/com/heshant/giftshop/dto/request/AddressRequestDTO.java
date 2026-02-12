package com.heshant.giftshop.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequestDTO {
    private String addressLabel;
    private String recipientName;
    private String line1;
    private String line2;
    private String city;
    private Integer postalCode;
    private Boolean isDefault;
    private Integer userId;
    private Integer districtId;
}