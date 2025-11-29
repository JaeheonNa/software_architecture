package com.design_pattern.ex12_builder.builder;

import com.design_pattern.ex12_builder.product.Airplane;

public abstract class AirplaneBuilder {

    private Airplane airplane;
    private String customer;
    private String type;

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setType(String type){
        this.type = type;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public void createNewAirplane() {
        this.airplane = new Airplane(this.customer, this.type);
    }

    public abstract void buildWings();
    public abstract void buildPowerplant();
    public abstract void buildAvionics();
    public abstract void buildSeats();
}
