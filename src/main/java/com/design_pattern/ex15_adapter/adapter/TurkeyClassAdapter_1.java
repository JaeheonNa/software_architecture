package com.design_pattern.ex15_adapter.adapter;

import com.design_pattern.ex15_adapter.client.Duck;
import com.design_pattern.ex15_adapter.adaptee.WildTurkey;

public class TurkeyClassAdapter_1 extends WildTurkey implements Duck {


    @Override
    public void quack() {
        this.gobble();
    }

    @Override
    public void fly() {
        this.jump();
    }
}
