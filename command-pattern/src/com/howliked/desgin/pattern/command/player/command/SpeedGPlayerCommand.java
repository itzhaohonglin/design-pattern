package com.howliked.desgin.pattern.command.player.command;

import com.howliked.desgin.pattern.command.player.reciver.GPlayer;

public class SpeedGPlayerCommand extends GPlayerCommand {
    public SpeedGPlayerCommand(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        gPlayer.speed();
    }
}
