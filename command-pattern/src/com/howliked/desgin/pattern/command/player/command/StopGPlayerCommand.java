package com.howliked.desgin.pattern.command.player.command;

import com.howliked.desgin.pattern.command.player.reciver.GPlayer;

public class StopGPlayerCommand extends GPlayerCommand {

    public StopGPlayerCommand(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.stop();
    }
}
