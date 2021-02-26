package com.howliked.design.pattern.factory.invitation;

/**
 * 返奖策略 抽象
 */
public abstract class RewardStrategy {
    public abstract int reward(long userId);

    public void insertRewardAndSettlement(long userId, int reward) {
    }

    ; //更新用户信息以及结算
}
