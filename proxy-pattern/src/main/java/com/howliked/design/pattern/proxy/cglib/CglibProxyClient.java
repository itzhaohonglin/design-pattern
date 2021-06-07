package com.howliked.design.pattern.proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 *
 */
public class CglibProxyClient {
    public static void main(String[] args) {
        //将Cglib代理类存储到磁盘中
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, CglibProxyClient.class.getResource("").getPath());
        TargetObject target = (TargetObject) new CglibProxy().getInstance(TargetObject.class);
        target.sayHi();
        target.sayHi2();
    }
}
