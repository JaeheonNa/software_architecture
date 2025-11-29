package com.design_pattern.ex12_builder.director;

import com.design_pattern.ex12_builder.product.Airplane;
import com.design_pattern.ex12_builder.builder.AirplaneBuilder;

public class AerospaceEngineer {
    private AirplaneBuilder airplaneBuilder;
    public void setAirplaneBuilder(AirplaneBuilder airplaneBuilder){
        this.airplaneBuilder = airplaneBuilder;
    }

    public Airplane getAirplane() {
        return airplaneBuilder.getAirplane();
    }

    public void constructAirplane(){
        airplaneBuilder.createNewAirplane();
        airplaneBuilder.buildWings();
        airplaneBuilder.buildPowerplant();
        airplaneBuilder.buildAvionics();
        airplaneBuilder.buildSeats();
    }

}
