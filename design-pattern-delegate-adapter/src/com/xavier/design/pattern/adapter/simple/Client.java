package com.xavier.design.pattern.adapter.simple;

/**
 * @author huxingming
 * @date 2018/11/7-上午9:16
 * @Description TODO
 */
public class Client {

    public static void main(String[] args) {
        ITarget iTarget = new TargetImpl();
        iTarget.request();
        iTarget = new Adapter();
        iTarget.request();
    }
}
