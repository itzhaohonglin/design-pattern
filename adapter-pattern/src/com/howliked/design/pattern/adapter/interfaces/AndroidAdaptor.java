package com.howliked.design.pattern.adapter;

public class AndroidAdaptor implements TypeCCharger {
    private LightCharger lightCharger;

    public AndroidAdaptor(LightCharger lightCharger) {
        this.lightCharger = lightCharger;
    }

    @Override
    public void chargingWithTypeC() {
        lightCharger.chargingWithLight();
    }
}
