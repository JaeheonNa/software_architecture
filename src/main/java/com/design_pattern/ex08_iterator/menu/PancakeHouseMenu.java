package com.design_pattern.ex08_iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{

    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();
    }

    public void addItem(MenuItem item){
        menuItems.add(item);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
