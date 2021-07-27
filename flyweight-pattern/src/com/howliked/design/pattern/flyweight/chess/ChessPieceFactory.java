package com.howliked.design.pattern.flyweight.chess;

public class ChessPieceFactory {
    private static final ChessPiece WHITE = new ChessPieceFlyweight("白");
    private static final ChessPiece BLACK = new ChessPieceFlyweight("黑");

    public static ChessPiece getChessPiece(String color) {
        if ("白".equals(color)) {
            return WHITE;
        } else if ("黑".equals(color)) {
            return BLACK;
        }
        return null;
    }
}
