package com.chandler.patterns.command.light;

import com.chandler.patterns.command.Command;

public record LightCommand(Light light) implements Command {

    @Override
    public void execute() {
        light.on();
    }
}
