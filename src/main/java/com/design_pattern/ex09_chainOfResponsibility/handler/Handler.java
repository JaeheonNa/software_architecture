package com.design_pattern.ex09_chainOfResponsibility.handler;

public abstract class Handler {
    Handler handler;
    public void setSuccessor(Handler handler){
        this.handler = handler;
    }

    public abstract void handleRequest(int request);
}
