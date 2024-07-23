package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.domain.User;
import com.example.demo.form.UserForm;
import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class SessionPersonalController {

  @Autowired
  private HttpSession session;

  @RequestMapping("")
  public String index() {
    return "session-personal-form";
  }

  @RequestMapping("/input-personal")
  public String inputPersonal(UserForm userForm, Model model) {
    User user = convertToUser(userForm);
    session.setAttribute("user", user);
    return "confirm-personal-info";
  }

  @RequestMapping("/to-register")
  public String toRegister() {
    return "register-personal-info";
  }

  // プライベートメソッド
  private User convertToUser(UserForm userForm) {
    return new User(userForm.getName(), userForm.getEmail(), convertGender(userForm.getGender()),
    userForm.getPassword());
  }

  private String convertGender(int gender) {
    if (gender == 1) {
      return "男性";
    } else {
      return "女性";
    }
  }

}
