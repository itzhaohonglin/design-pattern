package com.howliked.design.pattern.state.runoob;

public class StartState implements State{
    @Override
    public void doAction(StateContext context) {
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start state";
    }
}
