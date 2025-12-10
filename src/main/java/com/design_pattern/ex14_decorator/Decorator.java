package com.design_pattern.ex14_decorator;

import com.design_pattern.ex14_decorator.beverage.Beverage;
import com.design_pattern.ex14_decorator.beverage.DarkRoast;
import com.design_pattern.ex14_decorator.beverage.Espresso;
import com.design_pattern.ex14_decorator.beverage.HouseBlend;
import com.design_pattern.ex14_decorator.decorator.Mocha;
import com.design_pattern.ex14_decorator.decorator.Soy;
import com.design_pattern.ex14_decorator.decorator.Whip;

public class Decorator {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
