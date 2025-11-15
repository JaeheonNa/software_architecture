package com.design_pattern.ex06_factory.factory;

import com.design_pattern.ex06_factory.object.*;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(type)){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
