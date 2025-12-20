package com.design_pattern.ex08_iterator;

import com.design_pattern.ex08_iterator.aggregate.CafeMenu;
import com.design_pattern.ex08_iterator.aggregate.DinerMenu;
import com.design_pattern.ex08_iterator.aggregate.MenuItem;
import com.design_pattern.ex08_iterator.aggregate.PancakeHouseMenu;
import com.design_pattern.ex08_iterator.client.ServingPerson;

public class Iterator {
    public static void main(String[] args){

        MenuItem pancake = new MenuItem("Pancake");
        MenuItem milk = new MenuItem("Milk");
        PancakeHouseMenu pancakeHouseMenu  = new PancakeHouseMenu();
        pancakeHouseMenu.addItem(pancake);
        pancakeHouseMenu.addItem(milk);

        MenuItem steak = new MenuItem("Steak");
        MenuItem salad = new MenuItem("Salad");
        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.addItem(steak);
        dinerMenu.addItem(salad);

        ServingPerson sp = new ServingPerson(pancakeHouseMenu, dinerMenu);
        sp.printMenu();

        System.out.println();
        System.out.println("Cafe");
        CafeMenu cafeMenu = new CafeMenu();
        cafeMenu.addItem("Bread", "Toast", false, 10000);
        cafeMenu.addItem("Fruit", "Tomato", true, 10000);
        cafeMenu.printMenu();
    }
}
