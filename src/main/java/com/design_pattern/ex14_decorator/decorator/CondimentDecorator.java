package com.design_pattern.ex14_decorator.decorator;

import com.design_pattern.ex14_decorator.beverage.Beverage;

abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
