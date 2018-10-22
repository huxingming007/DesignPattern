package com.xavier.design.pattern.singleton.prototype.application;

/**
 * @author huxingming
 * @date 2018/10/22-下午2:40
 * @Description 原型模式的应用场景
 */
public class KeyPrototype implements Cloneable {


    //钥匙长度
    private float length;
    //钥匙厚度
    private float thick;
    //钥匙颜色
    private String color;

    //复制对象
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }
        return obj;
    }

    //获得长度
    public float getLength() {
        return length;
    }

    //设定长度
    public void setLength(float length) {
        this.length = length;
    }

    //获得厚度
    public float getThick() {
        return thick;
    }

    //设定厚度
    public void setThick(float thick) {
        this.thick = thick;
    }

    //获得颜色
    public String getColor() {
        return color;
    }

    //设定颜色
    public void setColor(String color) {
        this.color = color;
    }


    //铜钥匙类
    public static class CopperKey extends KeyPrototype {
        public CopperKey() {
            setColor("黄色");
        }
    }

    //铝钥匙类
    public class AluminiumKey extends KeyPrototype {
        public AluminiumKey() {
            setColor("银色");
        }
    }
}
