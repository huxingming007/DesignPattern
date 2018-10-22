package com.xavier.design.pattern.singleton.multiton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author huxingming
 * @date 2018/10/22-上午11:26
 * @Description 多例模式  使用场景：操作多个数据库
 */
public class DataSource {


    private String name;

    // 私有构造
    private DataSource(String name) {
        this.name = name;
    }

    // 保存实例
    private static Map<String, DataSource> map = new ConcurrentHashMap<>();


    private static String[] nameArray = {"数据库1", "数据库2"};

    static {
        DataSource dataSource1 = new DataSource(nameArray[0]);
        DataSource dataSource2 = new DataSource(nameArray[2]);
        map.put(nameArray[0], dataSource1);
        map.put(nameArray[1], dataSource2);
    }

    public DataSource getInstance(String name) {
        return map.get(name);
    }
}
