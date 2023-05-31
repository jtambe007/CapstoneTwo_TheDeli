package com.jt;

public abstract class Product {
    private float price;
    private int quantity;
    private static String size;

    public Product(float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Product(float price, int quantity, String size) {
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }

    public static float getPrice() {
        return 0;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Product{" + '\'' + ", price=" + price +
                ", quantity=" + quantity +
                ", size='" + size + '\'' +
                '}';
    }
}