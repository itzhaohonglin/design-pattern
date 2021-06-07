package com.howliked.design.pattern.proxy.jdk.custom;

import com.howliked.design.pattern.proxy.IPerson;
import com.howliked.design.pattern.proxy.impl.ZhangSanPerson;

public class CustomProxyClient {
    public static void main(String[] args) {
        IPerson iPerson = new CustomTarget().getInstance(new ZhangSanPerson());
        iPerson.request();
    }
}
