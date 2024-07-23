package com.example.demo.form;

public class UserForm {
  private String name;
  private String email;
  private int gender;
  private String password;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public int getGender() {
    return gender;
  }
  public void setGender(int gender) {
    this.gender = gender;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "UserFrom [name=" + name + ", email=" + email + ", gender=" + gender + ", password=" + password + "]";
  }
  
}