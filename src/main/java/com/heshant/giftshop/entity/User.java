package com.heshant.giftshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name="user_type_id")
    private UserType userType;

    @ManyToOne
    @JoinColumn(name="user_status_id")
    private UserStatus userStatus;

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
