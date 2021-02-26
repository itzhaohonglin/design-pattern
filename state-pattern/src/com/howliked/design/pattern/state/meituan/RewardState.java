package com.howliked.design.pattern.state.meituan;

/**
 * 返奖状态
 */
public interface RewardState {

    void doReward(RewardStateContext context, Request request);
}
