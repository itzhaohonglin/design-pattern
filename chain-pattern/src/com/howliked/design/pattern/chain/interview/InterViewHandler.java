package com.howliked.design.pattern.chain.interview;

public abstract class InterViewHandler {
    protected InterViewHandler nextHandler;

    public void setNextHandler(InterViewHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract boolean handlerRequest(Candidate candidate);
}
