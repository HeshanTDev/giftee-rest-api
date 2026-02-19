package com.heshant.giftshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="return_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReturnItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer qty;
    private String conditionNote;

    @ManyToOne @JoinColumn(name="returns_id")
    private Return returns;

    @ManyToOne @JoinColumn(name="product_id")
    private Product product;
}

