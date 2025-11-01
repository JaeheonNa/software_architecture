package com.design_pattern.strategy.duck;

import com.design_pattern.strategy.fly.FlyBehavior;
import com.design_pattern.strategy.quack.QuackBehavior;

public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck(){}

    abstract void display();
    public void performFly(){
        this.flyBehavior.fly();
    }
    public void performQuack() {
        this.quackBehavior.quack();
    }
    public void swim () {
        System.out.println("All ducks float, even decoys!");
    }
}