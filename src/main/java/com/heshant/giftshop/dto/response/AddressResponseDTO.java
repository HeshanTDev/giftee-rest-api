package com.heshant.giftshop.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressResponseDTO {
    private Integer id;
    private String addressLabel;
    private String recipientName;
    private String line1;
    private String line2;
    private String city;
    private Integer postalCode;
    private Boolean isDefault;
    private DistrictResponseDTO district;
}
