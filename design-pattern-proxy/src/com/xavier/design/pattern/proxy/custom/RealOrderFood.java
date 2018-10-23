package com.xavier.design.pattern.proxy.custom;


/**
 * @author huxingming
 * @date 2018/10/23-下午2:06
 * @Description 真实对象 即目标对象
 */
public class RealOrderFood implements OrderFood {
    @Override
    public void  choose() {
        System.out.println("我要一份麦当劳");
    }

    @Override
    public void fillAddress() {
        System.out.println("上峰电商园");
    }
}
