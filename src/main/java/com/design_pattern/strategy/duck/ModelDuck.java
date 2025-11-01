package com.design_pattern.strategy.duck;

import com.design_pattern.strategy.fly.FlyNoWay;
import com.design_pattern.strategy.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck () {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck!");
    }
}
