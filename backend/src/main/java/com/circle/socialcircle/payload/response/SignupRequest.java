package com.circle.socialcircle.payload.response;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class SignupRequest {
  
  @NotBlank(message = "firstName is required")
  private String firstName;
  
  @NotBlank(message = "lastName is required")
  private String lastName;

  @Email(message = "Email validation failed - Invalid email format", regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
  @NotBlank(message = "Email field can not be blank")
  private String email;
  
  @NotBlank(message = "Length of password should be between 3 to 20")
  @Min(message = "Length of password should be between 3 to 20", value = 3)
  @Max(message = "Length of password should be between 3 to 20", value = 20)
  private String password;
  
  public SignupRequest() {
  }

  public SignupRequest(String firstName, String lastName, String email, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }  
}
