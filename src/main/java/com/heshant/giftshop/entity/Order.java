package com.heshant.giftshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double subTotal;
    private Double totalAmount;
    private Double deliveryCharge;
    private LocalDateTime orderDate;
    private LocalDateTime createdAt;

    @Column(columnDefinition="TEXT")
    private String shippingAddressSnapshot;

    @ManyToOne @JoinColumn(name="users_id")
    private User user;

    @ManyToOne @JoinColumn(name="address_id")
    private Address address;

    @ManyToOne @JoinColumn(name="order_status_id")
    private OrderStatus orderStatus;

    @ManyToOne @JoinColumn(name="payment_method_id")
    private PaymentMethod paymentMethod;

    @PrePersist
    public void onCreate(){
        LocalDateTime time = LocalDateTime.now();
        this.createdAt=time;
    }

}
