package com.heshant.giftshop.entity;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user_status")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false,length = 50,unique = true)
    private String name;

    public static UserStatus of(String name){
        UserStatus s = new UserStatus();
        s.name = name;
        return s;
    }

    public void changeStatusName(String newName){
        if(newName == null || newName.isBlank()){
            throw  new IllegalArgumentException("Name cannot be empty");
        }
        this.name = newName;
    }

}
