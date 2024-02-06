package com.myfirstAPI.darj.repository.h2;

import com.myfirstAPI.darj.model.User;
import com.myfirstAPI.darj.repository.UserRepository;
import com.myfirstAPI.darj.repository.UserRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public abstract class UserRepositoryH2 implements UserRepository {

    @Autowired
    private UserRepositoryJpa userRepositoryJpa;

    @Override
    public List<User> getAllUsers() {
        return userRepositoryJpa.findAll();
    }

    @Override
    public User findById(Long idUser) {
        return userRepositoryJpa.findById(idUser).get();
    }

    @Override
    public User createUser(User user) {
        return userRepositoryJpa.save(user);
    }

    @Override
    public Boolean updateUser(Long idUser, User user) {
        User updatingUser = findById(idUser);
        if (updatingUser != null) {
            updatingUser.setName(user.getName());
            updatingUser.setLastName(user.getLastName());
            updatingUser.setCreate(user.getCreate());
            updatingUser.setUpdate(LocalDateTime.now());
            userRepositoryJpa.save(user);
            return true;
        } else {
            return false;
        }
    }


    @Override
    public Boolean deleteUser(Long idUser, User user) {
        User deletingUser = findById(idUser);
        if (deletingUser != null) {
            userRepositoryJpa.delete(user);
            return true;
        }
        return false;
    }

}
