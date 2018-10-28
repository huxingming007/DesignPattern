package com.xavier.design.pattern.strategy.complex;

/**
 * @author huxingming
 * @date 2018/10/24-下午4:27
 * @Description TODO
 */
public class SuperVip implements CalPrice {
    @Override
    public Double calPrice(Double originPrice) {
        System.out.println("超级会员：八折");
        return originPrice * 0.8;


    }
}
