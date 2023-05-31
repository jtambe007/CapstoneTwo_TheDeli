package com.jt;

public class Drink extends Product{
    private String brand;

    public Drink(float price, int quantity, String size, String brand) {
        super(price, quantity, size);
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public static float getPrice() {
        float price;
        String size = Product.getSize();
        if (size == null) {
            return 0.0f;
        }
        if (size.equalsIgnoreCase("small")) {
            price = 2.00f;
        } else if (size.equalsIgnoreCase("medium")) {
            price = 2.50f;
        } else if (size.equalsIgnoreCase("large")) {
            price = 3.00f;
        } else {
            System.out.println("Sorry, that is an invalid size.");
        }
        return 0.0f;
    }
}
