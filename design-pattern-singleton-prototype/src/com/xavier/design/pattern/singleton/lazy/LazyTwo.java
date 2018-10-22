package com.xavier.design.pattern.singleton.lazy;

/**
 * @author huxingming
 * @date 2018/10/22-上午8:11
 * @Description 双重检查锁的方式  其实是不被推荐的  会报这个错误
 * SonarLint: Remove this dangerous instance of double-checked locking. [+2 locations] more... (⌘F1)
 */
public class LazyTwo {


    private LazyTwo() {

    }

    private static LazyTwo lazyTwo;


    public static LazyTwo getInstance() {


        if (null == lazyTwo) {
            synchronized (LazyTwo.class) {
                if (null == lazyTwo) {
                    lazyTwo = new LazyTwo();
                }
            }
        }
        return lazyTwo;
    }

}
