package com.xavier.design.pattern.factory.abstr;

import com.xavier.design.pattern.factory.ApplyComputer;
import com.xavier.design.pattern.factory.Computer;

/**
 * @author huxingming
 * @date 2018/10/21-下午1:06
 * @Description TODO
 */
public class ComputerFactory extends AbstractComputerFactory {

    @Override
    public Computer getApplyComputer() {
        return new ApplyComputer();
    }
}
