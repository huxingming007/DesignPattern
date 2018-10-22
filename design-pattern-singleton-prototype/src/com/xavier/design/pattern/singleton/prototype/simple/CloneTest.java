package com.xavier.design.pattern.singleton.prototype.simple;

import java.lang.annotation.Target;

/**
 * @author huxingming
 * @date 2018/10/22-下午1:45
 * @Description 潜复制 ：复制以后cloneTarget与clone是不一样的  但是clone中的user对象还是用的是CloneTarget
 */
public class CloneTest {

    public static void main(String[] args) {
        CloneTarget cloneTarget = new CloneTarget();

        cloneTarget.setName("xavier");
        cloneTarget.setUser(new User());

        System.out.println(cloneTarget);
        System.out.println(cloneTarget.getUser());

        try {
            CloneTarget clone = (CloneTarget)cloneTarget.clone();
            System.out.println(clone);
            System.out.println(clone.getUser());
            System.out.println(clone.getName() == cloneTarget.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
