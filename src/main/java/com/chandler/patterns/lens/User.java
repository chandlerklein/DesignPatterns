package com.chandler.patterns.lens;

public class User {

    public final String name;

    public User(String name) {
        this.name = name;
    }

    public User withName(String name) {
        return new User(name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
