package com.xavier.design.pattern.factory.abstr2;

/**
 * @author huxingming
 * @date 2018/10/31-上午11:02
 * @Description TODO
 */
public abstract class AbstractProductA {

    public void shareMethod(){
        System.out.println("产品a的共同方法。。。");
    }

    // 不一样的方法
    public abstract void doSomething();
}
