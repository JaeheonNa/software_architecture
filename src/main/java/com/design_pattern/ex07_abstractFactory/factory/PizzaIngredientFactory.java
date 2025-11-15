package com.design_pattern.ex07_abstractFactory.factory;

public interface PizzaIngredientFactory {
    public String createDough();
    public String createSauce();
    public String createCheese();
    public String createVeggies();
    public String createPepperoni();
    public String createClam();
}
