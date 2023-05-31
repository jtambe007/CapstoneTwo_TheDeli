package com.jt;
import java.util.ArrayList;
public class Order {

    private final ArrayList<Product> productList;

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                '}';
    }
    public Order() {
            this.productList = new ArrayList<>();
        }


    public void addProduct(Product product) {
        productList.add(product);
    }



}