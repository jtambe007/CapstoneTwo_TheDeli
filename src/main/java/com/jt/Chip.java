package com.jt;

public class Chip extends Product {
    private String name;

    public Chip(float price, int quantity, String name) {
        super(price, quantity);
        this.name = name;
        this.setPrice(1.50f);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chip Qty:" + getQuantity() + " " +
                getName() + " $" + getPrice();
    }
}
