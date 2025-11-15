package com.design_pattern.ex07_abstractFactory.product;

import com.design_pattern.ex07_abstractFactory.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
    private PizzaIngredientFactory pizzaIngredientFactory;
    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepared() {
        System.out.println("Preparing " + this.name);
        this.dough = pizzaIngredientFactory.createDough();
        this.sauce = pizzaIngredientFactory.createSauce();
        this.cheese = pizzaIngredientFactory.createCheese();
        this.pepperoni = pizzaIngredientFactory.createPepperoni();
        System.out.println("  " + this.dough + "  " + this.sauce + "  " + this.cheese + "  " + this.pepperoni);
    }
}
