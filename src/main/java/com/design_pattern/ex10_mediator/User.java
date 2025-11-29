package com.design_pattern.ex10_mediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void receive(String message);
    public abstract void send(String message);
}
