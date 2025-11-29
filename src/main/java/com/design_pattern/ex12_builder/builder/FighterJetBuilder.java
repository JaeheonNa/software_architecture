package com.design_pattern.ex12_builder.builder;

public class FighterJetBuilder extends AirplaneBuilder {

    public FighterJetBuilder(String customer){
        super.setCustomer(customer);
        super.setType("F-35 Lightning II");
    }

    @Override
    public void buildWings() {
        super.getAirplane().setWingspan(35.0f);
    }

    @Override
    public void buildPowerplant() {
        super.getAirplane().setPowerplant("dual thrust vectoring");
    }

    @Override
    public void buildAvionics() {
        super.getAirplane().setAvionics("military");
    }

    @Override
    public void buildSeats() {
        super.getAirplane().setNumberSeats(1, 0);
    }
}
