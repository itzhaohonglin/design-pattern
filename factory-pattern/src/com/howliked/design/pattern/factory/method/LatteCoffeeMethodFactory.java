package com.howliked.design.pattern.factory.method;

import com.howliked.design.pattern.factory.Coffee;
import com.howliked.design.pattern.factory.LatteCoffee;

/**
 * 拿铁咖啡工厂对象，专门用来生产拿铁咖啡
 */
public class LatteCoffeeMethodFactory implements CoffeeMethodFactory {
    @Override
    public Coffee createCoffer() {
        return new LatteCoffee();
    }
}
