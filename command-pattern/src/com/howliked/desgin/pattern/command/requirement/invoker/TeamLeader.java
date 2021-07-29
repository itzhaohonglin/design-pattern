package com.howliked.desgin.pattern.command.requirement.invoker;

import com.howliked.desgin.pattern.command.requirement.Demand;
import com.howliked.desgin.pattern.command.requirement.command.RequirementCommand;

public class TeamLeader {
    private RequirementCommand command;

    public TeamLeader(RequirementCommand command) {
        this.command = command;
    }

    public void executeCommand(Demand demand) {
        command.execute(demand);
    }

}
