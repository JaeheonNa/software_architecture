package com.design_pattern.ex05_state.state;

import com.design_pattern.ex05_state.context.GumballMachine;

public class WinnerState implements State{

    private GumballMachine gumballMachine;
    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball.");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumball!");
        this.gumballMachine.releaseBall();
        this.gumballMachine.releaseBall();
        if(this.gumballMachine.getGumCount() > 0){
            this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs.");
            this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
        }
    }
}
