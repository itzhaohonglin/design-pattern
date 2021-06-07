package com.howliked.design.pattern.proxy.cglib;

public class TargetObject {
    public void sayHi() {
        System.out.println("targetObject 具体执行方法.....");
    }

    public void sayHi2(){
        System.out.println("targetObject2 具体执行方法.....");
    }
}
