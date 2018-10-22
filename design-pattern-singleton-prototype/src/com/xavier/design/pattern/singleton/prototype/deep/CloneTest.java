package com.xavier.design.pattern.singleton.prototype.deep;

/**
 * @author huxingming
 * @date 2018/10/22-下午2:03
 * @Description 深复制  cloneTarget和clone不一样  并且 里面的people也不一样
 */
public class CloneTest {


    public static void main(String[] args) {
        CloneTarget cloneTarget = new CloneTarget();
        People people = new People("xavier");
        cloneTarget.setPeople(people);
        System.out.println(cloneTarget);
        System.out.println(cloneTarget.getPeople());
        try {
            CloneTarget clone = (CloneTarget)cloneTarget.clone();
            System.out.println(clone);
            System.out.println(clone.getPeople());
            System.out.println(clone.getPeople().getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
