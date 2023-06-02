package com.jt;

public class Product extends Order{
    private float price;
    private int quantity;

    public Product(float price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public  float getPrice() {
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


    @Override
    public String toString() {
        return "Order{ " +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

}

