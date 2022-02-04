package com.chandler.patterns.command;

public class MacroCommandLoader {

    public static void main(String[] args) {
        var light = new Light("Living Room");

        var lightOn = new LightOnCommand(light);
        var lightOff = new LightOffCommand(light);

        Command[] lightMacro = { lightOn, lightOff };

        var macroCommand = new MacroCommand(lightMacro);

        var remoteControl = new RemoteControl();
        remoteControl.setCommand(0, macroCommand, macroCommand);
    }
}
