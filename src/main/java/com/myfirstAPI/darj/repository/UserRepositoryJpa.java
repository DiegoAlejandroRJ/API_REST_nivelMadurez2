package com.myfirstAPI.darj.repository;

import com.myfirstAPI.darj.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJpa extends JpaRepository<User, Long> {
}
