package com.douzone.userservice.domain;

import com.douzone.userservice.entity.User;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    @NotNull
    private String id;
    @NotNull
    private String pw;


    public User toEntity(){
        return User.builder().userId(id).password(pw).build();
    }

}
