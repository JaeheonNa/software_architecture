package com.design_pattern.ex01_strategy.duck;

import com.design_pattern.ex01_strategy.fly.FlyWithWings;
import com.design_pattern.ex01_strategy.quack.Quack;

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
