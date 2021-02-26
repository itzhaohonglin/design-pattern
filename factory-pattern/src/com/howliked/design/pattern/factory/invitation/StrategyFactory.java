package com.howliked.design.pattern.factory.invitation;

/**
 * 策略工厂,返回某个返奖策略
 *
 */
public abstract class StrategyFactory<T> {
    abstract RewardStrategy createStrategy(Class<T> clz);
}
