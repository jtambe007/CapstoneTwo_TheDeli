package com.jt;

public class Chip extends Product{
    private String flavor;
    public Chip(String name, float price, int quantity, String flavor) {
        super(name, price, quantity);
        this.flavor = flavor;
    }
}
