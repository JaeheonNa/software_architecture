package com.design_pattern.strategy;


import com.design_pattern.strategy.fly.FlyRocketPowered;

public class StrategyPattern {

    /**
     * @param args
     * Strategy 패턴은 어떤 자식 객체들이 서로 '행위'가 다를 때,
     * '행위'자체를 추상화한 후,
     * '구체적인 행위'를 각 객체들이 갖도록 하는 것.
     *
     *  p.s// 구체적인 행위 = 구체적인 전략
     */
    public static void main(String[] args){
        Duck duck = new RedHeadDuck();
        duck.performFly();
        duck.performQuack();

        Duck duck2 = new ModelDuck();
        duck2.performFly();
        duck2.performQuack();
        duck2.setFlyBehavior(new FlyRocketPowered());
        duck2.performFly();
    }
}