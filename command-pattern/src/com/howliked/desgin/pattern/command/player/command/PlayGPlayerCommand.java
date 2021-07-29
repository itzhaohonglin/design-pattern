package com.howliked.desgin.pattern.command.player.command;

import com.howliked.desgin.pattern.command.player.reciver.GPlayer;

public class PlayGPlayerCommand extends GPlayerCommand {

    public PlayGPlayerCommand(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.play();
    }
}
