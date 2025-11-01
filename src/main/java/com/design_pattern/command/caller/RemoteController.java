package com.design_pattern.command.caller;

import com.design_pattern.command.command.Command;
import com.design_pattern.command.command.NoCommand;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteController() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        this.initCommand(this.onCommands, this.offCommands);
    }

    private void initCommand(Command[] onCommands, Command[] offCommands) {
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }
    public void offButtonWasPushed(int slot){
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPushed(){
        this.undoCommand.undo();
    }
}
