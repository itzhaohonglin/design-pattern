package com.howliked.design.pattern.chain.interview;

import java.util.Arrays;

public class ChainClient {
    public static void main(String[] args) {
        ChainHandler chainHandler = new ChainHandler();
        chainHandler.addHandler(Arrays.asList(new FirstInterViewHandler(), new SecondInterViewHandler()));
        Candidate candidate = new Candidate("张三", "13919119901", "Java开发");
        //chainHandler.doHandler(candidate);
        System.out.println(candidate.getName() + "是否通过面试:" + chainHandler.doHandler(candidate));
    }
}
