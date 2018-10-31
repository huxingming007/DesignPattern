package com.xavier.design.pattern.factory.abstr2;

/**
 * @author huxingming
 * @date 2018/10/31-上午11:16
 * @Description 设计模式之禅例子  抽象工厂模板
 */
public class Test {

    public static void main(String[] args) {

        AbstractCreator abstractCreator = new Creator1();

        AbstractProductA productA1 = abstractCreator.createProductA();
        AbstractProductB productB1 = abstractCreator.createProductB();


        abstractCreator = new Creator2();

        AbstractProductA productA2 = abstractCreator.createProductA();
        AbstractProductB productB2 = abstractCreator.createProductB();

        productA1.doSomething();
        productA2.doSomething();
        productB1.doSomething();
        productB2.doSomething();

    }
}
