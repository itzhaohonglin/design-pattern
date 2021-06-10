package com.howliked.design.pattern.bridge;

public class PhoneBrandClient {
    public static void main(String[] args) {
        Phone phone = new FlipPhone(new HuaWei());
        phone.create();
    }
}
