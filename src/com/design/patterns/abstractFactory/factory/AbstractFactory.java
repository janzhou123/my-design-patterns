package com.design.patterns.abstractFactory.factory;


import com.design.patterns.abstractFactory.product.CPUApi;
import com.design.patterns.abstractFactory.product.MainboardApi;

/**
 * @Author: Jack Zhou
 * @Date: 2019/12/27 11:00 AM
 */
public interface AbstractFactory {

  public CPUApi createCPUApi();

  public MainboardApi createMainboardApi();

}
