package com.xavier.design.pattern.singleton.test;

import com.xavier.design.pattern.singleton.lazy.LazyOne;
import com.xavier.design.pattern.singleton.multiton.DataSource;
import com.xavier.design.pattern.singleton.register.BeanFactory;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author huxingming
 * @date 2018/10/22-上午9:33
 * @Description TODO
 */
public class BeanFactoryTest {


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
                    System.out.println(BeanFactory.getInstance("com.xavier.design.pattern.singleton.test.Pojo"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
