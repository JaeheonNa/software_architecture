package com.design_pattern.ex12_builder;

import com.design_pattern.ex12_builder.builder.FighterJetBuilder;
import com.design_pattern.ex12_builder.builder.AirplaneBuilder;
import com.design_pattern.ex12_builder.builder.CropDusterBuilder;
import com.design_pattern.ex12_builder.director.AerospaceEngineer;
import com.design_pattern.ex12_builder.product.Airplane;

public class Builder {
    public static void main(String[] agrs){
        AerospaceEngineer engineer = new AerospaceEngineer();

        AirplaneBuilder cropDusterBuilder = new CropDusterBuilder("Farmer Joe");
        AirplaneBuilder fighterJetBuilder = new FighterJetBuilder("The Navy");

        engineer.setAirplaneBuilder(cropDusterBuilder);
        engineer.constructAirplane();
        Airplane cropDuster = engineer.getAirplane();
        System.out.println(cropDuster.getType() +
                " is completed and ready for delivery to " +
                cropDuster.getCustomer());

        engineer.setAirplaneBuilder(fighterJetBuilder);
        engineer.constructAirplane();
        Airplane f35 = engineer.getAirplane();
        System.out.println(f35.getType() +
                " is completed and ready for delivery to " +
                f35.getCustomer());
    }
}
