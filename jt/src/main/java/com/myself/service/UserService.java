package com.myself.service;

import com.myself.pojo.User;

import java.util.List;

/**
 * Create By   on
 */
public interface UserService {

    List<User> findAll();

    void addUser(User user);
}
