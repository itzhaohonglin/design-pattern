package com.howliked.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        // 添加观察者（订阅者）
        observerList.add(o);
    }

    @Override
    public void detach(Observer o) {
        // 删除观察者（订阅者）
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        // 通知所有观察者（订阅者）
        for (Observer o : observerList) {
            o.update();
        }
    }

    /**
     * 通知方法
     */
    public void change() {
        this.notifyObservers();
    }
}
