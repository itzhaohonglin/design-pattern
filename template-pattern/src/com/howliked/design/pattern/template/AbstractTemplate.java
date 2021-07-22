package com.howliked.design.pattern.template;

public abstract class AbstractTemplate {

    public final void action() {
        operation1();
        operation2();
        operation3();
    }

    protected abstract void operation1();

    protected abstract void operation2();

    protected abstract void operation3();
}
