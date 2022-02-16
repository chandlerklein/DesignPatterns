package com.chandler.patterns.composite;

public record Waitress(MenuComponent allMenus) {
    public void printMenu() {
        allMenus.print();
    }
}
