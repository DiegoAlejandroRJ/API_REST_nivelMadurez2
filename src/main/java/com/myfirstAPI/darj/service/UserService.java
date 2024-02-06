package com.myfirstAPI.darj.service;

import com.myfirstAPI.darj.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User findById(Long idUser);
    User createUser (User user);
    Boolean updateUser(Long idUser, User user);
    Boolean deleteUser(Long idUser);
    Boolean deleteUser(Long idUser, User user);
}
