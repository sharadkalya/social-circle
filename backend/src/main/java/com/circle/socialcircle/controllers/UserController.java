package com.circle.socialcircle.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.circle.socialcircle.model.User;
import com.circle.socialcircle.payload.response.SignupRequest;
import com.circle.socialcircle.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

  @Autowired
  UserRepository userRepository;

  @GetMapping("user")
  public User getUser() {
    User userModel = new User("John", "Doe", "someUserId");
    return userModel;
  }

  @PostMapping("user")
  public ResponseEntity<?> postMethodName(@RequestBody SignupRequest signupRequest) {
    userRepository.save(new User(signupRequest));
    return ResponseEntity.ok(signupRequest);
  }
}
