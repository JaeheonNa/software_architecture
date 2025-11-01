package com.design_pattern.command.callee;

public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }
    public void on(){
        System.out.println(name + ": Light on!");
    }

    public void off(){
        System.out.println(name + ": Light off!");
    }
}
