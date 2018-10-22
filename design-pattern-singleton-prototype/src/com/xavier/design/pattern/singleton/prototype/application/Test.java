package com.xavier.design.pattern.singleton.prototype.application;

/**
 * @author huxingming
 * @date 2018/10/22-下午2:43
 * @Description 原型模式的应用场景:生成铝钥匙的代价最小
 */
public class Test {


    public static void main(String[] argv) {
        KeyPrototype copperKey = new KeyPrototype.CopperKey();
        copperKey.setLength(3.1f);
        copperKey.setThick(0.5f);
        //下面进行配钥匙:铜->铝
        KeyPrototype aluminiumKey = (KeyPrototype) copperKey.clone();
        aluminiumKey.setColor("银色");
        System.out.println("铜钥匙的颜色：" + copperKey.getColor());
        System.out.println("铝钥匙的颜色：" + aluminiumKey.getColor());
        System.out.println("铝钥匙：" + aluminiumKey.getLength());
        System.out.println("铝钥匙：" + aluminiumKey.getThick());
    }
}
