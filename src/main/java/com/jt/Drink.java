package com.jt;

public class Drink extends Product{
    private String brand;

    public Drink(float price, int quantity, String size, String brand) {
        super(price, quantity, size);
        this.brand = brand;
    }
}
