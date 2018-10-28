package com.xavier.design.pattern.strategy.simple;

/**
 * @author huxingming
 * @date 2018/10/24-下午4:03
 * @Description TODO
 */
public class Test {

    public static void main(String[] args) {

        // 用户自己选择策略
        StrategyImpl1 strategyImpl1 = new StrategyImpl1();
        Context context = new Context(strategyImpl1);
        System.out.println(context.executeStrategy(1, 1));
    }
}
