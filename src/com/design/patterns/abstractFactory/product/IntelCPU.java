package com.design.patterns.abstractFactory.product;

/**
 * @Author: Jack Zhou
 * @Date: 2019/12/26 3:45 PM
 */
public class IntelCPU implements CPUApi {
 private int pins=0;

 public IntelCPU(int pins){
   this.pins = pins;
 }

  @Override
  public void calculate() {
    System.out.println("now in Intel CPU,pins="+pins);
  }
}
