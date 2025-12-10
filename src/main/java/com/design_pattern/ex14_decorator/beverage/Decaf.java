package com.design_pattern.ex14_decorator.beverage;

public class Decaf extends Beverage{

    public Decaf(){
        this.description = "Decaf Coffee";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
