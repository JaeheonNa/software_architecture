package com.design_pattern.ex07_abstractFactory.factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public String createDough() {
        return "ThinCrustDough";
    }

    @Override
    public String createSauce() {
        return "MarinaraSauce";
    }

    @Override
    public String createCheese() {
        return "ReggianoCheese";
    }

    @Override
    public String createVeggies() {
        return "Veggies";
    }

    @Override
    public String createPepperoni() {
        return "SlicedPepperoni";
    }

    @Override
    public String createClam() {
        return "FreshClams";
    }
}
