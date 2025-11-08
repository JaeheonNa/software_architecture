package com.design_pattern.ex03_command.command;

import com.design_pattern.ex03_command.callee.Light;

public class LightOffCommand implements Command{
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
