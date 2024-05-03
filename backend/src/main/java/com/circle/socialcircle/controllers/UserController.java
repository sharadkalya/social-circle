package com.circle.socialcircle.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.circle.socialcircle.model.User;
import com.circle.socialcircle.payload.request.user.SignupRequest;
import com.circle.socialcircle.payload.response.ErrorResponse;
import com.circle.socialcircle.repository.UserRepository;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
    return new User("John", "Doe", "someUserId");
  }

  @PostMapping("user")
  public ResponseEntity<?> postMethodName(@Valid @RequestBody SignupRequest signupRequest) {
    if (userRepository.existsByEmail(signupRequest.getEmail())) {
      return ResponseEntity
          .badRequest()
          .body(new ErrorResponse(("Error: Email is already in use!")));
    }
    userRepository.save(new User(signupRequest));
    return ResponseEntity.ok(signupRequest);
  }
}
