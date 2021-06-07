package com.howliked.design.pattern.proxy.jdk.custom;

import com.howliked.design.pattern.proxy.IPerson;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomTarget implements CustomInvocationHandler {
    private IPerson iPerson;

    public IPerson getInstance(IPerson iPerson) {
        this.iPerson = iPerson;
        Class<? extends IPerson> aClass = iPerson.getClass();
        return (IPerson) CustomProxy.newProxyInstance("$Proxy0", new CustomClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        try {
            Object result = method.invoke(iPerson, args);
            return result;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
