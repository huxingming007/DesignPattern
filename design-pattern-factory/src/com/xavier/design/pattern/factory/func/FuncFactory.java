package com.xavier.design.pattern.factory.func;

import com.xavier.design.pattern.factory.Computer;
import com.xavier.design.pattern.factory.Phone;

/**
 * @author huxingming
 * @date 2018/10/21-下午12:37
 * @Description 工厂方法模式
 */
public interface FuncFactory {

    Phone getPhone();

    Computer getComputer();
}
