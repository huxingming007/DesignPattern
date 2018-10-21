package com.xavier.design.pattern.factory.func;

import com.xavier.design.pattern.factory.ApplePhone;
import com.xavier.design.pattern.factory.ApplyComputer;
import com.xavier.design.pattern.factory.Computer;
import com.xavier.design.pattern.factory.Phone;

/**
 * @author huxingming
 * @date 2018/10/21-下午12:37
 * @Description 苹果工厂生产跟苹果相关的产品，手机、电脑、mp3等等   好处是让工厂更加专业化
 */
public class ApplyFactory implements FuncFactory {
    @Override
    public Phone getPhone() {
        return new ApplePhone();
    }

    @Override
    public Computer getComputer() {
        return new ApplyComputer();
    }
}
