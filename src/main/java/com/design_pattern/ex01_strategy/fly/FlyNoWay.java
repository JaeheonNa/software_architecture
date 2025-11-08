package com.design_pattern.ex01_strategy.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}