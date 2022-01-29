package com.chandler.patterns.singleton;

public class SingletonClient {

    public static void main(String[] args) {
        SingletonClassic singletonClassic = SingletonClassic.getInstance();
        SingletonEnum singletonEnum = SingletonEnum.UNIQUE_INSTANCE;
    }
}
