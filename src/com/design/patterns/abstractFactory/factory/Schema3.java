package com.design.patterns.abstractFactory.factory;


import com.design.patterns.abstractFactory.product.AMDCPU;
import com.design.patterns.abstractFactory.product.CPUApi;
import com.design.patterns.abstractFactory.product.IntelCPU;
import com.design.patterns.abstractFactory.product.MSIMainboard;
import com.design.patterns.abstractFactory.product.MainboardApi;

/**
 * @Author: Jack Zhou
 * @Date: 2019/12/27 11:03 AM
 */
public class Schema3 implements AbstractFactory {

  @Override
  public CPUApi createCPUApi() {
    return new IntelCPU(1156);
  }

  @Override
  public MainboardApi createMainboardApi() {
    return new MSIMainboard(939);
  }
}
