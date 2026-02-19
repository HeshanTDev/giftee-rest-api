package com.heshant.giftshop.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user_type")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 50,unique = true)
    private String name;

    public static UserType of(String name){
        UserType t = new UserType();
        t.name = name;
        return t;
    }

    public void changeTypeName(String newName){
        if(newName == null || newName.isBlank()){
            throw  new IllegalArgumentException("Name cannot be empty");
        }
        this.name = newName;
    }

}
