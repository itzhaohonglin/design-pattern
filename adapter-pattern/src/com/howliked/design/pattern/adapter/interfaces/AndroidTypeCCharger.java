package com.howliked.design.pattern.adapter;

public class AndroidTypeCCharger implements TypeCCharger{
    @Override
    public void chargingWithTypeC() {
        System.out.println("使用typeC充电口进行充电");
    }
}
