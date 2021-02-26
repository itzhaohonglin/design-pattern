package com.howliked.design.pattern.factory.simple;

public class Client {
    public static void main(String[] args) {
        CoffeeStoreSimple coffeeStoreSimple = new CoffeeStoreSimple();
        coffeeStoreSimple.orderCoffer("american");
    }
}
