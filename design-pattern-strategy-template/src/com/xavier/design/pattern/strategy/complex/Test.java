package com.xavier.design.pattern.strategy.complex;

/**
 * @author huxingming
 * @date 2018/10/24-下午4:40
 * @Description TODO
 */
public class Test {

    public static void main(String[] args) {

        Player player = new Player(3000d);
        player.buy(1000d);
        Double lastAmout = player.getLastAmout();
        System.out.println(lastAmout);
    }
}
