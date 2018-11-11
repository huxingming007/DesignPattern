package com.xavier.design.pattern.adapter.complex.demo1;

/**
 * @author huxingming
 * @date 2018/11/7-上午9:32
 * @Description 220V转换成5v
 */
public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5v() {
        int i = super.output220v();
        return i / 44;

    }
}
