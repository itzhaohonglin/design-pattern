package com.howliked.design.pattern.singleton;

public class LazySingleton2 {
    private static volatile LazySingleton2 INSTANCE = null;

    private LazySingleton2() {
    }

    public static /* synchronized */ LazySingleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton2();
                }
            }
        }
        return INSTANCE;
    }

}
