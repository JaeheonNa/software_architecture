package com.design_pattern.ex13_prototype;

public abstract class Graphic implements GraphicPrototype {

    private int x;
    GraphicPrototype ref;

    @Override
    public abstract Graphic clone();
//    @Override
//    public GraphicPrototype clone() {
//        Graphic p = new Graphic();
//        p.ref = this.ref.clone();
//        p.x = this.x;
//        System.out.println("ref: " + ref + " p.ref: " + p.ref);
//        return p;
//    }
}
