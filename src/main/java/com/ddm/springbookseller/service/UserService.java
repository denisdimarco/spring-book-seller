package com.ddm.springbookseller.service;

import com.ddm.springbookseller.model.User;

import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
