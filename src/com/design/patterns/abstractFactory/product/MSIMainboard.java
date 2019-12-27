package com.design.patterns.abstractFactory.product;

/**
 * @Author: Jack Zhou
 * @Date: 2019/12/27 10:40 AM
 */
public class MSIMainboard implements MainboardApi {

  private int cpuHoles = 0;

  /**
   * 构造方法，传入CPU插槽的孔数
   *
   * @param cpuHoles CPU插槽的孔数
   */
  public MSIMainboard(int cpuHoles) {
    this.cpuHoles = cpuHoles;
  }

  public void installCPU() {
    System.out.println("now in MSIMainboard,cpuHoles=" + cpuHoles);
  }
}
