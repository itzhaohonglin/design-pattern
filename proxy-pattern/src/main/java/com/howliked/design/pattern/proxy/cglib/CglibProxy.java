package com.howliked.design.pattern.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib动态代理是通过字节码底层继承要代理类来实现（如果被代理类被final关键字所修饰，那么抱歉会失败）。
 * 1.通过字节码增强技术动态的创建代理对象；
 * 2.代理的是代理对象的引用；
 *
 * Cglib动态代理原理：
 * 实现MethodInterceptor 接口，重写intercept()方法
 * 使用enhancer.create(); 新建动态代理对象
 * intercept()方法中，使用invokeSuper() 调用方法
 * （1）创建Enhancer实例
 * （2）通过setSuperclass方法来设置目标类
 * （3）通过setCallback 方法来设置拦截对象
 * （4）create方法生成Target的代理类，并返回代理类的实例
 * intercept()方法中，使用invokeSuper() 调用方法
 *
 * 原理层面：FastClass机制
 * Jdk动态代理的拦截对象是通过反射的机制来调用被拦截方法的，反射的效率比较低，所以cglib采用了FastClass的机制来实现对被拦截方法的调用。
 * FastClass机制就是对一个类的方法建立索引，通过索引来直接调用相应的方法。
 *
 * 什么是FastClass机制？
 * FastClass有两个方法getIndex()和invoke()。
 * getIndex()方法：根据入参（方法名+方法的描述符），对Test的每个方法建立索引，并返回。
 * invoke()方法：根据指定的索引，以ol为入参调用对象O的方法。这样就避免了反射调用，提高了效率。
 *
 * FastClass机制描述下，三个方法不能被动态代理
 * Object类中 equals()方法、hashcode()方法、getClass()方法。
 *
 * 问题：为什么cglib代理比jdk代理快？
 * Jdk动态代理的拦截对象是通过反射的机制来调用被拦截方法的，反射的效率比较低，所以cglib采用了FastClass的机制来实现对被拦截方法的调用。
 *
 * Cglib优缺点：
 * 优点：
 * 1.代理的类无需实现接口；
 * 2.执行速度相对JDK动态代理较高；
 * 缺点：
 * 1.字节码库需要进行更新以保证在新版java上能运行；
 * 2.动态创建代理对象的代价相对JDK动态代理较高；
 */
public class CglibProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        //相当于JDK中的Proxy类,是完成代理的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz); // 实参为父类/父接口字节码
        enhancer.setCallback(this);// 构建Cglib动态代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, args); // 传递过来的代理调用方法
        after();
        return result;
    }

    private void after() {
        System.out.println("cglib Proxy after....");
    }

    private void before() {
        System.out.println("cglib Proxy before....");
    }
}

