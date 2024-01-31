package com.demo.project.user_registration_login.service.impl;

import com.demo.project.user_registration_login.entity.CustomerDetails;
import com.demo.project.user_registration_login.entity.User;
import com.demo.project.user_registration_login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Objects;

public class CustomerDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if(Objects.isNull(user)) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomerDetails(user);
    }
}
