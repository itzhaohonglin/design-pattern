package com.howliked.design.pattern.decorator;

public class SkillQ extends Skills {
    private String skillName;

    public SkillQ(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkill() {
        System.out.println("学习了Q技能:" + skillName);
        super.learnSkill();
    }
}
