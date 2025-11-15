package com.design_pattern.ex07_abstractFactory.factory;

import com.design_pattern.ex07_abstractFactory.product.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepared();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract protected Pizza createPizza(String type);
}
