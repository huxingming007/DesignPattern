package com.xavier.design.pattern.adapter.complex.demo2;

/**
 * @author huxingming
 * @date 2018/11/7-上午9:46
 * @Description TODO
 */
public class Power5VAdapter extends PowerAdapter {


    public Power5VAdapter(AC220 ac220) {
        super(ac220);
    }

    @Override
    public int output5V() {
        int i = super.output5V();
        return i / 44;
    }
}
