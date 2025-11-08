package com.design_pattern.ex03_command.command;

import com.design_pattern.ex03_command.callee.Tv;

public class TvOffCommand implements Command{
    private Tv tv;
    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        this.tv.off();
    }

    @Override
    public void undo() {
        this.tv.on();
    }
}
