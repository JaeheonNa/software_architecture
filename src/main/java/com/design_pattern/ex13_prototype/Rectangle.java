package com.design_pattern.ex13_prototype;

public class Rectangle extends Graphic {

    public void op(){}

    int data;

    public Rectangle() {
        super.ref = this;
    }

    @Override
    public Graphic clone() {
        Rectangle n = new Rectangle();
        n.data = this.data;
        System.out.println("ref: " + this.ref + " p.ref: " + n.ref);
        return n;
    }
}
