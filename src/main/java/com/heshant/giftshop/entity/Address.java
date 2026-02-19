package com.heshant.giftshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String addressLabel;
    private String recipientName;
    private String line1;
    private String line2;
    private String city;
    private Integer postalCode;
    private Boolean isDefault;

    @ManyToOne @JoinColumn(name="users_id")
    private User user;

    @ManyToOne @JoinColumn(name="district_id")
    private District district;
}

