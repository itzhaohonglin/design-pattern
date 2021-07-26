package com.howliked.design.pattern.chain.interview;

public class HRInterViewHandler extends InterViewHandler {
    @Override
    protected boolean handlerRequest(Candidate candidate) {
        System.out.println("对不起," + candidate.getName() + ",HR面未通过~~~");
        return false;
    }
}
