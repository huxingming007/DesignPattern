package com.xavier.design.pattern.adapter.simple;

/**
 * @author huxingming
 * @date 2018/11/7-上午9:01
 * @Description TODO
 */
public class TargetImpl implements ITarget {
    @Override
    public void request() {
        System.out.println("我是目标对象实现类，正在服役状态下，请不要修改我。。。。。。。");
    }
}
