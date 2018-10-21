package com.xavier.design.pattern.factory.abstr;

import com.xavier.design.pattern.factory.ApplePhone;
import com.xavier.design.pattern.factory.Phone;
import com.xavier.design.pattern.factory.XiaoMiPhone;
import com.xavier.design.pattern.factory.func.HuaWeiFactory;

/**
 * @author huxingming
 * @date 2018/10/21-下午12:53
 * @Description TODO
 */
public class PhoneFactory extends AbstractPhoneFactory {
    @Override
    public Phone getApplyPhone() {
        return new ApplePhone();    }

    @Override
    public Phone getXiaoMiPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Phone getHuaWeiPhone() {
        return new HuaWeiFactory().getPhone();
    }

}
