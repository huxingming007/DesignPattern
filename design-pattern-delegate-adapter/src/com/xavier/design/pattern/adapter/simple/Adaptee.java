package com.xavier.design.pattern.adapter.simple;

/**
 * @author huxingming
 * @date 2018/11/7-上午9:03
 * @Description 源角色:也是在服役状态下的，如果为了套用适配器模式，新建一个源角色，也是没毛病的
 */
public class Adaptee {

    // 原有的业务逻辑
    public void dosomething() {
        System.out.println("我是服役状态下的源角色。。。。。。我正在正常运营中");

    }
}
