package com.design_pattern.ex07_abstractFactory.factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public String createDough() {
        return "ThickCrustDough";
    }

    @Override
    public String createSauce() {
        return "GarlicSauce";
    }

    @Override
    public String createCheese() {
        return "MozzarellaCheese";
    }

    @Override
    public String createVeggies() {
        return "Tomato";
    }

    @Override
    public String createPepperoni() {
        return "BakedPepperoni";
    }

    @Override
    public String createClam() {
        return "BoiledClams";
    }
}
