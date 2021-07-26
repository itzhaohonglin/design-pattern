package com.howliked.design.pattern.chain.combat;

public abstract class Handler {
    protected Handler nextHandler;
    protected int level;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void doHandler(int level) {
        if (this.level == level) {
            handlerRequest();
        } else if (nextHandler != null) {
            nextHandler.doHandler(level);
        }
    }

    public abstract void handlerRequest();
}
