package com.howliked.design.pattern.observer.scene;

public class RedisCacheObserver implements CacheObserver {
    @Override
    public boolean update(Long accountId) {
        System.out.println("接收到缓存清除请求.请求的accountId为:" + accountId);
        return true;
    }
}
