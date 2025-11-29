package com.design_pattern.ex10_mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {

    private List<User> userList = new ArrayList<>();
    @Override
    public void sendMessage(String message, User sender) {
        for(User user : this.userList){
            if(user != sender) {
                user.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }
}
