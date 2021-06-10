package com.howliked.design.pattern.bridge;

public class FlipPhone extends Phone {
    public FlipPhone(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void create() {
        brand.open();
        brand.call();
        brand.close();
    }
}
