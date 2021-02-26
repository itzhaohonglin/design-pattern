package com.howliked.design.pattern.singleton;

/**
 * 静态内部类
 */
public class StaticInnerSingleton3 {
    private StaticInnerSingleton3() {
    }

    private static class StaticInnerSingletonHolder {
        private final static StaticInnerSingleton3 INSTANCE = new StaticInnerSingleton3();
    }

    public static StaticInnerSingleton3 getInstance() {
        return StaticInnerSingletonHolder.INSTANCE;
    }
}
