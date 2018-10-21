package com.xavier.design.pattern.factory.func;

import com.xavier.design.pattern.factory.Computer;
import com.xavier.design.pattern.factory.HuaWeiPhone;
import com.xavier.design.pattern.factory.Phone;

/**
 * @author huxingming
 * @date 2018/10/21-下午12:38
 * @Description TODO
 */
public class HuaWeiFactory implements FuncFactory {
    @Override
    public Phone getPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Computer getComputer() {
        return null;
    }
}
