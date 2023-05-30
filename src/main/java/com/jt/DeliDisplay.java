package com.jt;

import java.util.Scanner;

public class DeliDisplay {
    static Scanner scanner = new Scanner(System.in);
    public void displayHomeScreen() {
        int userInput;

        do {
            System.out.println("╔══════════════════╗");
            System.out.println("║    DELI-CIOUS    ║");
            System.out.println("║    sandwiches    ║");
            System.out.println("╠══════════════════╣");
            System.out.println("║ 1. New Order     ║");
            System.out.println("║ 2. Exit          ║");
            System.out.println("╚══════════════════╝");

            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    displayOrderScreen();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input, try again");

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
                case 1:
                    displayAddSandwich();
                    break;
                case 2:
                    displayAddDrink();
                    break;
                case 3:
                    displayAddChips();
                    break;
                case 4:
                    displayCheckout();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid input, try again");
            }

        } while (subInput == 0);

    }
    public void displayAddSandwich() {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for Sandwich Size
        String addExtraSandwich;
        do {
            System.out.println("What Size Sandwich would you like?" +
                    "\nWe have 3 Sizes: 4in.($5.50), 8in.($7.00), and 12in.($8.50) ");
            String size = scanner.nextLine();

            // Prompt Customer for Bread Type
            System.out.println("What type of bread would you like?" +
                    "\nWe have white, wheat, rye, or a wrap. ");
            String bread = scanner.nextLine();

            // Prompt Customer for Meat Topping

            System.out.println("Would you like to add any Meat?");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                String extraMeat = null;
                do {
                    System.out.println("What meat would you like to add?" +
                            "\nWe have: Steak, Ham, Salami, Roast Beef, Chicken, and Bacon.");
                    String addMeat = scanner.nextLine();

                    // Prompt Customer to Add Extra Meat
                    System.out.println("Would you like to add extra meat?" +
                            "\n There will be an up charge.");
                    extraMeat = scanner.nextLine();
                } while (extraMeat.equalsIgnoreCase("yes")); // Will loop back to meat question if "yes"
                // FIX : extraMeat = no  It needs to ask for cheese next, not toppings.
            } else { // Prompt Customer for Toppings (Cheese)
                System.out.println("Would you like to add Cheese?");
                String addCheese = scanner.nextLine();
                if (addCheese.equalsIgnoreCase("yes")) {
                    String extraCheese;
                    do {
                        System.out.println("What cheese would you like to add?" +
                                "\nWe have: American, Provolone, Cheddar, and Swiss. ");
                        String cheese = scanner.nextLine();

                        // Prompt Customer to Add Extra Cheese
                        System.out.println("Would you like to add extra cheese?" +
                                "\n There will be an up charge.");
                        extraCheese = scanner.nextLine();
                    } while (extraCheese.equalsIgnoreCase("yes"));

                    //Fixed extras loop, but need them to loop to the next topping if no extras.
                } else {
                    System.out.println("What toppings would you like to add?");
                }
            }
            // Prompt Customer for Regular Toppings
            System.out.println("What toppings would you like to add? We have: ");
            System.out.println("Lettuce, Peppers, Onions, Tomatoes, Jalapenos" +
                    "\nCucumbers, Pickles, Guacamole, and Mushrooms.");
            String toppings = scanner.nextLine();

            System.out.println("Would you like to add any Sauces?");
            String addSauce = scanner.nextLine();
            if (addSauce.equalsIgnoreCase("yes")) {
                System.out.println("What Sauces would you like to add? We have:" +
                        "\n Mayo, Mustard, Ketchup, Ranch, Au Jus," +
                        "\n Thousand Island, and Vinaigrette.");
                String sauce = scanner.nextLine();
            } else {
                System.out.println("Would you like your sandwich toasted?");
                String toasted = scanner.nextLine();
            }
            System.out.println("Would you like your sandwich toasted?"); // figure out how to dry
            String toasted = scanner.nextLine(); // fix later  // if no, it repeats the question, fix it
            System.out.println("You have finished building a Sandwich.");

            // Gives Customer Option to Build Another Sandwich;
            System.out.println("Would you like to add another Sandwich?");
            addExtraSandwich = scanner.nextLine();
            if (addExtraSandwich.equalsIgnoreCase("no"));
        } while (addExtraSandwich.equalsIgnoreCase("yes"));

    }
    public void displayAddDrink() {
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
            displayAddChips();
        }
    }
    public void displayAddChips() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add any Chips($1.50) to your order?");
        String addChip = scanner.nextLine();
        if (addChip.equalsIgnoreCase("yes")){
            System.out.println("Type the name of the Chip brand you would like.");
            String chip = scanner.nextLine();
        } else {

        }
    }
    public void displayCheckout() {

        String checkoutInput;

        do {
            System.out.println("╔══════════════════╗");
            System.out.println("║     Checkout     ║");
            System.out.println("╠══════════════════╣");
            System.out.println("║ O. Confirm Order ║");
            System.out.println("║ X. Cancel Order  ║");
            System.out.println("╚══════════════════╝");
            checkoutInput = scanner.nextLine();

            switch (checkoutInput) {
                case "O":
                    break;
                case "X":
                    break;
                default:
                    System.out.println("Invalid input, try again");
                    break;
            }

        } while (!checkoutInput.equalsIgnoreCase("X"));
    }

}