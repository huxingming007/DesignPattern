package com.xavier.design.pattern.singleton.prototype.simple;

/**
 * @author huxingming
 * @date 2018/10/22-下午1:43
 * @Description TODO
 */
public class CloneTarget implements Cloneable{

    private String name;

    private User user;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public User getUser() {
        return user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
