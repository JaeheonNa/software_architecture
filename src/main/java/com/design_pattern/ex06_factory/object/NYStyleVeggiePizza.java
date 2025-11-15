package com.design_pattern.ex06_factory.object;

public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thick Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
