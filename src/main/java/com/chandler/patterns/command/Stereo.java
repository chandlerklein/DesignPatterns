package com.chandler.patterns.command;

public class Stereo {
    String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " stereo is on");
    }

    public void setCD() {
        System.out.println(room + " stereo is set to CD input");
    }

    public void setVolume(int volumeLevel) {
        System.out.println(room + " stereo volume level is set to " + volumeLevel);
    }

    public void off() {
        System.out.println(room + " stereo is off");
    }
}
