package com.howliked.design.pattern.prototype;

/**
 * 单例对象防止被克隆返回它自己的对象
 */
public class SingletonPrototype implements Cloneable {
    private static volatile SingletonPrototype INSTANCE = null;

    private SingletonPrototype() {
    }

    public static SingletonPrototype getInstance() {
        if (INSTANCE == null) {
            synchronized (INSTANCE) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonPrototype();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
