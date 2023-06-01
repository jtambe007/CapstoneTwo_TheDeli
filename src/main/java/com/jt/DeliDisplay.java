package com.jt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DeliDisplay {
    private static final Order order = new Order();
    static Scanner scanner = new Scanner(System.in);
    public void displayHomeScreen() {
        int userInput;

        do {
            System.out.println("╔══════════════════╗");
            System.out.println("║    DELI-CIOUS    ║");
            System.out.println("║    Sandwiches    ║");
            System.out.println("╠══════════════════╣");
            System.out.println("║ 1. New Order     ║");
            System.out.println("║ 2. Exit          ║");
            System.out.println("╚══════════════════╝");

            userInput = scanner.nextInt();

            switch (userInput) {
                case 1 -> displayOrderScreen();
                case 2 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid input, try again");
            }

        } while (userInput == 0);

    }
    public void displayOrderScreen() {

        int subInput;

        do {
            System.out.println("╔══════════════════╗");
            System.out.println("║ Build your Order ║");
            System.out.println("╠══════════════════╣");
            System.out.println("║ 1. Add Sandwich  ║");
            System.out.println("║ 2. Add Drink     ║");
            System.out.println("║ 3. Add Chips     ║");
            System.out.println("║ 4. Checkout      ║");
            System.out.println("║ 0. Cancel Order  ║");
            System.out.println("╚══════════════════╝");
            subInput = scanner.nextInt();

            switch (subInput) {
                case 1 -> displayAddSandwich();
                case 2 -> displayAddDrink();
                case 3 -> displayAddChips();
                case 4 -> displayCheckout();
                case 0 -> displayHomeScreen();
                default -> System.out.println("Invalid input, try again");
            }

        } while (subInput == 0);

    }
    public void displayAddSandwich() {

        // Prompt user for Sandwich Size
        String addExtraSandwich;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("What Size Sandwich would you like?");
            System.out.println("We have 3 Sizes: 4in.($5.50), 8in.($7.00), and 12in.($8.50)");
            int size = scanner.nextInt();
            while (!(size == 4 || size ==8 || size == 12)) {
                System.out.println("Please enter a valid value!");
                size = scanner.nextInt();
            }

            // Prompt Customer for Bread Type
            System.out.println("What Type Of Bread Would You Like?");
            System.out.println("We have White, Wheat, Rye, or a Wrap. ");
            String bread = scanner.nextLine();
            while (!(bread.equalsIgnoreCase("Wheat") || bread.equalsIgnoreCase("White")
                    || bread.equalsIgnoreCase("Wrap") || bread.equalsIgnoreCase("Rye"))) {
                System.out.println("Please enter a valid Bread Type!");
                bread = scanner.nextLine();
            }


            // Prompt Customer for Meat Topping

            System.out.println("Would you like to add any Meat?");
            String answer = scanner.nextLine();

            String addMeat = null;
            String extraMeat = null;
            if (answer.equalsIgnoreCase("yes")) {
                do {
                    System.out.println("What meat would you like to add?" +
                            "\nWe have: Steak, Ham, Salami, Roast Beef, Chicken, and Bacon.");
                    addMeat = scanner.nextLine();

                    // Prompt Customer to Add Extra Meat
                    System.out.println("Would you like to add extra meat?" +
                            "\n There will be an up charge.");
                    extraMeat = scanner.nextLine();

                } while (extraMeat.equalsIgnoreCase("yes"));

            }  // Prompt Customer for Toppings (Cheese)

            System.out.println("Would you like to add Cheese?");
            String addCheese = scanner.nextLine();
            String cheese = null;
            String extraCheese = null;
            if (addCheese.equalsIgnoreCase("yes")) {
                do {
                    System.out.println("What cheese would you like to add?" +
                            "\nWe have: American, Provolone, Cheddar, and Swiss. ");
                    cheese = scanner.nextLine();

                    // Prompt Customer to Add Extra Cheese
                    System.out.println("Would you like to add extra cheese?" +
                            "\n There will be an up charge.");
                    extraCheese = scanner.nextLine();
                } while (extraCheese.equalsIgnoreCase("yes"));
            } else {
                System.out.println();
            }

            // Prompt Customer for Regular Toppings
            System.out.println("What toppings would you like to add? We have: ");
            System.out.println("Lettuce, Peppers, Onions, Tomatoes, Jalapenos" +
                    "\nCucumbers, Pickles, Guacamole, and Mushrooms.");
            String toppings = scanner.nextLine();
            ArrayList<String> toppingList = new ArrayList<>();
            if (toppings.contains(",")) {
                toppingList.addAll(Arrays.asList(toppings.split(",", 0)));
            }

            System.out.println("Would you like to add any Sauces?");
            String addSauce = scanner.nextLine();
            String sauce = null;
            if (addSauce.equalsIgnoreCase("yes")) {
                System.out.println("""
                        What Sauces would you like to add? We have:
                        Mayo, Mustard, Ketchup, Ranch, Au Jus,
                        Thousand Island, and Vinaigrette.""");
                sauce = scanner.nextLine();
            }
            System.out.println("Would you like your sandwich toasted?");
            String toasted = scanner.nextLine();

// DONE DEAL - add to arraylist
            Product sandwich = new Sandwich(1, size, bread, addMeat, extraMeat, cheese,
                    extraCheese,
                    toppingList,
                    sauce, toasted);
            order.addProduct(sandwich);
            System.out.print(order);

            // Gives Customer Option to Build Another Sandwich;
            System.out.println("Would you like to add another Sandwich?");
            addExtraSandwich = scanner.nextLine();
            if (addExtraSandwich.equalsIgnoreCase("no")) {
                System.out.println("You have finished building a Sandwich.");
                System.out.println(order);
                displayOrderScreen();
            }
            Product nextSandwich = new Sandwich(1, size, bread, addMeat, extraMeat, cheese,
                    extraCheese,
                    toppingList,
                    sauce, toasted);
            order.addProduct(nextSandwich);
            System.out.print(order);
        } while (addExtraSandwich.equalsIgnoreCase("yes"));


    }
    public void displayAddDrink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add a Drink to your order?");
        String addDrink = scanner.nextLine();
        if (addDrink.equalsIgnoreCase("yes")) {
            String anotherDrink;
            do {
                System.out.println("""
                        What size drink would you like?
                        We have 3 Sizes: 1:Small ($2), 2:Medium ($2.50), 3:Large ($3)
                        To Choose Size Input: 1, 2, or 3""");
                int drinkOption = scanner.nextInt();

                System.out.println("What flavor would you like?");
                String drinkFlavor = scanner.nextLine();
                String drinkSize = null;

                if(drinkOption == 1){ // option for Sm. Drink
                    drinkSize = "Small";
                } else if(drinkOption == 2){ // option for Med. Drink
                    drinkSize = "Medium";
                } else if(drinkOption == 3){ // option for Lrg. Drink
                    drinkSize = "Large";
                }

                // adds Drink to ArrayList
                Product drink = new Drink(1, "", "");
                order.addProduct(drink);
                System.out.println(drink);

                // Gives customer option to add another Drink
                System.out.println("Would you like to add another Drink?");
                anotherDrink = scanner.nextLine();
                displayOrderScreen();
                Product nextDrink = new Drink(1, "", "");
                order.addProduct(nextDrink);
                System.out.println(nextDrink);
            } while (anotherDrink.equalsIgnoreCase("yes"));
        }
    }
    public void displayAddChips() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add any Chips($1.50) to your order?");
        String addChip = scanner.nextLine();
        if (addChip.equalsIgnoreCase("yes")){
            System.out.println("Type the name of the Chip brand you would like.");
            String chipName = scanner.nextLine();
            System.out.println("You have added " + chipName + " to your order.");

            // adds Chips to arrayList
            Product chip = new Chip(1, chipName);
            order.addProduct(chip);
            System.out.println(chip);

            System.out.println();
            displayOrderScreen();
        } else {
            displayOrderScreen();
        }
    }
    public void displayCheckout() {
        Scanner scanner = new Scanner(System.in);
        String checkoutInput;

        do {
            System.out.println("╔══════════════════╗");
            System.out.println("║     Checkout     ║");
            System.out.println("╠══════════════════╣");
            System.out.println("║ O. Confirm Order ║");
            System.out.println("║ X. Cancel Order  ║");
            System.out.println("╚══════════════════╝");
            checkoutInput = scanner.nextLine();
            checkoutInput = checkoutInput.toUpperCase();

            switch (checkoutInput) {
                case "O" -> {
                    ReceiptFileManager receiptFileManager = new ReceiptFileManager();
//                    receiptFileManager.writeReceiptToFile();
                    System.out.println("DELI-CIOUS Sandwiches" + "\n" +
                            "*******************************************" + "\n"  + Order.getProductList());
                    break;
                }
                case "X" -> {
                    System.out.println("Canceling order...");
                    break;
                }
                default -> System.out.println("Invalid input, try again");
            }

        } while (!checkoutInput.equalsIgnoreCase("X"));
    }

}