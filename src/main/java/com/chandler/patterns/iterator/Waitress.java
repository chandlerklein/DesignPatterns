package com.chandler.patterns.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    private final List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        var menuIterator = menus.iterator();
        menuIterator.forEachRemaining(menu -> printMenu(menu.createIterator()));
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.print(item.name() + ", " + item.price() + " -- ");
            System.out.println(item.description());
        }

    }
}
