package com.xavier.design.pattern.proxy.staticed;

/**
 * @author huxingming
 * @date 2018/10/23-下午1:59
 * @Description TODO
 */
public class Test {


    public static void main(String[] args) {
        new ElmOrderFood(new RealOrderFood()).choose();
        new ElmOrderFood(new RealOrderFood()).fillAddress();
    }
}
