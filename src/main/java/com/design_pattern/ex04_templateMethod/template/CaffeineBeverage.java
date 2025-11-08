package com.design_pattern.ex04_templateMethod.template;

public abstract class CaffeineBeverage {
    /** Template Method **/
     // final이 중요!
    final public void prepareRecipe() {
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
        System.out.println("Boiling water.");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup.");
    }

    /** Hook Method **/
    public boolean customerWantsCondiments() {
        return true;
    }

}
