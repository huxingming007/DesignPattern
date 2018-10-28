package com.xavier.design.pattern.template.simple;

/**
 * @author huxingming
 * @date 2018/10/27-下午4:38
 * @Description TODO
 */
public class TakeMoneyFromBank extends BankTemplate {
    @Override
    public void transact() {
        System.out.println("我想办理取钱的业务。。。。");
    }
}
