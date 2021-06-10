package com.howliked.design.pattern.singleton;

/**
 * 枚举单例:Effective Java
 * 既解决多线程问题,又解决反序列化问题
 */
public enum EnumSingleton4 {
    INSTANCE;

    public static EnumSingleton4 getInstance() {
        return EnumSingleton4.INSTANCE;
    }
}
