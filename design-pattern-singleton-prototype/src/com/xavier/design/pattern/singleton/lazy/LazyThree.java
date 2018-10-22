package com.xavier.design.pattern.singleton.lazy;

/**
 * @author huxingming
 * @date 2018/10/22-上午8:23
 * @Description 利用内部类的方式：只有在用到的时候才会初始化LazyHolder类，
 * 避免了饿汉式的内存浪费  又避免了饱含式的性能问题
 * 内部类一定是要在方法调用之前初始化  避免了线程安全问题
 */
public class LazyThree {


    private boolean initialized = false;

    private LazyThree() {
        // 防止单例被破坏 有可能被无聊的人通过反射的方式拿到私有的构造方法
        synchronized (LazyThree.class) {
            if (initialized == false) {
                initialized = !initialized;
            } else {
                throw new RuntimeException("单例被破坏");
            }
        }

    }

    // 加上final 防止这个方法被重写
    public static final LazyThree getInstance() {

        return LazyHolder.lazyThree;
    }

    private static class LazyHolder {

        private static final LazyThree lazyThree = new LazyThree();
    }
}
