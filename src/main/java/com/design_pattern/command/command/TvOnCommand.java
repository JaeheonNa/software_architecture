package com.design_pattern.command.command;

import com.design_pattern.command.callee.Tv;

public class TvOnCommand implements Command{
    private Tv tv;
    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        this.tv.on();
    }

    @Override
    public void undo() {
        this.tv.off();
    }
}
