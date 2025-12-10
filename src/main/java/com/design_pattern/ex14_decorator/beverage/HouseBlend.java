package com.design_pattern.ex14_decorator.beverage;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
