package com.howliked.design.pattern.factory.simple;

import com.howliked.design.pattern.factory.AmericanCoffee;
import com.howliked.design.pattern.factory.Coffee;
import com.howliked.design.pattern.factory.LatteCoffee;

public class CoffeeSimpleFactory {

    public static Coffee getCoffee(String type) {
        if ("american".equals(type)) {
            return new AmericanCoffee();
        } else if ("latte".equals(type)) {
            return new LatteCoffee();
        }
        return null;
    }
}
