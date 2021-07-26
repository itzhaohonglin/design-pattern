package com.howliked.design.pattern.chain.interview;

public class ThirdInterViewHandler extends InterViewHandler {
    @Override
    protected boolean handlerRequest(Candidate candidate) {
        System.out.println("对不起," + candidate.getName() + ",三面未通过~~~");
        return false;
    }
}
