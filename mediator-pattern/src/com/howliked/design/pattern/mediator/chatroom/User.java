package com.howliked.design.pattern.mediator.chatroom;

/**
 *
 */
public class User {
    private Long userId;
    private String nickname;

    private Mediator mediator = new CharRoomMediator();

    public User(Long userId, String nickname) {
        this.userId = userId;
        this.nickname = nickname;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }
}
