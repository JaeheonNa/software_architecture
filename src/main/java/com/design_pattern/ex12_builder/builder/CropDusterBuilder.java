package com.design_pattern.ex12_builder.builder;

public class CropDusterBuilder extends AirplaneBuilder{

    public CropDusterBuilder(String customer) {
        super.setCustomer(customer);
        super.setType("Crop Duster v3.4");
    }

    @Override
    public void buildWings() {
        super.getAirplane().setWingspan(9f);
    }

    @Override
    public void buildPowerplant() {
        super.getAirplane().setPowerplant("single piston");
    }

    @Override
    public void buildAvionics() {

    }

    @Override
    public void buildSeats() {
        super.getAirplane().setNumberSeats(1, 1);
    }
}
