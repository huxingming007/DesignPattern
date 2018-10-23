package com.xavier.design.pattern.proxy.custom;

/**
 * @author huxingming
 * @date 2018/10/23-下午3:21
 * @Description TODO
 */
public class Test {


    public static void main(String[] args) {

        OrderFoodHandler orderFoodHandler = new OrderFoodHandler();

        OrderFood proxyObject = (OrderFood) orderFoodHandler.getProxyObject(new RealOrderFood());

        proxyObject.choose();
    }
}
