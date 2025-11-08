package com.design_pattern.ex01_strategy.duck;

import com.design_pattern.ex01_strategy.fly.FlyNoWay;
import com.design_pattern.ex01_strategy.quack.Quack;

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
