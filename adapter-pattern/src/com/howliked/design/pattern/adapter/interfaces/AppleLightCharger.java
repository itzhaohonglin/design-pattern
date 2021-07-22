package com.howliked.design.pattern.adapter;

public class AppleLightCharger implements LightCharger {
    @Override
    public void chargingWithLight() {
        System.out.println("使用苹果light充电口充电..");
    }
}
