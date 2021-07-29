package com.howliked.desgin.pattern.command.requirement.command;

import com.howliked.desgin.pattern.command.requirement.Demand;
import com.howliked.desgin.pattern.command.requirement.receiver.Development;

public class StartCommand extends RequirementCommand {
    public StartCommand(Development development) {
        this.development = development;
    }


    @Override
    public void execute(Demand demand) {
        development.begin(demand);
    }
}
