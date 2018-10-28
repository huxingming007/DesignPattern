package com.xavier.design.pattern.template.simple;

/**
 * @author huxingming
 * @date 2018/10/27-下午4:40
 * @Description TODO
 */
public class Test {

    public static void main(String[] args) {
        BankTemplate bankTemplate = new SaveMoneyFromBank();
        bankTemplate.transactBusiness();
        bankTemplate = new TakeMoneyFromBank();
        bankTemplate.transactBusiness();
    }
}
