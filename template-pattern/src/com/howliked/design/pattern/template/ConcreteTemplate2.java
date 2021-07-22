package com.howliked.design.pattern.template;

public class ConcreteTemplate2 extends AbstractTemplate{
    @Override
    protected void operation1() {
        System.out.println("执行ConcreteTemplate2的operation1方法...");
    }

    @Override
    protected void operation2() {
        System.out.println("执行ConcreteTemplate2的operation2方法...");
    }

    @Override
    protected void operation3() {
        System.out.println("执行ConcreteTemplate2的operation3方法...");
    }
}
