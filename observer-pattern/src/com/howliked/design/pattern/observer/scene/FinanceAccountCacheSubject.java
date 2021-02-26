package com.howliked.design.pattern.observer.scene;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class FinanceAccountCacheSubject implements CacheSubject {
    private List<CacheObserver> cacheList = new ArrayList<>();

    @Override
    public void oneKeyClear(CacheObserver observer) {
        cacheList.add(observer);
    }

    public void changeNotify(Long accountId) {
        cacheList.forEach(x -> x.update(accountId));
    }
}
