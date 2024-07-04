package com.ashdaker.rest.validationandexceptionhandling.repository;

import com.ashdaker.rest.validationandexceptionhandling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
