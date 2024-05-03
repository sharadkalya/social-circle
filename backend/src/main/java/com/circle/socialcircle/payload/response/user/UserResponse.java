package com.circle.socialcircle.payload.response.user;

public class UserResponse {

  private String id;

  private String firstName;

  private String lastName;

  private String email;

  public UserResponse(String firstName, String lastName, String email, String id) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
