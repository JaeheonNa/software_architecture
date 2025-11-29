package com.design_pattern.ex10_mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
