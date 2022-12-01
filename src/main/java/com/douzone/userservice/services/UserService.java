package com.douzone.userservice.services;

import com.douzone.userservice.domain.TokenInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    public TokenInfo login(String username, String Password);
}
