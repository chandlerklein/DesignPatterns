package com.chandler.patterns.command;

import com.chandler.patterns.command.garage.GarageDoor;
import com.chandler.patterns.command.garage.GarageDoorOpenCommand;
import com.chandler.patterns.command.light.Light;
import com.chandler.patterns.command.light.LightCommand;

public class RemoteControlTest {

    public static void main(String[] args) {
        var remote = new SimpleRemoteControl();
        var light = new Light();
        var garageDoor = new GarageDoor();
        var lightOn = new LightCommand(light);
        var garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
