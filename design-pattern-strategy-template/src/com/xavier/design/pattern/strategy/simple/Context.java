package com.xavier.design.pattern.strategy.simple;

/**
 * @author huxingming
 * @date 2018/10/24-下午4:02
 * @Description 策略上下文
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {

        return strategy.doOperation(a, b);
    }
}
