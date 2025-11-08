package com.design_pattern.ex05_state.state;

import com.design_pattern.ex05_state.context.GumballMachine;

public class SoldOutState implements State{
    private GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("The machine is sold out.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("The machine is sold out.");
    }

    @Override
    public void turnCrank() {
        System.out.println("The machine is sold out.");
    }

    @Override
    public void dispense() {
        System.out.println("No Gumball dispensed.\n");
    }
}
