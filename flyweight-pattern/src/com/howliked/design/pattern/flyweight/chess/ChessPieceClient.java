package com.howliked.design.pattern.flyweight.chess;

public class ChessPieceClient {
    public static void main(String[] args) {
        ChessPiece p1 = ChessPieceFactory.getChessPiece("白");
        p1.put(3, 5);
        ChessPiece p2 = ChessPieceFactory.getChessPiece("黑");
        p2.put(4, 6);
    }
}
