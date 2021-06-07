package com.howliked.design.pattern.proxy.jdk;

import com.howliked.design.pattern.proxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK代理采用字节码重组，重新生成对象来替代原始对象，以达到动态代理的目的。
 * 1.获取被代理的对象,并获取它的所有接口,反射获取
 * 2.JDK动态代理类重新生成一个新的类,同时新的类要实现被代理类实现的所有接口
 * 3.动态生成Java代码,新加的业务逻辑方法由一定的逻辑代码调用
 * 4.编译新生成的Java代码.class文件
 * 5.重新加载到JVM中运行
 * 规范: 在Classpath下只要是$开头的.class文件,一般都是自动生成
 *
 * JDK动态代理原理：
 * 实现InvocationHandler接口，重写invoke()方法
 * 使用Proxy.newProxyInstance() 新建动态代理对象
 * 使用反射方式invoke() 调用方法
 *
 *
 * 使用方式:
 * 1.通过实现InvocationHandler接口创建自己的调用处理器；
 * 2.通过为Proxy类指定ClassLoader对象和一组interface来创建动态代理；
 * 3.通过反射机制获取动态代理类的构造函数，其唯一参数类型就是调用处理器接口类型；
 * 4.通过构造函数创建动态代理类实例，构造时调用处理器对象作为参数参入；
 *
 * JDK动态代理是面向接口的代理模式，如果被代理目标没有接口那么Spring也无能为力，Spring通过Java的反射机制生产被代理接口的新的匿名实现类，重写了其中AOP的增强方法。
 */
public class JdkProxy implements InvocationHandler {
    private IPerson person;

    public IPerson getInstance(IPerson iPerson) {
        this.person = iPerson;
        Class clz = iPerson.getClass();
        return (IPerson) Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(person, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("jdk proxy after().....");
    }

    private void before() {
        System.out.println("jdk proxy before().....");
    }
}
