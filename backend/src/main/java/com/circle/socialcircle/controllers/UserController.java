package com.circle.socialcircle.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.circle.socialcircle.model.User;
import com.circle.socialcircle.payload.request.user.SignupRequest;
import com.circle.socialcircle.payload.response.ErrorResponse;
import com.circle.socialcircle.repository.UserRepository;

import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {

  @Autowired
  UserRepository userRepository;

  @GetMapping("users")
  public List<User> getUsers() {
    List<User> userList = userRepository.findAll();
    return userList;
  }

  @GetMapping("user")
  public List<User> getUser(@RequestParam String email) {
      List<User> userList = userRepository.findByEmail(email);
      return userList;
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
