package com.xavier.design.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author huxingming
 * @date 2018/10/22-上午9:28
 * @Description 注册式单例 spring单用的  放入容器中 下次取对象的时候  容器中取  就可以保证单例
 */
public class BeanFactory {

    private BeanFactory() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static synchronized Object getInstance(String className) {
        // 经过测试 发现是有线程安全问题的 初步怀疑是containsKey是线程不安全的 暂时的处理方式是加锁synchronized
        if (!ioc.containsKey(className)) {
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        } else {
            return ioc.get(className);
        }

    }

}
