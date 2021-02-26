package com.howliked.design.pattern.factory.method;

public class FactoryMethodClient {
    public static void main(String[] args) {
        CoffeeMethodFactory coffeeMethodFactory = new LatteCoffeeMethodFactory();
        CoffeeStoreMethodFactory methodFactory = new CoffeeStoreMethodFactory(coffeeMethodFactory);
        methodFactory.orderCoffee();
    }
}
