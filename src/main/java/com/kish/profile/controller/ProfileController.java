package com.kish.profile.controller;

import com.kish.profile.model.Profile;
import com.kish.profile.repository.ProfileRepository;
import com.kish.profile.request.ProfileRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public/v1")
@Slf4j
public class ProfileController {

    private final ProfileRepository profileRepository;

    public ProfileController(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @GetMapping(value = "/profile")
    public List<Profile> getAllProfile(){
        log.info("IN: ProfileController - getAllProfile");
        return  profileRepository.findAll();
    }

    @PostMapping(value = "/profile")
    public ResponseEntity<Void> saveProfile(@RequestBody ProfileRequest profileRequest){
        log.info("IN: ProfileController - saveProfile");

        profileRepository.save(new Profile(profileRequest));

        log.info("OUT: ProfileController - saveProfile");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
