package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.form.CalculationForm;

@Controller
@RequestMapping("/calculation")
public class CalculationController {

  @RequestMapping("")
  public String index() {
    return "calculation-form";
  }

  @RequestMapping("/receive-calculation")
  public String receiveCalculation(CalculationForm calculationForm, Model model) {
    int result = 0;
    int num1 = calculationForm.getIntNum1();
    int num2 = calculationForm.getIntNum2();
    String operator = calculationForm.getOperator();

    if ("+".equals(operator)) {
      result = num1 + num2;
    } else if ("-".equals(operator)) {
      result = num1 - num2;
    } else if ("x".equals(operator)) {
      result = num1 * num2;
    } else if ("÷".equals(operator)) {
      result = num1 / num2;
    }

    model.addAttribute("num1", num1);
    model.addAttribute("num2", num2);
    model.addAttribute("operator", operator);
    model.addAttribute("result", result);
    return "result-calculation";
  }

}
