package com.design_pattern.ex09_chainOfResponsibility.handler;

public class FirstHandler extends Handler{
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10){
            System.out.println("FirstHandler: " + request);
        } else {
            if (this.handler != null) {
                this.handler.handleRequest(request);
            }
        }
    }
}
