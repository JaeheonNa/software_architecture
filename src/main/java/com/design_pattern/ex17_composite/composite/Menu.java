package com.design_pattern.ex17_composite.composite;

import com.design_pattern.ex17_composite.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
    List menuComponentList = new ArrayList<>();
    String name;
    String description;
    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        this.menuComponentList.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        this.menuComponentList.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent) menuComponentList.get(i);
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public void print() {
        System.out.println(this.name + " for " + this.description);
        Iterator iterator = menuComponentList.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
