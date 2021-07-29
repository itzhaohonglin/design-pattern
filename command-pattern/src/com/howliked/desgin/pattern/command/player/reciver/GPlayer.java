package com.howliked.desgin.pattern.command.player.reciver;

public class GPlayer {
    public void play() {
        System.out.println("正常播放");
    }

    public void speed() {
        System.out.println("快进~~~");
    }

    public void stop() {
        System.out.println("停止~~~");
    }

    public void pause() {
        System.out.println("暂停~~~");
    }
}
