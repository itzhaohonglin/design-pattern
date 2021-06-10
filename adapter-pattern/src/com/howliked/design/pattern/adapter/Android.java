package com.howliked.design.pattern.adapter;

public class Android {
    private TypeCCharger typeCCharger;

    public Android(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }

    public void charging() {
        System.out.println("给android手机充电");
        typeCCharger.chargingWithTypeC();
    }
}
