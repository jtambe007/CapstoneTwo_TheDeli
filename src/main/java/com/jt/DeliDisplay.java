package com.jt;

import java.util.Scanner;

public class DeliDisplay {
    static Scanner scanner = new Scanner(System.in);
    public void displayHomeScreen() {
        int userInput;

        do {
            System.out.println("1. New Order");
            System.out.println("2. Exit");
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    displayOrderScreen();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid command, try again");

            }

        } while (userInput == 0);

    }
    public void displayOrderScreen() {

        int subInput;

        do {
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");
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
                    System.out.println("Invalid command, try again");
            }

        } while (subInput == 0);

    }
    public void displayAddSandwich() {
        // Insert scanner prompt here.
    }
    public void displayAddDrink() {
        // Select drink size and flavor.
    }
    public void displayAddChips() {
        // Select chip type.
    }
    public void displayCheckout() {
        //  Confirm or Cancel order here.
    }

}
