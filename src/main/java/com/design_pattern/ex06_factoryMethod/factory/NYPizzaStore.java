package com.design_pattern.ex06_factoryMethod.factory;

import com.design_pattern.ex06_factoryMethod.object.NYStyleCheesePizza;
import com.design_pattern.ex06_factoryMethod.object.NYStyleVeggiePizza;
import com.design_pattern.ex06_factoryMethod.object.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new NYStyleCheesePizza();
        } else if ("veggie".equals(type)){
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
