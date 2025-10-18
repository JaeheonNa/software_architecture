package com.design_pattern.strategy;


import com.design_pattern.strategy.fly.FlyRocketPowered;

public class StrategyPattern {
    public static void main(String[] args){
        Duck duck = new RedHeadDuck();
        duck.performFly();
        duck.performQuack();

        Duck duck2 = new ModelDuck();
        duck2.performFly();
        duck2.performQuack();
        duck2.setFlyBehavior(new FlyRocketPowered());
        duck2.performFly();
    }
}