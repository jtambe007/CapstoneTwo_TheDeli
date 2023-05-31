package com.jt;

import java.util.Scanner;

public class Sandwich extends Product{
    public static void displayAddSandwich() {

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

    public Sandwich(String name, float price, int quantity, String size) {
        super(name, price, quantity, size);
    }
}
