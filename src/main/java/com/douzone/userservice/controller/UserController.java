package com.douzone.userservice.controller;

import com.douzone.userservice.domain.TokenInfo;
import com.douzone.userservice.domain.UserDto;
import com.douzone.userservice.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/user-service")
public class UserController {
    private final UserService userService;

    @PostMapping("/login")
    public TokenInfo login(@RequestBody UserDto userLoginRequestDto){
        String username = userLoginRequestDto.getId();
        String Password = userLoginRequestDto.getPw();
        TokenInfo tokenInfo = userService.login(username,Password);
        return  tokenInfo;
    }
}
