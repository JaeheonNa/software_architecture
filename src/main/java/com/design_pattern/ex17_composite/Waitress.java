package com.design_pattern.ex17_composite;

import com.design_pattern.ex17_composite.composite.MenuComponent;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
