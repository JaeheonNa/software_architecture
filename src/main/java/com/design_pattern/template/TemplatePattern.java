package com.design_pattern.template;

import com.design_pattern.template.concrete.Coffee;
import com.design_pattern.template.concrete.Tea;
import com.design_pattern.template.template.CaffeineBeverage;

public class TemplatePattern {
    public static void main(String[] args){
        System.out.println("Coffee prepared.");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println();

        System.out.println("Tea prepared.");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        System.out.println();

        System.out.println("Coffee prepared.");
        recipe(new Coffee());
        System.out.println();

        System.out.println("Tea prepared.");
        recipe(new Tea());
        System.out.println();
    }


    public static void recipe(CaffeineBeverage beverage){
        beverage.prepareRecipe();
    }
}
