package com.jt;

import java.util.Scanner;

public class Menu {
    public static void addSandwich() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Sandwich Size
        System.out.println("What Size Sandwich would you like?" +
                "\nWe have 3 Sizes: 4in., 8in., and 12in. ");
        String size = scanner.nextLine();

        // Prompt user for Bread Type
        System.out.println("What type of bread would you like?" +
                "\nWe have white, wheat, rye, or a wrap. ");
        String bread = scanner.nextLine();

        // Prompt user for Toppings (Meat)

            System.out.println("Would you like to add any Meat?");
            String addMeat = scanner.nextLine();

            if (addMeat.equalsIgnoreCase("yes")) {
                String extraMeat = null;
                do {
                    System.out.println("What meat would you like to add?" +
                            "\nWe have: Steak, Ham, Salami, Roast Beef, Chicken, and Bacon.");
                    scanner.nextLine();

                    // Prompt user if they wish to add extra meat
                    System.out.println("Would you like to add extra meat?" +
                            "\n There will be an up charge.");
                    extraMeat= scanner.nextLine();
                } while (!extraMeat.equalsIgnoreCase("yes")); // Will loop back to meat question if "yes"

            } else { // Prompt user for Toppings (Cheese)
                System.out.println("Would you like to add Cheese?");
                String addCheese = scanner.nextLine();
                if (addCheese.equalsIgnoreCase("yes")) {
                    String extraCheese;
                    do {
                        System.out.println("What cheese would you like to add?" +
                                "\nWe have: American, Provolone, Cheddar, and Swiss. ");
                        String cheese = scanner.nextLine();

                        // Prompt user if they wish to add extra cheese
                        System.out.println("Would you like to add extra cheese?" +
                                "\n There will be an up charge.");
                        extraCheese = scanner.nextLine();
                    } while (!extraCheese.equalsIgnoreCase("yes"));

                } else {
                    System.out.println("What toppings would you like to add?");
                }
            }


    }

}
