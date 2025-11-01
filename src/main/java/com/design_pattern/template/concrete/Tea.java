package com.design_pattern.template.concrete;

import com.design_pattern.template.template.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("");
    }

    @Override
    public void addCondiments() {
        System.out.println("");
    }
}
