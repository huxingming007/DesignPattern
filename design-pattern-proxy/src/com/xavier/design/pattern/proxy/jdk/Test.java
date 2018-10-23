package com.xavier.design.pattern.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author huxingming
 * @date 2018/10/23-下午2:17
 * @Description
 */
public class Test {

    public static void main(String[] args) throws Exception {
        OrderFoodHandler orderFoodHandler = new OrderFoodHandler();
        // 生成代理对象
        OrderFood proxyObject = (OrderFood)orderFoodHandler.getProxyObject(new RealOrderFood());
        proxyObject.choose("test");
        proxyObject.fillAddress();
        System.out.println(proxyObject.getClass());

        //通过反编译工具可以查看源代码  生成$Proxy0.class
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{OrderFood.class});
        FileOutputStream os = new FileOutputStream("/Users/huxingming/Desktop/$Proxy0.class");
        os.write(bytes);
        os.close();

    }
}

