package com.jt;

public class Chip extends Product {
    private String name;

    public Chip(int quantity, String name) {
        super(1.50f, quantity);
        this.name = name;
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