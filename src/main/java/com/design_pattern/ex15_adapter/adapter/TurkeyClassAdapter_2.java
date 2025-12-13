package com.design_pattern.ex15_adapter.adapter;

import com.design_pattern.ex15_adapter.client.Duck;
import com.design_pattern.ex15_adapter.adaptee.Turkey;

public class TurkeyClassAdapter_2 implements Duck, Turkey {

    @Override
    public void quack() {
        this.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++){
            this.jump();
        }
    }

    @Override
    public void gobble() {
        System.out.println("Gobble Gobble!");
    }

    @Override
    public void jump() {
        System.out.println("I can jump in short distance!");
    }
}
