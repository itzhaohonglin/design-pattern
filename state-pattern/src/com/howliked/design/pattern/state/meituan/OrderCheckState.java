package com.howliked.design.pattern.state.meituan;

/**
 * 订单校验状态
 */
public class OrderCheckState implements RewardState {
    @Override
    public void doReward(RewardStateContext context, Request request) {
//        orderCheck(context, request);  //对进来的订单进行校验，判断是否用券，是否满足优惠条件等等
    }
}
