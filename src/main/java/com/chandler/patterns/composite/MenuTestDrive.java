package com.chandler.patterns.composite;

import java.util.List;

public class MenuTestDrive {

    public static void main(String[] args) {
        var pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        var dinerMenu = new Menu("DINER MENU", "Lunch");
        var cafeMenu = new Menu("CAFE MENU", "Dinner");
        var dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.addAll(List.of(pancakeHouseMenu, dinerMenu, cafeMenu, dessertMenu));

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti w/ Marinara sauce",
                true,
                3.89
        ));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple pie",
                "Apple pie with flakey crust",
                true,
                1.99
        ));

        var waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
