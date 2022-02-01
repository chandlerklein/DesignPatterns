package com.chandler.patterns.command;

public class Light {
    String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " light is on");
    }

    public void off() {
        System.out.println(room + " light is off");
    }
}
