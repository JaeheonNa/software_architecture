package com.design_pattern.ex06_factory;

import com.design_pattern.ex06_factory.factory.ChicagoPizzaStore;
import com.design_pattern.ex06_factory.factory.NYPizzaStore;
import com.design_pattern.ex06_factory.factory.PizzaStore;
import com.design_pattern.ex06_factory.object.Pizza;

public class FactoryPattern {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza1.getName());
        System.out.println();
        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza2.getName());

    }
}
