package com.xavier.design.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author huxingming
 * @date 2018/10/23-下午2:07
 * @Description
 * 1、实现接口InvocationHandler
 * 2、java.lang.reflect.Proxy的支持
 */
public class OrderFoodHandler implements InvocationHandler {


    private Object targetObject;

    public Object getProxyObject(Object targetObject) {
        this.targetObject = targetObject;
        // 参数：类的加载器（和目标对象一样的加载器）、目标类的所有接口、InvocationHandler子类
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), this);
    }

    /*
     *
     * @description:
     *
     * @param: [proxy, method, args]
     * @return: java.lang.Object
     * @author: huxingming
     * @date: 2018/10/23 下午2:22
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // agrs 参数
        if (null != args) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
        System.out.println("满30减5活动进行中");
        // 调用目标方法targetObject：目标类  args：参数  invoke:返回值
        Object invoke = method.invoke(targetObject, args);
        System.out.println("骑手正在奔跑中");
        System.out.println(invoke);
        return invoke;
    }
}
