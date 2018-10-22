package com.xavier.design.pattern.singleton.test;

import com.xavier.design.pattern.singleton.lazy.LazyOne;

import java.util.concurrent.*;

/**
 * @author huxingming
 * @date 2018/10/22-上午8:43
 * @Description TODO
 */
public class ThreadSafeTest {


/*    public static void main(String[] args) {


        int count = 200;

        CountDownLatch countDownLatch = new CountDownLatch(count);

        for (int i = 0; i < count; i++) {

            new Thread(() -> {
                try {
                    countDownLatch.await();
                    // 制造一瞬间去获得lazyone的实例
                    System.out.println(LazyOne.getInstance());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }).start();
            countDownLatch.countDown();
        }
    }*/


    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(200);
        int count = 200;
        // 循环栅栏 await方法执行了count次后 会执行一次System.out.println（"开始一起执行"）
        // 为什么叫循环呢？ await方法执行了count次后  再执行await方法重新开始！
        CyclicBarrier cyclicBarrier = new CyclicBarrier(count, new Thread(() -> System.out.println("开始一起执行")));

        for (int i = 0; i < count; i++) {
            executorService.execute(() -> {
                try {
                    cyclicBarrier.await();
                    System.out.println(LazyOne.getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }
    }

}
