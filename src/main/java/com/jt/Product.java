package com.jt;

public class Product extends Order{
    private float price;
    private int quantity;
    private String size;

    public Product(float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Product(float price, int quantity, String size) {
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }

    public float getPrice() {
        return price;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Order{" +
                ", price=" + price +
                ", quantity=" + quantity +
                ", size='" + size + '\'' +
                '}';
    }

}
