package com.design_pattern.ex10_mediator;

public class Mediator {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();
        User user1 = new ChatUser(mediator, "철수");
        User user2 = new ChatUser(mediator, "영희");
        User user3 = new ChatUser(mediator, "민수");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("안녕하세요");
    }
}
