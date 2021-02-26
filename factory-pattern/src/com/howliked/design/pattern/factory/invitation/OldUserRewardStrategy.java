package com.howliked.design.pattern.factory.invitation;

/**
 * 老用户返奖策略
 */
public class OldUserRewardStrategy extends RewardStrategy{
    @Override
    public int reward(long userId) {
        return 0;
    }
}
