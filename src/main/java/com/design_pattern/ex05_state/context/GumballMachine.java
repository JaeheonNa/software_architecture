package com.design_pattern.ex05_state.context;

import com.design_pattern.ex05_state.state.*;

public class GumballMachine {

    private State SOLD_OUT;
    private State NO_QUARTER;
    private State HAS_QUARTER;
    private State SOLD;
    private State WINNER_STATE;

    private State state;
    private int gumCount = 0;

    public GumballMachine(int gumCount){
        this.gumCount = gumCount;
        this.SOLD_OUT = new SoldOutState(this);
        this.NO_QUARTER = new NoQuarterState(this);
        this.HAS_QUARTER = new HasQuarterState(this);
        this.SOLD = new SoldState(this);
        this.WINNER_STATE = new WinnerState(this);
        this.state = this.SOLD_OUT;
        if (gumCount > 0) {
            this.state = this.NO_QUARTER;
        }
    }

    public void setState(State state){
        this.state = state;
    }
    public int getGumCount(){
        return this.gumCount;
    }
    public String toString() {
        return "Gumballs are " + this.gumCount;
    }

    /** 상태에 위임된 Gumball machine 동작 **/
    public void insertQuarter(){
        this.state.insertQuarter();
    }
    public void ejectQuarter(){
        this.state.ejectQuarter();
    }
    public void turnCrank(){
        this.state.turnCrank();
    }
    public void dispense(){
        this.state.dispense();
    }
    /** 상태에 위임된 Gumball machine 동작 **/

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if(gumCount > 0 ) this.gumCount -= 1;
    }

    public State getHasQuarterState() {
        return this.HAS_QUARTER;
    }

    public State getNoQuarterState() {
        return this.NO_QUARTER;
    }

    public State getSoldState() {
        return this.SOLD;
    }

    public State getSoldOutState() {
        return this.SOLD_OUT;
    }

    public State getWinnerState() {
        return this.WINNER_STATE;
    }
}
