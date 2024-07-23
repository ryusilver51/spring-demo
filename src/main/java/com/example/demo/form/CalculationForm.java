package com.example.demo.form;

public class CalculationForm {

  // リクエストパラメータを受け取るFormクラスのフィールド変数の型は、慣れないうちはString型にすると都合が良い(テキストP.74から抜粋)
  // 1. 数値を送るフィールドに文字列を送ると例外メッセージが出てしまうため
  // 2. 数値を送る場合でもStringにして、必要なところでintに変換して扱う
  // 3. 数値に変換したい場合は変換用のgetterを用意する

  private String num1; // 慣れないうちはintではなくString型にする
  private String num2; // 慣れないうちはintではなくString型にする
  private String operator;

  public String getNum1() {
    return num1;
  }
  public void setNum1(String num1) {
    this.num1 = num1;
  }

  public String getNum2() {
    return num2;
  }

  public void setNum2(String num2) {
    this.num2 = num2;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  // num1をintに変換するメソッド
  public int getIntNum1() {
    return Integer.parseInt(num1);
  }

  // num2をintに変換するメソッド
  public int getIntNum2() {
    return Integer.parseInt(num2);
  }

  @Override
  public String toString() {
    return "CalculationForm [num1=" + num1 + ", num2=" + num2 + ", operator=" + operator + "]";
  }

}
