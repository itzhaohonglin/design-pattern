package com.howliked.design.pattern.factory.abstarct;

public class LogitechMouse implements Mouse {
    @Override
    public Mouse getMouse() {
        return new LogitechMouse();
    }
}
