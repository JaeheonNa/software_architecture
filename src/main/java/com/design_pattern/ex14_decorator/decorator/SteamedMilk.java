package com.design_pattern.ex14_decorator.decorator;

import com.design_pattern.ex14_decorator.beverage.Beverage;

public class SteamedMilk extends CondimentDecorator{

    private Beverage beverage;

    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
