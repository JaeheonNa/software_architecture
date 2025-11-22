package com.design_pattern.ex09_chainOfResponsibility.handler;

public class ThirdHandler extends Handler{
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30){
            System.out.println("ThirdHandler: " + request);
        } else {
            if (this.handler != null) {
                this.handler.handleRequest(request);
            }
        }
    }
}
