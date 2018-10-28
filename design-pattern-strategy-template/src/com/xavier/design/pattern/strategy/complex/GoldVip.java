package com.xavier.design.pattern.strategy.complex;

/**
 * @author huxingming
 * @date 2018/10/24-下午4:27
 * @Description TODO
 */
public class GoldVip implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        System.out.println("金牌会员：七折");
        return originPrice * 0.7;

    }
}
