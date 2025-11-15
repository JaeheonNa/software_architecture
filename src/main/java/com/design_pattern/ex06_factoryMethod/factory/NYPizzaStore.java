package com.design_pattern.ex06_factoryMethod.factory;

import com.design_pattern.ex06_factoryMethod.product.NYStyleCheesePizza;
import com.design_pattern.ex06_factoryMethod.product.NYStyleVeggiePizza;
import com.design_pattern.ex06_factoryMethod.product.Pizza;

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
