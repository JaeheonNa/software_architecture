package com.design_pattern.ex13_prototype;

public abstract class Graphic implements GraphicPrototype {

    private int x;
    GraphicPrototype ref;

    @Override
    public abstract Graphic clone();
}
