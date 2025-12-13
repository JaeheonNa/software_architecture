package com.design_pattern.ex15_adapter;

import com.design_pattern.ex15_adapter.client.Duck;
import com.design_pattern.ex15_adapter.client.MallardDuck;
import com.design_pattern.ex15_adapter.adapter.TurkeyAdapter;
import com.design_pattern.ex15_adapter.adapter.TurkeyClassAdapter_1;
import com.design_pattern.ex15_adapter.adapter.TurkeyClassAdapter_2;
import com.design_pattern.ex15_adapter.adaptee.Turkey;
import com.design_pattern.ex15_adapter.adaptee.WildTurkey;

public class Adapter {
    public static void main(String[] args){
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        testTurkey(turkey);

        System.out.println("The duck says...");
        testDuck(duck);

        System.out.println("The Object TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        /** 사실상 2-way adapter지만,,,
         * Duck을 가진 Client가
         * 어댑터를 이용해
         * Turkey를 호출할 수 있도록 함.
         * Duck -> Adapter -> Turkey
         * **/
        System.out.println("The Class TurkeyAdapter_1 says...");
        Duck turkeyClassAdapter_1 = new TurkeyClassAdapter_1();
        testDuck(turkeyClassAdapter_1);

        /** 사실상 2-way adapter지만,,,
         * Duck -> Adapter -> Turkey
         * **/
        System.out.println("The Class TurkeyAdapter_2 says...");
        Duck turkeyClassAdapter_2 = new TurkeyClassAdapter_2();
        testDuck(turkeyClassAdapter_2);
        testTurkey((Turkey) turkeyClassAdapter_2);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.jump();
    }
}
