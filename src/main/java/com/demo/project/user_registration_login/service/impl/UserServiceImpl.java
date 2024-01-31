package com.demo.project.user_registration_login.service.impl;

import com.demo.project.user_registration_login.entity.User;
import com.demo.project.user_registration_login.repository.UserRepository;
import com.demo.project.user_registration_login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public void saveUserDetails(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        System.out.println("User data added successfully");
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
