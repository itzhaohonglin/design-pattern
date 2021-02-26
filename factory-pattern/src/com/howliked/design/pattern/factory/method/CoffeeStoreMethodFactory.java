package com.howliked.design.pattern.factory.method;

import com.howliked.design.pattern.factory.Coffee;

public class CoffeeStoreMethodFactory {
    private CoffeeMethodFactory coffeeMethodFactory;

    public CoffeeStoreMethodFactory(CoffeeMethodFactory coffeeMethodFactory) {
        this.coffeeMethodFactory = coffeeMethodFactory;
    }

    public CoffeeMethodFactory getCoffeeFactory() {
        return coffeeMethodFactory;
    }

    public void setCoffeeFactory(CoffeeMethodFactory coffeeMethodFactory) {
        this.coffeeMethodFactory = coffeeMethodFactory;
    }

    public void orderCoffee() {
        Coffee coffer = coffeeMethodFactory.createCoffer();
        System.out.println("正在生产:" + coffer.getName());
        coffer.addMilk();
        coffer.addSugar();
    }
}
