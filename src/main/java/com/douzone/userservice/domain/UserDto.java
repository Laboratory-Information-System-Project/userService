package com.douzone.userservice.domain;

import com.douzone.userservice.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    private String id;
    private String pw;

    public User toEntity(){
        return User.builder().userId(id).Password(pw).build();
    }

}
