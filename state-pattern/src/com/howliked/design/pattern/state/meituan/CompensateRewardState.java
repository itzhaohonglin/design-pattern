package com.howliked.design.pattern.state.meituan;

public class CompensateRewardState implements RewardState{
    @Override
    public void doReward(RewardStateContext context, Request request) {
//        compensateReward(context, request);  //返奖失败，需要对用户进行返奖补偿
    }
}
