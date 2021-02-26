package com.howliked.design.pattern.state.runoob;

public class StateClient {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext();
        StartState state = new StartState();
        state.doAction(stateContext);
        System.out.println(state);
    }
}
