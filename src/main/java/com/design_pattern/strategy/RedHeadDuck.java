package com.design_pattern.strategy;

import com.design_pattern.strategy.fly.FlyWithWings;
import com.design_pattern.strategy.quack.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck (){
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("ReadHeadDuck");
    }
}
