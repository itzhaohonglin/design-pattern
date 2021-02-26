package com.howliked.design.pattern.factory.abstarct;

public class LogitechKeyboard implements Keyboard {
    @Override
    public Keyboard getKeyboard() {
        return new LogitechKeyboard();
    }
}
