package com.jt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DeliDisplay {
    private Order order = new Order();
    Main orderMenu = new Main();

    public void displayAddSandwich() {

        String addExtraSandwich;
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Sandwich Size
        do {
            System.out.println("""
            What Size Sandwich would you like?
            We have 3 Sizes:  4in.($5.50),
                              8in.($7.00)
                              12in.($8.50)
                 Enter 4, 8, or 12 to Choose. """);
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

            String addMeat = new String();
            String extraMeat = new String();
            if (answer.equalsIgnoreCase("yes")){
                do {
                    System.out.println("""
                            What meat would you like to add?
                            We have: Steak, Chicken, Salami, 
                                     Roast Beef, Ham, and Bacon.""");

                        addMeat = scanner.nextLine();
                    while(!(addMeat.equalsIgnoreCase("Steak") || addMeat.equalsIgnoreCase("Ham")
                            || addMeat.equalsIgnoreCase("Salami") || addMeat.equalsIgnoreCase("Roast Beef")
                            || addMeat.equalsIgnoreCase("Chicken") || addMeat.equalsIgnoreCase("Bacon"))) {
                        System.out.println("Please enter a valid meat type");
                        addMeat = scanner.nextLine();
                    }

                    // Prompt Customer to Add Extra Meat
                    System.out.println("""
                            Would you like to add extra meat?" 
                            There will be an up charge.""");
                    extraMeat = scanner.nextLine();
                } while (extraMeat.equalsIgnoreCase("yes"));
            }


            // Prompt Customer for Toppings (Cheese)
            System.out.println("Would you like to add Cheese?");
            String addCheese = scanner.nextLine();
            String extraCheese = new String();
            String cheese = new String();
            if (addCheese.equalsIgnoreCase("yes")) {
                do {
                    System.out.println("""
                            What cheese would you like to add?
                            We have: American, Provolone, 
                                     Cheddar, and Swiss. """);
                    cheese = scanner.nextLine();
                    while (!(cheese.equalsIgnoreCase("American") || cheese.equalsIgnoreCase("Provolone")
                            || cheese.equalsIgnoreCase("Cheddar") || cheese.equalsIgnoreCase("Swiss"))) {
                        System.out.println("Please enter a valid Cheese Type!");
                        cheese = scanner.nextLine();
                    }

                    // Prompt Customer to Add Extra Cheese
                    System.out.println("""
                             Would you like to add extra cheese?
                             There will be an up charge. """);
                    extraCheese = scanner.nextLine();
                } while (extraCheese.equalsIgnoreCase("yes"));{
                    extraCheese = scanner.nextLine();}
            }


            // Prompt Customer for Regular Toppings
            System.out.println("""
            What toppings would you like to add? We have: 
            Lettuce, Peppers, Onions, Tomatoes, Jalapenos,
            Cucumbers, Pickles, Guacamole, and Mushrooms. """);
            String toppings = scanner.nextLine();
            ArrayList<String> toppingList = new ArrayList<>();
            if (toppings.contains(",")) {
                toppingList.addAll(Arrays.asList(toppings.split(",", 0)));
            }

            // Prompts Customer to add Sauces
            System.out.println("Would you like to add any Sauces?");
            String addSauce = scanner.nextLine();
            String sauce = null;
            if (addSauce.equalsIgnoreCase("yes")) {
                System.out.println("""
                        What Sauces would you like to add? We have:
                        Mayo, Mustard, Ketchup, Ranch, Au Jus,
                        Thousand Island, and Vinaigrette.""");
                sauce = scanner.nextLine();
                while(!(sauce.equalsIgnoreCase("Mayo") || sauce.equalsIgnoreCase("Mustard")
                        || sauce.equalsIgnoreCase("Ketchup") || sauce.equalsIgnoreCase("Ranch")
                        || sauce.equalsIgnoreCase("Au Jus") || sauce.equalsIgnoreCase("Thousand Island")
                        || sauce.equalsIgnoreCase("Vinaigrette"))){
                    System.out.println("Please enter a valid sauce type!");
                    sauce = scanner.nextLine();
                }
            }
            System.out.println("Would you like your sandwich toasted?");
            String toasted = scanner.nextLine();

// DONE DEAL - add Sandwich to productList
            Product sandwich = new Sandwich(1, size, bread, addMeat, extraMeat, cheese,
                    extraCheese,
                    toppingList,
                    sauce, toasted);
            order.addProduct(sandwich);

            // Gives Customer Option to Build Another Sandwich;
            System.out.println("Would you like to add another Sandwich?");
            addExtraSandwich = scanner.nextLine();
            if (addExtraSandwich.equalsIgnoreCase("no")) {
                System.out.println("You have finished building a Sandwich.");
                System.out.println();
                System.out.println(order);
                orderMenu.displayOrderScreen();
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
                System.out.println("You have added 1 " + drinkSize + " " + drinkFlavor + " to your Order.");

                // Gives customer option to add another Drink
                System.out.println("Would you like to add another Drink?");
                anotherDrink = scanner.nextLine();
                orderMenu.displayOrderScreen();
            } while (!anotherDrink.equalsIgnoreCase("yes"));
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
            orderMenu.displayOrderScreen();
        } else {
            orderMenu.displayOrderScreen();
        }
    }


}
