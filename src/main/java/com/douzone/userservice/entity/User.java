package com.douzone.userservice.entity;


import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "user")
public class User implements UserDetails {
    @Id
    @Column(name = "user_id",updatable = false,unique = true)
    private String userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_code")
    private Department department;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "user_name",nullable = false)
    private String name;

    @Column(name = "user_phonenumber",nullable = false)
    private String userPhoneNumber;

    @Column(name = "user_address",nullable = false)
    private String userAddress;

    @Column(name = "authority",nullable = false)
    private String authority;

    @Column(name = "user_email",nullable = false)
    private String userEmail;

    @Column(name = "join_dt",nullable = false)
    private LocalDate joinDt;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<GrantedAuthority> Author = new ArrayList<GrantedAuthority>();
        Author.add(new SimpleGrantedAuthority(authority));
        return Author;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
