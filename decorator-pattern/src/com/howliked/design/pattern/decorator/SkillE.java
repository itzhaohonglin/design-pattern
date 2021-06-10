package com.howliked.design.pattern.decorator;

public class SkillE extends Skills {
    private String skillName;

    public SkillE(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkill() {
        System.out.println("学习了E技能:" + skillName);
        super.learnSkill();
    }
}
