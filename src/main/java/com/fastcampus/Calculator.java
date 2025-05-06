package com.fastcampus;

public class Calculator {

  private final ICalculator iCalculator;

  public Calculator(ICalculator iCalculator) {
    this.iCalculator = iCalculator;
  }

  public int plus(int x, int y) {
    return this.iCalculator.plus(x, y);
  }

  public int minus(int x, int y) {
    return this.iCalculator.minus(x, y);
  }
}
