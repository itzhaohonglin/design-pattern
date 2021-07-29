package com.howliked.desgin.pattern.command.requirement;

import com.howliked.desgin.pattern.command.requirement.command.RequirementCommand;
import com.howliked.desgin.pattern.command.requirement.command.StartCommand;
import com.howliked.desgin.pattern.command.requirement.invoker.TeamLeader;
import com.howliked.desgin.pattern.command.requirement.receiver.Development;

public class DevelopmentCommandTest {
    public static void main(String[] args) {
        Development xiaoming = new Development("小明");
        Demand demand = new Demand("日常维护");
        RequirementCommand command = new StartCommand(xiaoming);
        TeamLeader teamLeader = new TeamLeader(command);
        teamLeader.executeCommand(demand);
    }
}
