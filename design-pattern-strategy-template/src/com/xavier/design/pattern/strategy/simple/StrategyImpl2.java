package com.xavier.design.pattern.strategy.simple;

/**
 * @author huxingming
 * @date 2018/10/24-下午3:59
 * @Description TODO
 */
public class StrategyImpl2 implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
