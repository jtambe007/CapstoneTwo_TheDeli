package com.jt;

public class Drink extends Product{
    private String brand;

    public Drink(String name, float price, int quantity, String size, String brand) {
        super(name, price, quantity, size);
        this.brand = brand;
    }
}
