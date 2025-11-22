package com.design_pattern.ex08_iterator;

import com.design_pattern.ex08_iterator.menu.CafeMenu;
import com.design_pattern.ex08_iterator.menu.DinerMenu;
import com.design_pattern.ex08_iterator.menu.MenuItem;
import com.design_pattern.ex08_iterator.menu.PancakeHouseMenu;

public class Iterator {
    public static void main(String[] args){
        PancakeHouseMenu pancakeHouseMenu  = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        MenuItem pancake = new MenuItem("Pancake");
        pancakeHouseMenu.addItem(pancake);
        MenuItem milk = new MenuItem("Milk");
        pancakeHouseMenu.addItem(milk);

        MenuItem steak = new MenuItem("Steak");
        dinerMenu.addItem(steak);
        MenuItem salad = new MenuItem("Salad");
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
