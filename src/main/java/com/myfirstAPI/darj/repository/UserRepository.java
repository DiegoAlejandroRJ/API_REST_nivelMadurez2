package com.myfirstAPI.darj.repository;

import com.myfirstAPI.darj.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();
    User findById(Long idUser);
    User createUser (User user);
    Boolean updateUser(Long idUser, User user);
    Boolean deleteUser(Long idUser);
    Boolean deleteUser(Long idUser, User user);
}
