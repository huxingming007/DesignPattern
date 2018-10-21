package com.xavier.design.pattern.factory.func;

/**
 * @author huxingming
 * @date 2018/10/21-下午12:39
 * @Description TODO
 */
public class FuncFactoryTest {


    public static void main(String[] args) {

        // 缺点：用户需要配置哪个工厂
        FuncFactory funcFactory = new ApplyFactory();
        System.out.println(funcFactory.getPhone().getName());
    }
}
