package com.xavier.design.pattern.strategy.simple;

/**
 * @author huxingming
 * @date 2018/10/24-下午4:00
 * @Description TODO
 */
public class StrategyImpl3 implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}
