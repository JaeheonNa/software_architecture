package com.design_pattern.strategy;

import com.design_pattern.strategy.fly.FlyBehavior;
import com.design_pattern.strategy.quack.QuackBehavior;

public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;
    public Duck(){}
    abstract void display();
    void performFly(){
        this.flyBehavior.fly();
    }
    void performQuack() {
        this.quackBehavior.quack();
    }
    void swim () {
        System.out.println("All ducks float, even decoys!");
    }
    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}