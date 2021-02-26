package com.howliked.design.pattern.factory.abstarct;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        Computer computer = new DellComputer();
        Keyboard keyBoard = computer.getKeyBoard();
        System.out.println(keyBoard);
    }
}
