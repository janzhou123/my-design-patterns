package com.design.patterns.abstractFactory.product;

/**
 * @Author: Jack Zhou
 * @Date: 2019/12/27 10:34 AM
 */
public class AMDCPU implements CPUApi {

  private int pins = 0;

  public AMDCPU(int pins) {
    this.pins = pins;
  }

  @Override
  public void calculate() {
    System.out.println("now in AMDCPU CPU,pins="+pins);

  }
}
