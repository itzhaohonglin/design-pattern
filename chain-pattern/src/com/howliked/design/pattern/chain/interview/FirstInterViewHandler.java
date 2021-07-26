package com.howliked.design.pattern.chain.interview;

public class FirstInterViewHandler extends InterViewHandler {
    @Override
    protected boolean handlerRequest(Candidate candidate) {
        System.out.println(candidate.getName() + ",一面通过~~~");
        return true;
    }
}
