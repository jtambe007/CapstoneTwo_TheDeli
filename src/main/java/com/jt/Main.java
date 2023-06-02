package com.jt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main homeScreen = new Main();
        homeScreen.displayHomeScreen();
    }

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
        DeliDisplay deliDisplay = new DeliDisplay();

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
                case 1 -> deliDisplay.displayAddSandwich();
                case 2 -> deliDisplay.displayAddDrink();
                case 3 -> deliDisplay.displayAddChips();
                case 4 -> displayCheckout();
                case 0 -> displayHomeScreen();
                default -> System.out.println("Invalid input, try again");
            }

        } while (subInput == 0);
    }


    public void displayCheckout() {
        Scanner scanner = new Scanner(System.in);
        String checkoutInput;

            System.out.println("╔══════════════════╗");
            System.out.println("║     Checkout     ║");
            System.out.println("╠══════════════════╣");
            System.out.println("║ C. Confirm Order ║");
            System.out.println("║ X. Cancel Order  ║");
            System.out.println("╚══════════════════╝");
            checkoutInput = scanner.nextLine();
            checkoutInput = checkoutInput.toUpperCase();

            switch (checkoutInput) {
                case "C" -> {
                    System.out.println("Is your order correct?");
                    System.out.println("DELI-CIOUS Sandwiches" + "\n" +
                            "*******************************************" + "\n"  + Order.getProductList());
                    System.out.println("Type Y for yes, N for no");
                    String confirmIput = scanner.nextLine();
                    if (confirmIput.equalsIgnoreCase("Y")){
                        System.out.println("Thank you for placing your order. Your meal will be ready shortly!");
                        displayHomeScreen();
                    } else if (confirmIput.equalsIgnoreCase("N")){
                        System.out.println("Sorry. Please re-do your order");
                        displayOrderScreen();
                    } else {
                        System.out.println("Invalid input");
                    }
                }
                case "X" -> System.out.println("Canceling order...");

                default -> System.out.println("Invalid input, try again");
            }
    }


}