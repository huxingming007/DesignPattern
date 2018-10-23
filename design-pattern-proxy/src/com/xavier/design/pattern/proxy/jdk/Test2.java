package com.xavier.design.pattern.proxy.jdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author huxingming
 * @date 2018/10/23-下午2:42
 * @Description TODO
 */
public class Test2 {

    public static void main(String[] args) {
        try {
            Method method = Class.forName("com.xavier.design.pattern.proxy.jdk.OrderFood").getMethod("choose", Class.forName("java.lang.String"));
            System.out.println(method.getName());
            OrderFood orderFood = new RealOrderFood();
            Object res = method.invoke(orderFood, "hhhhhhaaaaaaa");
            System.out.println(res);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
