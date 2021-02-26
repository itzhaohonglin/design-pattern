package com.howliked.design.pattern.singleton;

/**
 * 饿汉式:类加载时即先创建出来
 * 缺点:如果当前类不用,刚造成资源浪费
 */
public class HungrySingleton1 {
    private static HungrySingleton1 INSTANCE = new HungrySingleton1();

    private HungrySingleton1() {
    }

    public static HungrySingleton1 getInstance() {
        return INSTANCE;
    }
}
