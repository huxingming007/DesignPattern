package com.xavier.design.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huxingming
 * @date 2018/11/7-上午8:44
 * @Description TODO
 */
public class Leader implements ITarget {


    private static Map<String, ITarget> map = new HashMap<>();

    static {
        map.put("程序员", new TargetA());
        map.put("产品经理", new TargetB());
    }

    @Override
    public void doSomething(String role) {

        map.get(role).doSomething(role);

    }

}
