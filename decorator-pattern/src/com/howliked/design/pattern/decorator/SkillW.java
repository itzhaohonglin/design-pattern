package com.howliked.design.pattern.decorator;

public class SkillW extends Skills {
    private String skillName;

    public SkillW(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkill() {
        System.out.println("学习了W技能:" + skillName);
        super.learnSkill();
    }
}
