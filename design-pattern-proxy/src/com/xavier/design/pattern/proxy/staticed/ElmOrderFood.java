package com.xavier.design.pattern.proxy.staticed;

/**
 * @author huxingming
 * @date 2018/10/23-下午1:56
 * @Description TODO
 */
public class ElmOrderFood implements OrderFood {

    private RealOrderFood realOrderFood;

    public ElmOrderFood(RealOrderFood realOrderFood) {
        this.realOrderFood = realOrderFood;
    }

    @Override
    public void choose() {
        System.out.println("满30减5活动进行中");
        realOrderFood.choose();
        System.out.println("骑手正在奔跑中");

    }

    @Override
    public void fillAddress() {
        System.out.println("请详细填写收货地址");
        realOrderFood.fillAddress();
        System.out.println("成功填写，正确识别地址");

    }
}
