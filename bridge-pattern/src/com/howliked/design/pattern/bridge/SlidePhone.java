package com.howliked.design.pattern.bridge;

public class SlidePhone extends Phone {
    @Override
    public void create() {
        brand.open();
        brand.call();
        brand.close();
    }
}
