package com.howliked.design.pattern.adapter.interfaces;

public class AndroidChargingClient {
    /**
     * 演示:使用Light充电口给android充电
     * 中间需要适配器
     *
     * @param args
     */
    public static void main(String[] args) {
        AndroidAdaptor adaptor = new AndroidAdaptor(new AppleLightCharger());
        Android android = new Android(adaptor);
        android.charging();
    }
}
