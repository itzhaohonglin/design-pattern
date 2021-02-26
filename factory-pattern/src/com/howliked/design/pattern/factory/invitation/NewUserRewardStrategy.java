package com.howliked.design.pattern.factory.invitation;

/**
 * 新用户返奖策略
 */
public class NewUserRewardStrategy extends RewardStrategy{
    @Override
    public int reward(long userId) {
        return 0;
    }
}
