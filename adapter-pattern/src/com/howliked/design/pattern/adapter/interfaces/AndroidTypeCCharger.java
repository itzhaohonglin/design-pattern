package com.howliked.design.pattern.adapter.interfaces;

public class AndroidTypeCCharger implements TypeCCharger{
    @Override
    public void chargingWithTypeC() {
        System.out.println("使用typeC充电口进行充电");
    }
}
