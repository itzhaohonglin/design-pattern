package com.howliked.design.pattern.proxy.jdk.custom;

import java.lang.reflect.Method;

/**
 * 自定义动态生成源码、动态完成编译 {@link java.lang.reflect.InvocationHandler}
 */
public interface CustomInvocationHandler {
    /**
     * 调用代理方式
     *
     * @param proxy  被代理的对象
     * @param method 被代理的方法
     * @param args   方法参数
     * @return
     */
    Object invoke(Object proxy, Method method, Object[] args);
}
