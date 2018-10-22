package com.xavier.design.pattern.singleton.prototype.deep;

import java.io.Serializable;

/**
 * @author huxingming
 * @date 2018/10/22-下午2:01
 * @Description TODO
 */
public class People implements Serializable {

    private String  name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
