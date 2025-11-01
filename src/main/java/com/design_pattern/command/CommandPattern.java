package com.design_pattern.command;

import com.design_pattern.command.callee.Light;
import com.design_pattern.command.callee.Tv;
import com.design_pattern.command.caller.RemoteController;
import com.design_pattern.command.command.*;

public class CommandPattern {
    public static void main(String[] args){
        RemoteController remoteController = new RemoteController();

        Light livingRoomLightLight = new Light("Kitchen");
        Command livingRoomLightOnCommand = new LightOnCommand(livingRoomLightLight);
        Command livingRoomLightOffCommand = new LightOffCommand(livingRoomLightLight);
        remoteController.setCommands(0, livingRoomLightOnCommand, livingRoomLightOffCommand);

        Light kitchenLight = new Light("LivingRoom");
        Command kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        Command kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        remoteController.setCommands(1, kitchenLightOnCommand, kitchenLightOffCommand);

        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();

        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButtonWasPushed();

        System.out.println();

        Tv livingRoomTv = new Tv("LivingRoom");
        Command livingRoomTvOnCommand = new TvOnCommand(livingRoomTv);
        Command livingRoomTvOffCommand = new TvOffCommand(livingRoomTv);
        remoteController.setCommands(2, livingRoomTvOnCommand, livingRoomTvOffCommand);

        Tv bedRoomTv = new Tv("BedRoom");
        Command tvRoomTvOnCommand = new TvOnCommand(bedRoomTv);
        Command tvRoomTvOffCommand = new TvOffCommand(bedRoomTv);
        remoteController.setCommands(3, tvRoomTvOnCommand, tvRoomTvOffCommand);

        remoteController.onButtonWasPushed(2);
        remoteController.offButtonWasPushed(2);
        remoteController.undoButtonWasPushed();

        remoteController.onButtonWasPushed(3);
        remoteController.offButtonWasPushed(3);
        remoteController.undoButtonWasPushed();

    }
}
