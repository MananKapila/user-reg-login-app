package com.demo.project.user_registration_login.controller;

import com.demo.project.user_registration_login.entity.User;
import com.demo.project.user_registration_login.repository.UserRepository;
import com.demo.project.user_registration_login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new User());
        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegister(User user){
        userService.saveUserDetails(user);
        return "register_success";
    }
}
