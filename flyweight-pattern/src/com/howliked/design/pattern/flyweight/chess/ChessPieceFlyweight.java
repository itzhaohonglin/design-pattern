package com.howliked.design.pattern.flyweight.chess;

public class ChessPieceFlyweight implements ChessPiece {
    private String color;

    public ChessPieceFlyweight(String color) {
        this.color = color;
    }

    @Override
    public void put(int x, int y) {
        System.out.println(String.format("在(%d,%s)位置放了一个%s子", x, y, color));
    }
}
