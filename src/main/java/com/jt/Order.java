package com.jt;

import java.util.ArrayList;

public class Order {

    private ArrayList<Product> productList;

    public Order() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                '}';
    }
}