package com.jt;

public class Sandwich extends Product {

    public Sandwich(float price, int quantity, String size) {
        super(price, quantity, size);
    }

    @Override
    public void setPrice(float price) {
        if (getSize().contains("4")) {
            price += 5.50f;

        } else if (getSize().contains("8")) {
            price += 7.00f;
        } else if (getSize().contains("12")) {
            price += 8.50f;
        } else {
            System.out.println("Sorry. That is an invalid entry.");
        }
    }
}
