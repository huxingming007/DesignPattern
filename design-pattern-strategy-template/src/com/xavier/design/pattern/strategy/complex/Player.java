package com.xavier.design.pattern.strategy.complex;

/**
 * @author huxingming
 * @date 2018/10/24-下午4:31
 * @Description TODO
 */
public class Player {

    // 此次的价格
    private Double amount;
    // 累计消费的价格
    private Double totalAmout;
    // 策略接口
    private CalPrice calPrice;

    public Player(Double totalAmout) {
        this.totalAmout = totalAmout;
    }

    //客户购买皮肤，就会增加它的总额
    public void buy(Double amount) {
        this.amount = amount;
        totalAmout += amount;
        /* 变化点，我们将策略的制定转移给了策略工厂，将这部分责任分离出去 */
        calPrice = CalPriceFactory.getCalPrice(this);
    }

    public Double getLastAmout(){

        return calPrice.calPrice(amount);
    }

    public Double getTotalAmout() {
        return totalAmout;
    }

}
