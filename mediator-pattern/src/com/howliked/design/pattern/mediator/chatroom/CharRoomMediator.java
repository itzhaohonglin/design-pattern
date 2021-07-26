package com.howliked.design.pattern.mediator.chatroom;

public class CharRoomMediator extends Mediator {
    @Override
    public void sendMessage(User user, String message) {
        System.out.println(String.format("用户:[{%s],发送了条消息:%s", user.getNickname(), message));
    }
}
