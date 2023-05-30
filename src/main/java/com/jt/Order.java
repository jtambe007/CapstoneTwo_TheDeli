package com.jt;

import java.util.ArrayList;

public class Order {

    private ArrayList<Product> productList;

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                '}';
    }
}
