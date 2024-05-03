package com.circle.socialcircle.model;

import org.springframework.data.annotation.Id;

import com.circle.socialcircle.payload.request.user.SignupRequest;

public class User {
  @Id
  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private String password;

  public User() {
  }

  public User(String id, String firstName, String lastName, String email, String password) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
  }

  public User(String firstName, String lastName, String id) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
  }

  public User(String firstName, String lastName, String id, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.password = password;
  }

  public User(SignupRequest signupRequest) {
    this.email = signupRequest.getEmail();
    this.firstName = signupRequest.getFirstName();
    this.lastName = signupRequest.getLastName();
    this.password = signupRequest.getPassword();
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
