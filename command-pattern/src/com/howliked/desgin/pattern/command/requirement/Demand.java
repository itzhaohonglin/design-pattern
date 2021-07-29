package com.howliked.desgin.pattern.command.requirement;

/**
 * 需求
 */
public class Demand {
    private String name;

    public Demand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
