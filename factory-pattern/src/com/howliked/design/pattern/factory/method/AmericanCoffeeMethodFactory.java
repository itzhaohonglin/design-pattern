package com.howliked.design.pattern.factory.method;

import com.howliked.design.pattern.factory.AmericanCoffee;
import com.howliked.design.pattern.factory.Coffee;

/**
 * 美式咖啡工厂对象，专门用来美式拿铁咖啡
 */
public class AmericanCoffeeMethodFactory implements CoffeeMethodFactory {
    @Override
    public Coffee createCoffer() {
        return new AmericanCoffee();
    }
}
