package com.chandler.patterns.command;

public class NoOpCommand implements Command {

    @Override
    public void execute() {
        // do nothing
    }
}
