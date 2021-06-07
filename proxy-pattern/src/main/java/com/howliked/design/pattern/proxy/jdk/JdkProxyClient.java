package com.howliked.design.pattern.proxy.jdk;

import com.howliked.design.pattern.proxy.IPerson;
import com.howliked.design.pattern.proxy.impl.ZhangSanPerson;

public class JdkProxyClient {
    public static void main(String[] args) {
        IPerson iPerson = new JdkProxy().getInstance(new ZhangSanPerson());
        iPerson.request();
    }
}
