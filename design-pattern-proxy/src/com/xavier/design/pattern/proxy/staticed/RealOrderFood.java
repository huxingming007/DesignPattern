package com.xavier.design.pattern.proxy.staticed;

/**
 * @author huxingming
 * @date 2018/10/23-下午1:55
 * @Description TODO
 */
public class RealOrderFood implements OrderFood {
    @Override
    public void choose() {
        System.out.println("我要点一份肯德基");
    }

    @Override
    public void fillAddress() {
        System.out.println("上峰电商园");
    }
}
