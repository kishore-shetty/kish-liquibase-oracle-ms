package com.kish.profile.model;

import com.kish.profile.request.ProfileRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String dob;
    private BigDecimal salary;
    private Boolean activeFlag;
    private LocalDateTime updatedDateTime;

    public Profile(ProfileRequest profileRequest) {
        this.name = profileRequest.getName();
        this.email = profileRequest.getEmail();
        this.password = profileRequest.getPassword();
        this.dob = profileRequest.getDob();
        this.salary = profileRequest.getSalary();
        this.activeFlag = true;
        this.updatedDateTime = LocalDateTime.now();
    }
}

