package com.xavier.design.pattern.factory;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author huxingming
 * @date 2018/10/21-下午12:24
 * @Description 不用工厂模式
 */
public class Main {

    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        System.out.println(new ApplePhone().getName());

        String str = new String("abcqwr");
        System.out.println(str.intern() == str);

        String str1 = new StringBuilder("sadafaf").append("adfdsfaf").toString();

        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("java").toString();
        System.out.println(str2.intern() == str2);

        Person person = new Person("luoxn28", 23);
        Class clazz = person.getClass();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String key = field.getName();
            PropertyDescriptor descriptor = new PropertyDescriptor(key, clazz);
            Method method = descriptor.getReadMethod();
            Object value = method.invoke(person);

            System.out.println(key + ":" + value);

        }
    }
}
