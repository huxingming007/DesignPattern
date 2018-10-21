package com.xavier.design.pattern.factory.func;

import com.xavier.design.pattern.factory.Computer;
import com.xavier.design.pattern.factory.Phone;
import com.xavier.design.pattern.factory.XiaoMiPhone;

/**
 * @author huxingming
 * @date 2018/10/21-下午12:39
 * @Description TODO
 */
public class XiaoMiFactory implements FuncFactory {
    @Override
    public Phone getPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Computer getComputer() {
        return null;
    }
}
