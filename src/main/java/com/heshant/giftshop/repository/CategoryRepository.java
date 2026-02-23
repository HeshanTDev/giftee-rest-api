package com.heshant.giftshop.repository;

import com.heshant.giftshop.entity.Category;
import com.heshant.giftshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Calendar;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
