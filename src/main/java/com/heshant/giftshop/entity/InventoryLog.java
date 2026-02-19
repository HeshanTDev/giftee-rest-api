package com.heshant.giftshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="invetory_log")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer changeAmount;

    @Enumerated(EnumType.STRING)
    private Reason reason;

    private LocalDateTime createdAt;

    @ManyToOne @JoinColumn(name="product_id")
    private Product product;

    public enum Reason { sale, restock, returns, damage }

    @PrePersist
    public void onCreate(){
        LocalDateTime time = LocalDateTime.now();
        this.createdAt=time;
    }

}
