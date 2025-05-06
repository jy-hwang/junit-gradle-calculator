package com.fastcampus;

public class DollarCalculator implements ICalculator {

  private int price = 1;

  private final MarketApi marketApi;

  public DollarCalculator(MarketApi marketApi) {
    this.marketApi = marketApi;
  }

  public void init(){
    this.price = marketApi.connect();
  }

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
