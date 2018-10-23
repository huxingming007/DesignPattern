package com.xavier.design.pattern.proxy.custom;

import java.lang.reflect.Method;

/**
 * @author huxingming
 * @date 2018/10/23-下午3:11
 * @Description TODO
 */
public interface MyInvocationHandler {



    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
