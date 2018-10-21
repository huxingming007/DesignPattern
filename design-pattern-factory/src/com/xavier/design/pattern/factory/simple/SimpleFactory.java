package com.xavier.design.pattern.factory.simple;

import com.xavier.design.pattern.factory.ApplePhone;
import com.xavier.design.pattern.factory.HuaWeiPhone;
import com.xavier.design.pattern.factory.Phone;
import com.xavier.design.pattern.factory.XiaoMiPhone;

/**
 * @author huxingming
 * @date 2018/10/21-下午12:28
 * @Description 简单工厂模式
 */
public class SimpleFactory {


    public static Phone getPhone(String name) {

        if ("苹果手机".equals(name)) {
            return new ApplePhone();
        } else if ("小米手机".equals(name)) {
            return new XiaoMiPhone();
        } else if ("华为手机".equals(name)) {
            return new HuaWeiPhone();
        }
        return null;
    }

}
