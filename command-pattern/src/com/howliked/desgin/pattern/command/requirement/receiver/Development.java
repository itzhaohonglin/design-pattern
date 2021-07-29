package com.howliked.desgin.pattern.command.requirement.receiver;

import com.howliked.desgin.pattern.command.requirement.Demand;

public class Development {
    private String name;

    public Development(String name) {
        this.name = name;
    }

    public void begin(Demand demand) {
        System.out.println(name + "开发需求:" + demand.getName());
    }

    public void end(Demand demand) {
        System.out.println(name + "暂停需求:" + demand.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
