package com.xavier.design.pattern.factory.abstr;

import com.xavier.design.pattern.factory.Computer;

/**
 * @author huxingming
 * @date 2018/10/21-下午1:10
 * @Description TODO
 */
public abstract class AbstractComputerFactory {


    // 电脑产品
    public abstract Computer getApplyComputer();
}
