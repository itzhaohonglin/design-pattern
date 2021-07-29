package com.howliked.desgin.pattern.command.requirement.command;

import com.howliked.desgin.pattern.command.requirement.Demand;
import com.howliked.desgin.pattern.command.requirement.receiver.Development;

public abstract class RequirementCommand {

    protected Development development;

    public abstract void execute(Demand demand);
}
