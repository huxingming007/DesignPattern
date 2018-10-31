package com.xavier.design.pattern.factory.abstr2;

/**
 * @author huxingming
 * @date 2018/10/31-上午11:12
 * @Description 产品等级1的实现类
 */
public class Creator2 extends AbstractCreator{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
