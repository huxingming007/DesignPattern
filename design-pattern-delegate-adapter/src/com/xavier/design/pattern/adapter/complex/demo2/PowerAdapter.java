package com.xavier.design.pattern.adapter.complex.demo2;

/**
 * @author huxingming
 * @date 2018/11/7-上午9:40
 * @Description 空方法 等着子类去实现具体方法
 */
public abstract class PowerAdapter implements DCOutput {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        return ac220.output220v();
    }

    @Override
    public int output9V() {
        return ac220.output220v();
    }

    @Override
    public int output12V() {
        return ac220.output220v();
    }

    @Override
    public int output24V() {
        return ac220.output220v();
    }
}
