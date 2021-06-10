package com.howliked.design.pattern.decorator;

public class Player {
    public static void main(String[] args) {
        //选择英雄
        Hero hero = new BlindMonk("李青");
        //学习技能
        SkillQ q = new SkillQ(hero,"天音波/回音击");
        q.learnSkill();
    }
}
