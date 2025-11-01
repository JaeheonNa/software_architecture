package com.design_pattern.command.callee;

public class Tv {
    String name;

    public Tv(String name) {
        this.name = name;
    }
    public void on(){
        System.out.println(name + ": Tv on!");
    }

    public void off(){
        System.out.println(name + ": Tv off!");
    }
}
