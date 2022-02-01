package com.chandler.patterns.command;

public class RemoteLoader {

    public static void main(String[] args) {
        var remoteControl = new RemoteControl();

        var livingRoomLight = new Light("Living Room");
        var kitchenLight = new Light("Kitchen");
        var ceilingFan = new CeilingFan("Living Room");
        var stereo = new Stereo("Bedroom");

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(2, ceilingFan::on, ceilingFan::off);
        remoteControl.setCommand(3, stereo::on, stereo::off);

        System.out.println(remoteControl);
        for (int i = 0; i < 4; i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }
    }
}
