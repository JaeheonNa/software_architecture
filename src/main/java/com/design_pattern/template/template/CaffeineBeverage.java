package com.design_pattern.template.template;

public abstract class CaffeineBeverage {
    /** Template Method **/
     // final이 중요!
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    /** Abstract Method **/
    public abstract void brew();
    public abstract void addCondiments();

    /** Complete Method **/
    private void boilWater(){
        System.out.println("Boil water.");
    }

    private void pourInCup() {
        System.out.println("Pour in cup");
    }

    /** Hook Method **/
    public boolean customerWantsCondiments() {
        return true;
    }

}
