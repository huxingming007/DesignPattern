package com.xavier.design.pattern.strategy.complex;

/**
 * @author huxingming
 * @date 2018/10/24-下午4:36
 * @Description TODO
 */
public class CalPriceFactory {


    public CalPriceFactory() {

    }

    public static CalPrice getCalPrice(Player player) {

        if (player.getTotalAmout() > 30000) {//3000则改为金牌会员计算方式
            return new GoldVip();
        } else if (player.getTotalAmout() > 20000) {//类似
            return new SuperVip();
        } else if (player.getTotalAmout() > 10000) {//类似
            return new Vip();
        } else {
            return new Orgnic();
        }

    }
}
