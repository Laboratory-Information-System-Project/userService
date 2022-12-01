package com.douzone.userservice.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @Column(name = "department_code",updatable = false)
    private String departmentCode;

    @Column(name = "department_name",nullable = false)
    private String departmentName;

    @Column(name = "department_location",nullable = false)
    private String departmentLocation;

    @Column(name = "department_phone_number",nullable = false)
    private String departmentPhoneNumber;
}
