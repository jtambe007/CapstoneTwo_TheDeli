package com.jt;

public class Drink extends Product {
    private String brand;

    public Drink(float price, int quantity, String size, String brand) {
        super(price, quantity, size);
        this.brand = brand;
    }

    @Override
    public void setPrice(float price) {
        if (getSize().equalsIgnoreCase("small")) {
            price = 2.00f;
        } else if (getSize().equalsIgnoreCase("medium")) {
            price = 2.50f;
        } else if (getSize().equalsIgnoreCase("large")) {
            price = 3.00f;
        } else {
            System.out.println("Sorry. That is an invalid entry.");
        }
    }
}
