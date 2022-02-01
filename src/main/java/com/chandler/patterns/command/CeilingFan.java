package com.chandler.patterns.command;

public class CeilingFan {
    String room;

    public CeilingFan(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " ceiling fan is on high");
    }

    public void off() {
        System.out.println(room + " ceiling fan is off");
    }
}
