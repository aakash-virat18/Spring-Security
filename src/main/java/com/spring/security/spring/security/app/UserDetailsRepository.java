package com.spring.security.spring.security.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserDetailsRepository extends JpaRepository<AuthUser, Integer> {
    AuthUser findByUserName(String userName);
}
