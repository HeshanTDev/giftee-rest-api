package com.heshant.giftshop.entity;

import com.heshant.giftee.entity.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;

    private Integer currentStock;
    private Double price;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne @JoinColumn(name="category_id")
    private Category category;

    @ManyToOne @JoinColumn(name="product_status_id")
    private ProductStatus productStatus;

    @PrePersist
    public void onCreate(){
        LocalDateTime time = LocalDateTime.now();
        this.createdAt=time;
        this.updatedAt=time;
    }

    @PreUpdate
    public void onUpdate(){
        this.updatedAt=LocalDateTime.now();
    }

}

