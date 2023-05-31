package com.jt;

public class Chip extends Product {
    private String name;
    private String flavor;

    public Chip(String name, float price, int quantity, String flavor) {
        super(price, quantity);
        this.flavor = flavor;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Chip{" +
                "name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                '}';
    }

    public static float getPrice() {
        return 1.50f;
    }
}
