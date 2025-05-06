package com.fastcampus;

public class KrwCalculator implements ICalculator {

  private final int price = 1;

  @Override
  public int plus(int a, int b) {
    a *= price;
    b *= price;
    return a + b;
  }

  @Override
  public int minus(int a, int b) {
    a *= price;
    b *= price;
    return a - b;
  }
}
