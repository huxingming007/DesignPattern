package com.xavier.design.pattern.strategy.enumtest;


/**
 * @author huxingming
 * @date 2018/11/1-上午11:23
 * @Description 策略枚举模式
 */
public enum Calculator {


    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    };

    private String value;

    private Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public abstract int exec(int a, int b);
}
