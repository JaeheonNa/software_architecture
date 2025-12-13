package com.design_pattern.ex15_adapter.adaptee;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble!");
    }

    @Override
    public void jump() {
        System.out.println("I can jump in short distance!");
    }
}
