package com.xavier.design.pattern.proxy.cglib;


/**
 * @author huxingming
 * @date 2018/10/23-下午3:43
 * @Description TODO
 */
public class Test {
    public static void main(String[] args) {
        try {
            Python python = (Python) new LanguageProxy().getInstance(Python.class);
            python.learnPython();
            System.out.println(python.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


