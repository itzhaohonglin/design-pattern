package com.howliked.design.pattern.factory;

import com.howliked.design.pattern.factory.Coffee;

public class LatteCoffee extends Coffee {
    @Override
    public String getName() {
        return "拿铁咖啡";
    }
}
