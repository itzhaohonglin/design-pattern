package com.howliked.design.pattern.decorator;

public class BlindMonk implements Hero {
    private String name;

    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkill() {
        System.out.println(name+"学习了以一技能");
    }
}
