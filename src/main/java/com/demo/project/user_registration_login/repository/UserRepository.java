package com.demo.project.user_registration_login.repository;

import com.demo.project.user_registration_login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select * from User u where u.email = ?1")
    User findByEmail(String email);
}
