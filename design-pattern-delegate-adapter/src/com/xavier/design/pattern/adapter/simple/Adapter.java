package com.xavier.design.pattern.adapter.simple;

/**
 * @author huxingming
 * @date 2018/11/7-上午9:06
 * @Description 适配器类
 */
public class Adapter extends Adaptee implements ITarget {


    @Override
    public void request() {
        super.dosomething();

    }
}
