package com.xavier.design.pattern.adapter.complex.demo1;

/**
 * @author huxingming
 * @date 2018/11/7-上午9:34
 * @Description TODO
 */
public class Client {

    public static void main(String[] args) {
        int i = new PowerAdapter().output5v();
        System.out.println(i);
    }
}
