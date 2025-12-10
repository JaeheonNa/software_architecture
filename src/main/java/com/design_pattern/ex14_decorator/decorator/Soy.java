package com.design_pattern.ex14_decorator.decorator;

import com.design_pattern.ex14_decorator.beverage.Beverage;

public class Soy extends CondimentDecorator{

    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
