package com.design_pattern.template.concrete;

import com.design_pattern.template.template.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("");
    }

    @Override
    public void addCondiments() {
        System.out.println("");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = "Y";
        if ("Y".equals(answer)) return true;
        else return false;
    }
}
