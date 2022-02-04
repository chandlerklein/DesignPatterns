package com.chandler.patterns.command;

import static com.chandler.patterns.command.CeilingFan.HIGH;
import static com.chandler.patterns.command.CeilingFan.LOW;
import static com.chandler.patterns.command.CeilingFan.MEDIUM;
import static com.chandler.patterns.command.CeilingFan.OFF;

public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
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
