package com.demo.project.user_registration_login.service;

import com.demo.project.user_registration_login.entity.User;

import java.util.List;

public interface UserService {

    void saveUserDetails(User user);

    List<User> findAllUsers();
}
