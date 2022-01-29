package com.chandler.patterns.singleton;

public class SingletonClassic {

    private static SingletonClassic uniqueInstance;

    private SingletonClassic() {}

    public static synchronized SingletonClassic getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonClassic();
        }
        return uniqueInstance;
    }
}
