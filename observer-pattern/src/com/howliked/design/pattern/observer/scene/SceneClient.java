package com.howliked.design.pattern.observer.scene;

public class SceneClient {
    public static void main(String[] args) {
        CacheObserver cacheObserver = new RedisCacheObserver();
        CacheSubject cacheSubject = new FinanceAccountCacheSubject();
        cacheSubject.oneKeyClear(cacheObserver);
        cacheObserver.update(1L);
    }
}
