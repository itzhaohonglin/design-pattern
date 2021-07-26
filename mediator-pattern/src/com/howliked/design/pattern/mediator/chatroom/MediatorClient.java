package com.howliked.design.pattern.mediator.chatroom;

public class MediatorClient {
    public static void main(String[] args) {
        User tom = new User(1L, "tom");
        User jerry = new User(2L, "jerry");
        tom.sendMessage("hello,My name is tom");
        jerry.sendMessage("hello,My name is jerry");
    }
}
