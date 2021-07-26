package com.howliked.design.pattern.mediator.chatroom;

/**
 * 中介者
 * [聊天室]
 */
public abstract class Mediator {

    public abstract void sendMessage(User user, String message);
}
