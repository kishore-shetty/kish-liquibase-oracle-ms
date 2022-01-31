package com.kish.profile.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProfileRequest {

    private String name;
    private String email;
    private String password;
    private String dob;
    private BigDecimal salary;
}
