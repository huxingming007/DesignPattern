package com.xavier.design.pattern.delegate;

/**
 * @author huxingming
 * @date 2018/11/7-上午8:46
 * @Description TODO
 */
public class TargetA implements ITarget {

    @Override
    public void doSomething(String role) {
        System.out.println("我是" + role + "，我在敲代码。。。。");

    }
}
