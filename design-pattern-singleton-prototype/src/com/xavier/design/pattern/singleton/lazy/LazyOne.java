package com.xavier.design.pattern.singleton.lazy;

/**
 * @author huxingming
 * @date 2018/10/22-上午8:08
 * @Description 懒汉式:有线程安全问题
 */
public class LazyOne {


    private LazyOne() {

    }

    private static LazyOne lazyOne;

    public static LazyOne getInstance() {

        if (null == lazyOne) {
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }

}
