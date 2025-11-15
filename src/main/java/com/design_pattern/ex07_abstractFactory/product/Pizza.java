package com.design_pattern.ex07_abstractFactory.product;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    String veggies;
    String cheese;
    String pepperoni;
    String clam;

    public abstract void prepared();
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
