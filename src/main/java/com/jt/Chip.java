package com.jt;

import java.util.Scanner;

public class Chip extends Product{
    public static void displayAddChips() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add any Chips($1.50) to your order?");
        String addChip = scanner.nextLine();
        if (addChip.equalsIgnoreCase("yes")){
            System.out.println("Type the name of the Chip brand you would like.");
            String chip = scanner.nextLine();
        } else {
        }
    }

    private String chip;

    public Chip(String name, float price, int quantity) {
        super(name, price, quantity);
    }

    public String getChip() {return chip;}

    public void setChip(String chip) {this.chip = chip;}
}
