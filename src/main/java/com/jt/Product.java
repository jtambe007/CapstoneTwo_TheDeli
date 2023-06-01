package com.jt;

public abstract class Product {
    private float price;
    private int quantity;
    private static int size;

    public Product(float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Product(float price, int quantity, int size) {
        this.price = price;
        this.quantity = quantity;
        Product.size = size;
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

    public static int getSize() {
        return size;
    }

    public void setSize(int size) {
        Product.size = size;
    }


    @Override
    public String toString() {
        return "Product{" + '\'' + ", price=" + price +
                ", quantity=" + quantity +
                ", size='" + size + '\'' +
                '}';
    }

}