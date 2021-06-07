package com.howliked.design.pattern.proxy.impl;

import com.howliked.design.pattern.proxy.IPerson;

public class ZhangSanPerson implements IPerson {
    @Override
    public void request() {
        System.out.println("zhangsan执行方法....");
    }

}
