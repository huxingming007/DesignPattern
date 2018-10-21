package com.xavier.design.pattern.factory.abstr;

import com.xavier.design.pattern.factory.Computer;
import com.xavier.design.pattern.factory.Phone;

/**
 * @author huxingming
 * @date 2018/10/21-下午12:48
 * @Description 抽象工厂：最常用，spring中应用广泛
 */
public abstract class AbstractPhoneFactory {


    //还可以加入公共的逻辑 方便管理TODO


    // 手机产品
    public abstract Phone getApplyPhone();

    public abstract Phone getXiaoMiPhone();

    public abstract Phone getHuaWeiPhone();



}
