package com.design_pattern.ex08_iterator;

import com.design_pattern.ex08_iterator.menu.Menu;
import com.design_pattern.ex08_iterator.menu.MenuItem;

import java.util.Iterator;

public class ServingPerson {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public ServingPerson(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("Menu");
        System.out.println("----------");
        System.out.println("Breakfast");
        printMenu(pancakeIterator);
        System.out.println("\nLunch");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName() + ", ");
        }
    }


}
