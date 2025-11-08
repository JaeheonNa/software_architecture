package com.design_pattern.ex04_templateMethod;

import com.design_pattern.ex04_templateMethod.concrete.Coffee;
import com.design_pattern.ex04_templateMethod.concrete.Tea;
import com.design_pattern.ex04_templateMethod.template.CaffeineBeverage;

public class TemplateMethodPattern {
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
