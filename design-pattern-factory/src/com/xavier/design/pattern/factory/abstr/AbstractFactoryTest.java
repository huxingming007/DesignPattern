package com.xavier.design.pattern.factory.abstr;

/**
 * @author huxingming
 * @date 2018/10/21-下午1:00
 * @Description TODO
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory();
        System.out.println(phoneFactory.getApplyPhone());

        ComputerFactory computerFactory = new ComputerFactory();
        System.out.println(computerFactory.getApplyComputer());

    }
}
