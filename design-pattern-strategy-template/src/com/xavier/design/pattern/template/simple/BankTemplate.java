package com.xavier.design.pattern.template.simple;

/**
 * @author huxingming
 * @date 2018/10/27-下午4:33
 * @Description 去银行办理业务，第一步取号，第二步办理具体的业务，第三步评价。第一步和第三步的逻辑基本相同可以写在抽象类中
 */
public abstract class BankTemplate {


    public void transactBusiness() {
        takeNumber();
        transact();
        evaluate();
    }


    public void takeNumber() {
        System.out.println("第一步取号子");
    }


    // 具体业务：取钱业务、存钱业务、兑换外币业务等等
    public abstract void transact();


    public void evaluate() {

        System.out.println("最后一步：评价");
    }


}
