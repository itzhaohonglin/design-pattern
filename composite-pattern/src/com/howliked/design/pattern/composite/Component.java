package com.howliked.design.pattern.composite;

public abstract class Component {

    public void add(Component component) {
        throw new UnsupportedOperationException("不支持add操作");
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException("不支持add操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持add操作");
    }
}
