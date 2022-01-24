package com.chandler.patterns.observer;

public interface Subject {

    void addObserver(Observer o);

    void notifyObservers();
}
