package com.design_pattern.ex17_composite;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
