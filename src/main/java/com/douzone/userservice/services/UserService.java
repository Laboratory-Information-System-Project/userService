package com.douzone.userservice.services;

import com.douzone.userservice.domain.TokenInfo;



public interface UserService {
    public TokenInfo login(String username, String Password);
}
