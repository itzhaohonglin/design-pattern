package com.howliked.design.pattern.factory.abstarct;

public class DellComputer implements Computer {
    @Override
    public Keyboard getKeyBoard() {
        return new LogitechKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new LogitechMouse();
    }
}
