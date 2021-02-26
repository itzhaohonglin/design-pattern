package com.howliked.design.pattern.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("我收到了通知~~~!");
    }
}
