package com.heshant.giftshop.repository;

import com.heshant.giftshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
