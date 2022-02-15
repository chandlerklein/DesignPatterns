package com.chandler.patterns.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    private final Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Veggie Burger", "Veggie burger on a whole weat bun", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day", false, 3.69);
        addItem("Burrito", "A large burrito", true, 4.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        var menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
