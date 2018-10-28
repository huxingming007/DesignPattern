package com.xavier.design.pattern.template.simple;

/**
 * @author huxingming
 * @date 2018/10/27-下午4:39
 * @Description TODO
 */
public class SaveMoneyFromBank extends BankTemplate {
    @Override
    public void transact() {
        System.out.println("我想办理存钱业务。。。。。");
    }
}
