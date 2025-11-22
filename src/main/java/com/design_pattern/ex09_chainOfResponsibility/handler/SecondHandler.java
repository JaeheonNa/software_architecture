package com.design_pattern.ex09_chainOfResponsibility.handler;

public class SecondHandler extends Handler{
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20){
            System.out.println("SecondHandler: " + request);
        } else {
            if (this.handler != null) {
                this.handler.handleRequest(request);
            }
        }
    }
}
