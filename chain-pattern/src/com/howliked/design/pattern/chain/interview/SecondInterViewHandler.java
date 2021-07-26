package com.howliked.design.pattern.chain.interview;

public class SecondInterViewHandler extends InterViewHandler {
    @Override
    protected boolean handlerRequest(Candidate candidate) {
        System.out.println(candidate.getName() + ",二面通过~~~");
        return true;
    }
}
