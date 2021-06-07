package com.howliked.design.pattern.proxy.statically;

import com.howliked.design.pattern.proxy.IPerson;
import com.howliked.design.pattern.proxy.impl.ZhangSanPerson;

public class StaticProxyClient {
    public static void main(String[] args) {
        IPerson iPerson = new StaticProxy(new ZhangSanPerson());
        iPerson.request();
    }
}
