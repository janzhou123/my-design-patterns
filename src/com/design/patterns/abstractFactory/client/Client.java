package com.design.patterns.abstractFactory.client;

import com.design.patterns.abstractFactory.factory.AbstractFactory;
import com.design.patterns.abstractFactory.factory.Schema1;
import com.design.patterns.abstractFactory.factory.Schema2;
import com.design.patterns.abstractFactory.factory.Schema3;

/**
 * 抽象工厂
 * @Author: Jack Zhou
 * @Date: 2019/12/27 11:05 AM
 */
public class Client {

  public static void main(String[] args) {
    ComputerEngineer engineer = new ComputerEngineer();
    
    AbstractFactory schema1 = new Schema1();
    engineer.makeComputer(schema1);

    AbstractFactory schema2 = new Schema2();
    engineer.makeComputer(schema2);

    AbstractFactory schema3 = new Schema3();
    engineer.makeComputer(schema3);
  }

}
