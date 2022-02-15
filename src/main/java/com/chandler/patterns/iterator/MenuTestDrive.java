package com.chandler.patterns.iterator;

import java.util.List;

public class MenuTestDrive {

    public static void main(String[] args) {
        var pancakeHouseMenu = new PancakeHouseMenu();
        var dinerMenu = new DinerMenu();
        var cafeMenu = new CafeMenu();

        var waitress = new Waitress(List.of(pancakeHouseMenu, dinerMenu, cafeMenu));
        waitress.printMenu();
    }
}
