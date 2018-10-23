package com.xavier.design.pattern.proxy.custom;

import java.lang.reflect.Method;

/**
 * @author huxingming
 * @date 2018/10/23-下午3:12
 * @Description TODO
 */
public class OrderFoodHandler implements MyInvocationHandler {

    private Object targetObject;


    public Object getProxyObject(Object targetObject) {
        this.targetObject = targetObject;
        return HxmProxy.newProxyInstance(new HxmClassLoader(), targetObject.getClass().getInterfaces(), this);

    }


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
