package com.fastcampus;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello and welcome!");

    MarketApi marketApi = new MarketApi();
    DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
    dollarCalculator.init();

    Calculator calculator = new Calculator(dollarCalculator);

    System.out.println(calculator.plus(10, 10));
    System.out.println(calculator.minus(10, 5));
  }
}