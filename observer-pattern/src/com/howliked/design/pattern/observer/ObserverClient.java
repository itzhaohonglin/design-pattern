package com.howliked.design.pattern.observer;

public class ObserverClient {
    public static void main(String[] args) {
        // 创建主题（发布者）
        ConcreteSubject subject = new ConcreteSubject();
        // 创建观察者（订阅者）
        Observer observer = new ConcreteObserver();
        // 关联订阅
        subject.detach(observer);
        // 改变主题（发布者）状态，发送通知
        subject.change();
    }
}
