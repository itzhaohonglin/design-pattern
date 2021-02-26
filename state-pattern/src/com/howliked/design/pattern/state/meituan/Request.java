package com.howliked.design.pattern.state.meituan;

public class Request {
    private long userId;
    private long orderId;

    public Request(long userId, long orderId) {
        this.userId = userId;
        this.orderId = orderId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
}
