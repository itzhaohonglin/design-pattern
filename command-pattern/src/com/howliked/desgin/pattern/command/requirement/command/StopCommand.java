package com.howliked.desgin.pattern.command.requirement.command;

import com.howliked.desgin.pattern.command.requirement.Demand;
import com.howliked.desgin.pattern.command.requirement.receiver.Development;

public class StopCommand extends RequirementCommand {
    public StopCommand(Development development) {
        this.development = development;
    }


    @Override
    public void execute(Demand demand) {
        development.end(demand);
    }
}
