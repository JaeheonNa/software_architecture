package com.design_pattern.ex07_abstractFactory;

import com.design_pattern.ex07_abstractFactory.factory.ChicagoPizzaStore;
import com.design_pattern.ex07_abstractFactory.factory.NYPizzaStore;
import com.design_pattern.ex07_abstractFactory.factory.PizzaStore;
import com.design_pattern.ex07_abstractFactory.product.Pizza;

public class AbstractFactory {
    public static void main(String[] args){
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println();
        pizza = pizzaStore.orderPizza("veggie");
        System.out.println();
        pizza = pizzaStore.orderPizza("clam");
        System.out.println();
        pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println();

        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza("cheese");
        System.out.println();
        pizza = pizzaStore.orderPizza("veggie");
        System.out.println();
        pizza = pizzaStore.orderPizza("clam");
        System.out.println();
        pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println();
    }
}
