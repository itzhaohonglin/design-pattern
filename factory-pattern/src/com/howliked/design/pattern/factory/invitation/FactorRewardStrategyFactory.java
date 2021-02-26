package com.howliked.design.pattern.factory.invitation;

public class FactorRewardStrategyFactory extends StrategyFactory{
    @Override
    RewardStrategy createStrategy(Class clz) {
        RewardStrategy product = null;
        try {
            product = (RewardStrategy) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {}
        return product;
    }
}
