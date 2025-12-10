package com.design_pattern.ex13_prototype;

public class ShallowPrototype implements Cloneable{
    private int x;
    private ShallowNested ref = new ShallowNested();
    @Override
    public Cloneable clone() {
        ShallowPrototype p = new ShallowPrototype();
        p.x = this.x;
        p.ref = this.ref;
        System.out.println("ref: " + ref);
        return p;
    }
}
