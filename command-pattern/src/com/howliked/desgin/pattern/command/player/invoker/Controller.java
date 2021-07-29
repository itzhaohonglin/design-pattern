package com.howliked.desgin.pattern.command.player.invoker;

import com.howliked.desgin.pattern.command.player.command.GPlayerCommand;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<GPlayerCommand> GPlayerCommandList = new ArrayList<>();

    public void addCommand(GPlayerCommand GPlayerCommand) {
        GPlayerCommandList.add(GPlayerCommand);
    }

    public void execute(GPlayerCommand GPlayerCommand) {
        GPlayerCommand.execute();
    }

    public void executes() {
        GPlayerCommandList.forEach(command -> {
            command.execute();
        });
    }

}
