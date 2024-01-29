package com.demo.project.user_registration_login.repository;

import com.demo.project.user_registration_login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
