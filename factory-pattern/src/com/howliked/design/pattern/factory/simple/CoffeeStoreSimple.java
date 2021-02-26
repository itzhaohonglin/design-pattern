package com.howliked.design.pattern.factory.simple;

import com.howliked.design.pattern.factory.Coffee;

public class CoffeeStoreSimple {

    public void orderCoffer(String type) {
        Coffee coffee = CoffeeSimpleFactory.getCoffee(type);
        System.out.println("正在生产:" + coffee.getName());
        coffee.addSugar();
        coffee.addMilk();
    }
}
