package com.howliked.design.pattern.decorator;

public abstract class Skills implements Hero {
    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkill() {
        if (hero != null) {
            hero.learnSkill();
        }
    }
}
