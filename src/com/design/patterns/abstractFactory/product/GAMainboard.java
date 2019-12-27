package com.design.patterns.abstractFactory.product;

/**
 * @Author: Jack Zhou
 * @Date: 2019/12/27 10:38 AM
 */
public class GAMainboard implements MainboardApi {

  private int cpuHoles = 0;

  public GAMainboard(int cpuHoles) {
    this.cpuHoles = cpuHoles;
  }

  @Override
  public void installCPU() {
    System.out.println("now in GAMainboard,cpuHoles=" + cpuHoles);
  }
}
