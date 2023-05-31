package com.jt;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliDisplay {
    private Order order = new Order();
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

        // Prompt user for Sandwich Size
        String addExtraSandwich;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("What Size Sandwich would you like?");
            System.out.println("We have 3 Sizes: 4in.($5.50), 8in.($7.00), and 12in.($8.50)");
            String size = scanner.nextLine();
            while(!(size.equalsIgnoreCase("4") || size.equalsIgnoreCase("8")
                    || size.equalsIgnoreCase("12"))){
                System.out.println("Please Enter a Valid Size.");
            size = scanner.nextLine();
            }

            // Prompt Customer for Bread Type
            System.out.println("What Type Of Bread Would You Like?");
            System.out.println("We have White, Wheat, Rye, or a Wrap. ");
            String bread = scanner.nextLine();
            while(!(bread.equalsIgnoreCase("Wheat") || bread.equalsIgnoreCase("White")
                    || bread.equalsIgnoreCase("Wrap") || bread.equalsIgnoreCase("Rye"))){
                System.out.println("Please enter a valid Bread Type!");
                bread = scanner.nextLine();
            }


            // Prompt Customer for Meat Topping

            System.out.println("Would you like to add any Meat?");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                String extraMeat;
                do {
                    System.out.println("What meat would you like to add?" +
                            "\nWe have: Steak, Ham, Salami, Roast Beef, Chicken, and Bacon.");
                    String addMeat = scanner.nextLine();

                    // Prompt Customer to Add Extra Meat
                    System.out.println("Would you like to add extra meat?" +
                            "\n There will be an up charge.");
                    extraMeat = scanner.nextLine();

                } while (extraMeat.equalsIgnoreCase("yes"));

            } else { }// Prompt Customer for Toppings (Cheese)
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
            } else {
                System.out.println();
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
            }
            System.out.println("Would you like your sandwich toasted?");
            String toasted = scanner.nextLine();
// DONE DEAL - add to arraylist

            // Gives Customer Option to Build Another Sandwich;
            System.out.println("Would you like to add another Sandwich?");
            addExtraSandwich = scanner.nextLine();
            if (addExtraSandwich.equalsIgnoreCase("no")) {
                System.out.println("You have finished building a Sandwich.");
                displayOrderScreen();
            }
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
                System.out.println("What flavor would you like?");
                String drinkFlavor = scanner.nextLine();
                System.out.println("Would you like to add another Drink?");
                anotherDrink = scanner.nextLine();
                displayOrderScreen();
            } while (anotherDrink.equalsIgnoreCase("yes"));
            displayOrderScreen();

        }
    }
    public void displayAddChips() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add any Chips($1.50) to your order?");
        String addChip = scanner.nextLine();
        if (addChip.equalsIgnoreCase("yes")){
            System.out.println("Type the name of the Chip brand you would like.");
            String chip = scanner.nextLine();
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
                case "O":
                    confirmOrder();
                    break;
                case "X":
                    System.out.println("no");
                    break;
                default:
                    System.out.println("Invalid input, try again");
                    break;
            }

        } while (!checkoutInput.equalsIgnoreCase("X"));
    }

    public static void confirmOrder(){
//        String receiptData = "DELI-ICIOUS Sandwiches" + "\n" +
//                "*******************************************" +
//                size +
//
//        return receiptData;

    }
}