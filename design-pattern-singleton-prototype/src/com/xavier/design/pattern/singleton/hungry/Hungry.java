package com.xavier.design.pattern.singleton.hungry;

/**
 * @author huxingming
 * @date 2018/10/22-上午8:04
 * @Description 饿汉式
 */
public class Hungry {


    private Hungry() {
    }

    private static final Hungry HUNGRY = new Hungry();

    public static Hungry getInstance() {
        return HUNGRY;
    }
}
