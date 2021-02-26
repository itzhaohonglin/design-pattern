package com.howliked.design.pattern.state.runoob;

public class StateContext {
    private State state;

    public StateContext() {
        this.state = null;
    }

    public StateContext(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
