package com.howliked.desgin.pattern.command.player;

import com.howliked.desgin.pattern.command.player.command.*;
import com.howliked.desgin.pattern.command.player.invoker.Controller;
import com.howliked.desgin.pattern.command.player.reciver.GPlayer;

public class GPlayCommandClient {
    public static void main(String[] args) {
        GPlayer gPlayer = new GPlayer();
        Controller controller = new Controller();
        controller.execute(new PlayGPlayerCommand(gPlayer));

        controller.addCommand(new PlayGPlayerCommand(gPlayer));
        controller.addCommand(new PauseGPlayerCommand(gPlayer));
        controller.addCommand(new SpeedGPlayerCommand(gPlayer));
        controller.addCommand(new StopGPlayerCommand(gPlayer));

        controller.executes();
    }
}
