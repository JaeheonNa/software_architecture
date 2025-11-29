package com.design_pattern.ex12_builder.product;

public class Airplane {

    private String type;
    private float wingspan;
    private String powerplant;
    private int crewSeats;
    private int passengerSeats;
    private String avionics;
    private String customer;

    public Airplane(String customer, String type) {
        this.customer = customer;
        this.type = type;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }

    public void setPowerplant(String powerplant) {
        this.powerplant = powerplant;
    }

    public void setNumberSeats(int crewSeats, int passengerSeats) {
        this.crewSeats = crewSeats;
        this.passengerSeats = passengerSeats;
    }

    public void setAvionics(String avionics) {
        this.avionics = avionics;
    }

    public String getType() {
        return type;
    }

    public String getCustomer() {
        return customer;
    }
}
