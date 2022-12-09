package com.douzone.userservice.domain;

import com.douzone.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class TokenInfo {
    private String grantType;
    private String accessToken;
//    private String refreshToken;
    private String auth;
    private String name;
    private String userId;

    public User toEntity(){
        return User.builder().authority(auth).name(name).build();
    }

}
