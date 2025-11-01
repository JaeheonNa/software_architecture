package com.design_pattern.template.template;

public abstract class CaffeineBeverage {
    // final이 중요!
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public abstract void brew();
    public abstract void addCondiments();

    private void boilWater(){
        System.out.println("Boil water.");
    }

    private void pourInCup() {
        System.out.println("Pour in cup");
    }
}
