package com.design_pattern.ex05_state.state;

import com.design_pattern.ex05_state.context.GumballMachine;

public class NoQuarterState implements State{

    private GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter.");
        this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }
}
