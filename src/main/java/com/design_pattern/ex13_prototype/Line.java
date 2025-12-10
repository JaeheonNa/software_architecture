package com.design_pattern.ex13_prototype;

public class Line extends Graphic  {

    public void op(){}

    int data;

    public Line() {
        super.ref = this;
    }

    @Override
    public Graphic clone() {
        Line n = new Line();
        n.data = this.data;
        System.out.println("ref: " + this.ref + " p.ref: " + n.ref);
        return n;
    }
}
