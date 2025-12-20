package com.design_pattern.ex08_iterator.aggregate;

import com.design_pattern.ex08_iterator.iterator.DinerMenuIterator;

import java.util.Iterator;

public class DinerMenu implements Menu{

    MenuItem[] menuItems;
    int position = 0;

    public DinerMenu(){
        this.menuItems = new MenuItem[10];
    }

    public void addItem(MenuItem item) {
        menuItems[position++] = item;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }


}
