package com.design_pattern.ex08_iterator.aggregate;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{

    Hashtable menuItems;

    public CafeMenu() {
        this.menuItems = new Hashtable<String, MenuItem>();
    }

    public void addItem(String name, String desc, boolean vegetarian, double price){
        MenuItem item = new MenuItem(desc);
        menuItems.put(name, item);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }

    public void printMenu(){
        Iterator iterator = createIterator();
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
        }
    }


}
