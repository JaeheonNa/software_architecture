package com.design_pattern.ex17_composite;

import com.design_pattern.ex17_composite.composite.Menu;
import com.design_pattern.ex17_composite.leaf.MenuItem;

public class Composite {
    public static void main(String[] args){
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Dinner");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Lunch");
        MenuComponent allMenus = new Menu("ALL MENUS", "Restaurant");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dinnerMenu);

        pancakeHouseMenu.add(new MenuItem("Pancake", "Pancake with Strawberry jam", true, 2.89));
        cafeMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with Marina Sauce, and a slice of sourdough bread", true, 3.89));
        dinnerMenu.add(new MenuItem("Steak", "Steak with Salads and Sauce, and french fries", true, 5.89));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
