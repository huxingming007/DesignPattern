package com.xavier.design.pattern.strategy.complex;

/**
 * @author huxingming
 * @date 2018/10/24-下午4:27
 * @Description TODO
 */
public class Orgnic implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        System.out.println("普通会员：原价");
        return originPrice;
    }
}
