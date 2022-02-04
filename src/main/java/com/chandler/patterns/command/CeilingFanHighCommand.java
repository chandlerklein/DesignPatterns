package com.chandler.patterns.command;

import static com.chandler.patterns.command.CeilingFan.HIGH;
import static com.chandler.patterns.command.CeilingFan.LOW;
import static com.chandler.patterns.command.CeilingFan.MEDIUM;
import static com.chandler.patterns.command.CeilingFan.OFF;

public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case HIGH -> ceilingFan.high();
            case MEDIUM -> ceilingFan.medium();
            case LOW -> ceilingFan.low();
            case OFF -> ceilingFan.off();
            default -> { /* do nothing */ }
        }

    }
}
