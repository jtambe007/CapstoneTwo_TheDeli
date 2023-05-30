package com.jt;

public class Chip extends Product{
    private String flavor;
    private String name;
    public Chip(float price, int quantity, String flavor) {
        super(price, quantity);
        this.name = name;
        this.flavor = flavor;
    }
}
