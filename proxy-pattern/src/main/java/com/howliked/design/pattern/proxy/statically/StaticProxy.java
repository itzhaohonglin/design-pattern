package com.howliked.design.pattern.proxy.statically;

import com.howliked.design.pattern.proxy.IPerson;

public class StaticProxy implements IPerson {
    private IPerson iPerson;

    public StaticProxy(IPerson iPerson) {
        this.iPerson = iPerson;
    }

    @Override
    public void request() {
        before();
        iPerson.request();
        after();
    }

    private void after() {
        System.out.println("after执行完毕...");
    }

    private void before() {
        System.out.println("before先执行...");
    }

}
