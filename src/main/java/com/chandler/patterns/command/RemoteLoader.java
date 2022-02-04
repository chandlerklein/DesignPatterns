package com.chandler.patterns.command;

public class RemoteLoader {

    public static void main(String[] args) {
        var remoteControl = new RemoteControl();

        var ceilingFan = new CeilingFan("Living Room");

        var ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        var ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        var ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
