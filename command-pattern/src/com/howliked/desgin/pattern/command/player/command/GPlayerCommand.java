package com.howliked.desgin.pattern.command.player.command;

import com.howliked.desgin.pattern.command.player.reciver.GPlayer;

public abstract class GPlayerCommand {
    protected GPlayer gPlayer;

    public abstract void execute();
}
