package com.jt;

import java.util.ArrayList;

public class Order {

    private ArrayList<Product> productList;

    public ArrayList<Product> getAllProducts() {
        return this.productList;
    }

    public ArrayList<Product> getProductList() {
        return this.productList;
    }

    public void addProduct(Product products) {
        this.productList.add(products);
    }


    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                '}';
    }
}
