package com.howliked.desgin.pattern.command.player.command;

import com.howliked.desgin.pattern.command.player.reciver.GPlayer;

public class PauseGPlayerCommand extends GPlayerCommand {

    public PauseGPlayerCommand(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.pause();
    }
}
