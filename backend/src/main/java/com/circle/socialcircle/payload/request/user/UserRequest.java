package com.circle.socialcircle.payload.request.user;

import jakarta.validation.constraints.NotBlank;

public class UserRequest {

  @NotBlank(message = "Email can not be empty")
  private String email;

  public UserRequest() {
  }

  public UserRequest(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
