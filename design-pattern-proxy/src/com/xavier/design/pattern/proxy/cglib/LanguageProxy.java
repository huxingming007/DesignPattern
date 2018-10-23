package com.xavier.design.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author huxingming
 * @date 2018/10/23-下午3:42
 * @Description TODO
 */
public class LanguageProxy implements MethodInterceptor {

    public Object getInstance(Class clazz) throws Exception {
        //通过反射机制给他实例化
        Enhancer enhancer = new Enhancer();
        //注入父类，告诉CGLib，生成的子类需要继承那个类
        enhancer.setSuperclass(clazz);
        //添加监听
        enhancer.setCallback(this);
        //1.生成源代码
        //2.编译成.class文件
        //3.加载到JVM中，返回对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("-----------------学习开始-----------------");
        System.out.println("我正在学习Python");
        System.out.println("我正在学习大数据");
        //JDK的动态代理是通过接口来强制转换的
        //生成以后的代理对象是可以强制转化为我们的接口

        //CGLib的动态代理是通过生成一个被代理对象的子类，然后重写了父类的方法
        //生成的对象，可以强制为被代理的对象（也就是用户自己写的类）
        //子类引用赋值给父类


        //此处的 Object o对象是CGLib帮我么new出来子类的对象
        //Java OOP,在new子类的同时，实际上默认先调用了我们super()的方法
        //new了父类的同时，必须向new出来父类，这也就是间接持有了我们父类的引用
        //我们改变了子类对象的某些属性，是可以间接的操作父类的属性的
        methodProxy.invokeSuper(o, objects);
        System.out.println("-----------------学习结束-----------------");
        return o;
    }
}
