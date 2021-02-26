package com.howliked.design.pattern.factory.invitation;

/**
 * 返奖策略Context
 */
public class RewardStrategyContext {
    private RewardStrategy rewardStrategy;

    public RewardStrategyContext(RewardStrategy rewardStrategy) {
        this.rewardStrategy = rewardStrategy;
    }

    public void doStrategy(long userId){
        int rewardMoney = rewardStrategy.reward(userId);    //返奖金额
        rewardStrategy.insertRewardAndSettlement(userId,rewardMoney);   //插入记录
    }
}
