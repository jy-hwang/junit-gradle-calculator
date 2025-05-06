package com.fastcampus;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello and welcome!");

    Calculator calculator = new Calculator(new KrwCalculator());

    System.out.println(calculator.plus(10, 10));
    System.out.println(calculator.minus(10, 5));
  }
}