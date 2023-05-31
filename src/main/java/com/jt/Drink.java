package com.jt;

import java.util.Scanner;

public class Drink extends Product{
    public static void displayAddDrink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add a Drink to your order?");
        String addDrink = scanner.nextLine();
        if (addDrink.equalsIgnoreCase("yes")) {
            String anotherDrink;
            do {
                System.out.println("What size drink would you like?" +
                        "\nWe have 3 Sizes: Small ($2), Medium ($2.50), Large ($3)");
                String drinkSize = scanner.nextLine();
                System.out.println("Would you like to add another Drink?");
                anotherDrink = scanner.nextLine();
            } while (anotherDrink.equalsIgnoreCase("yes"));
        } else {
            Chip.displayAddChips();
        }
    }
    private String brand;

    public Drink(String name, float price, int quantity, String size, String brand) {
        super(name, price, quantity, size);
        this.brand = brand;
    }
}
