package com.design_pattern.ex10_mediator;

public class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + "이(가) 수신: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println(name + "이(가) 송신: " + message);
        mediator.sendMessage(message, this);
    }
}
